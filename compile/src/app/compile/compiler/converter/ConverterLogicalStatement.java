package app.compile.compiler.converter;

import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.TerminalNode;

import app.compile.compiler.JalCompiler;
import app.compile.core.DataType;
import app.compile.core.FunctionInformation;
import app.compile.database.SymbolDatabaseEntry;
import app.compile.parser.codeParser;
import app.compile.parser.codeParser.Expression_finalContext;
import app.compile.parser.codeParser.Function_callContext;
import app.compile.util.ErrorReporter;
import app.compile.util.TypeCoercer;

public class ConverterLogicalStatement extends Converter
{
    public enum LogicNodeType
    {
        OPERATOR, VALUE
    }

    public class LogicNode
    {
        public LogicNode     lhs;
        public LogicNode     rhs;

        public LogicNode     parent;

        public String        label;
        public String        additionalData;

        public LogicNodeType nodeType;

        public DataType      type;
    }

    @Override
    public boolean              productionValid     (ParseTree parseTree)
    {
        return parseTree.getClass().equals(codeParser.Logical_statementContext.class);
    }

    @Override
    public String               process             (ParseTree parseTree, JalCompiler compiler)
    {
        return processLogicTree(parseTree, compiler);
    }

    /**
     * 
     * Processes the tree provided by ANTLR and converts it into il-code.
     * 
     * @param parseTree The parse tree to convert.
     * @param compiler Reference to the compilation unit that holds function information.
     * @param scope Variable scope.
     * @return Returns either resulting variable that this method use to convert or a constant if used against a constant type.
     */
    public String               processLogicTree    (ParseTree parseTree, JalCompiler compiler)
    {
        if      (parseTree instanceof Expression_finalContext)
        {
            // LEAF NODE
            if (parseTree.getChild(0) instanceof TerminalNode)
            {
                String checkText = parseTree.getChild(0).getText();
                
                // TODO: if child is a variable, resolve that using the symbol database
                SymbolDatabaseEntry entry = compiler.currentScope.find(checkText, false);

                if (entry != null)
                {
                    return entry.ilName;
                }
                else
                {
                    // try with ilnaming on
                    entry = compiler.currentScope.find(checkText, true);

                    if (entry != null)
                    {
                        return entry.ilName;
                    }
                }

                return checkText;
            }
            else
            {
                // FUNCTION CALL. HANDLE THAT FUNCTION CALL FIRST. AND RETURN THE VARIABLE MADE BY THE FUNCTION CALL,
                // which is RET.
                Function_callContext fcc = (Function_callContext)parseTree.getChild(0);
                FunctionInformation  fii = compiler.getFunction(fcc.ID().getText());

                if (fii != null)
                {
                    // just check if the function will not return a uhm yun.
                    if (fii.returnType == DataType.NOTHING)
                    {
                        ErrorReporter.reportError(fcc.ID().getSymbol(), "Cannot use function in a logical statement that returns nothing!");
                        return null;
                    }
                }
                
                return new ConverterFunctionCall().process(parseTree.getChild(0), compiler);
            }
        }
        else if (parseTree.getChildCount() == 1)
        {
            // for those nodes that only have one child
            return processLogicTree(parseTree.getChild(0), compiler);
        }
        else if (parseTree instanceof codeParser.Operator_bool1Context  ||
                 parseTree instanceof codeParser.Operator_bool2Context  ||
                 parseTree instanceof codeParser.Operator_bool3Context  ||
                 parseTree instanceof codeParser.Expression1Context     ||
                 parseTree instanceof codeParser.Expression2Context     ||
                 parseTree instanceof codeParser.Expression3Context)
        {
            // OPERATOR NODE
            
            // convert lhs and rhs to il-code
            String lhs = processLogicTree(parseTree.getChild(0), compiler);
            String rhs = processLogicTree(parseTree.getChild(2), compiler);

            if (lhs == null)
            {
                System.err.println("Error in left hand side operation. Check your syntax around " + parseTree.getChild(0).getText());
                
                return null;
            }

            if (rhs == null)
            {
                System.err.println("Error in right hand side operation. Check your syntax around " + parseTree.getChild(2).getText());
                
                return null;
            }

            // do lookup for lhs and rhs
            DataType lhsType = TypeCoercer.getDataType(compiler.currentScope, lhs, true);
            DataType rhsType = TypeCoercer.getDataType(compiler.currentScope, rhs, true);

            boolean correctType   = false;
            
            String      opr       = parseTree.getChild(1).getText().toUpperCase();
            DataType    finalType = DataType.NOTHING;
            
            switch (opr.toLowerCase())
            {
            case "equal":
                
                opr         = "EQL";
                
                finalType   = DataType.TORF;
                correctType = TypeCoercer.checkIfLogicallyCompatible(lhsType, rhsType);
                break;
            case "not_equal":
                
                opr         = "NQL";

                finalType   = DataType.TORF;
                correctType = TypeCoercer.checkIfLogicallyCompatible(lhsType, rhsType);
                break;
            case "or":
            case "and":
                
                finalType   = DataType.TORF;
                correctType = TypeCoercer.checkIfLogicallyCompatible(lhsType, rhsType);
                break;

            case "lt":
            case "gt":
            case "lte":
            case "gte":

                finalType   = DataType.TORF;
                correctType = TypeCoercer.checkIfArithmeticallyCompatible(lhsType, rhsType);                
                break;
            case "add":
            case "sub":
            case "mul":
            case "div":
                
                finalType   = TypeCoercer.coerceType(lhsType, rhsType);
                correctType = TypeCoercer.checkIfArithmeticallyCompatible(lhsType, rhsType);
                break;
            }
            
            if (!correctType)
            {
                System.err.println("LHS of type " + lhsType + " with RHS of type " + rhsType + " are not compatible with each other.");
                return null;
            }

            String var = "var" + compiler.curFunction.newVariable();

            // then we add this:
            // TODO: define type for var
            compiler.curFunction.ilCode.add("DEC" + " " + var + " " + finalType);
            compiler.curFunction.ilCode.add( opr  + " " + lhs + " " + rhs + " " + var);

            SymbolDatabaseEntry newEntry            = new SymbolDatabaseEntry();
                                newEntry.ilName     = var;
                                newEntry.dataType   = finalType;
                                
            compiler.currentScope.entries.add(newEntry);
            
            return var; // return the resulting variable
        }
        else if (parseTree instanceof codeParser.Operator_bool4Context  ||
                 parseTree instanceof codeParser.Expression5Context)
        {
            // PARENTHESIS NODE
            return processLogicTree(parseTree.getChild(1), compiler);
        }
        else if (parseTree instanceof codeParser.Operator_bool5Context  ||
                 parseTree instanceof codeParser.Expression4Context)
        {
            if (parseTree instanceof codeParser.Operator_bool5Context)
            {
                String ret = processLogicTree(parseTree.getChild(2), compiler);
                
                // NOT operator
                compiler.curFunction.ilCode.add("NOT " + ret);

                return ret;
            }
            else
            {
                String      res     = processLogicTree(parseTree.getChild(0), compiler);
                String      opr     = parseTree.getChild(1).getText().toLowerCase();

                DataType    resType = TypeCoercer.getDataType(compiler.currentScope, res, true);

                switch (opr)
                {
                case "subs":
                    opr = "sub";
                    break;
                case "adds":
                    opr = "add";
                    break;
                case "muls":
                    opr = "mul";
                    break;
                case "divs":
                    opr = "div";
                    break;
                }
                
                opr = opr.toUpperCase();
                
                String var = "var" + compiler.curFunction.newVariable();
                
                // UNARY operator
                compiler.curFunction.ilCode.add("DEC " + var + " " + resType);
                compiler.curFunction.ilCode.add("ASG " + var + " " + res);
                
                compiler.curFunction.ilCode.add(opr + " " + var + " 1");

                SymbolDatabaseEntry newEntry            = new SymbolDatabaseEntry();
                                    newEntry.ilName     = var;
                                    newEntry.dataType   = resType;
                                    
                compiler.currentScope.entries.add(newEntry);
                
                return var;
            }
        }

        return null;
    }
}
