package app.compile.compiler.converter;

import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.TerminalNode;

import app.compile.compiler.JalCompiler;
import app.compile.core.DataType;
import app.compile.database.SymbolDatabaseEntry;
import app.compile.parser.codeParser;
import app.compile.parser.codeParser.Expression_finalContext;

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
                // TODO: if child is a variable, resolve that using the symbol database
                SymbolDatabaseEntry entry = compiler.currentScope.find(parseTree.getChild(0).getText());
                
                if (entry != null)
                {
                    return entry.ilName;
                }
                
                return parseTree.getChild(0).getText();
            }
            else
            {
                // FUNCTION CALL. HANDLE THAT FUNCTION CALL FIRST. AND RETURN THE VARIABLE MADE BY THE FUNCTION CALL,
                // which is RET.
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

            String opr = parseTree.getChild(1).getText();

            String var = "var" + compiler.curFunction.newVariable();

            // then we add this:

            // TODO: define type for var
            compiler.curFunction.ilCode.add("DEC " + var + " NOTHING");
            compiler.curFunction.ilCode.add(opr + " " + lhs + " " + rhs + " " + var);

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
                String res = processLogicTree(parseTree.getChild(0), compiler);
                String opr = parseTree.getChild(1).getText();

                String var = "var" + compiler.curFunction.newVariable();
                
                // UNARY operator
                compiler.curFunction.ilCode.add("DEC " + var + " NOTHING");
                compiler.curFunction.ilCode.add("ASG " + var + " " + res);
                
                compiler.curFunction.ilCode.add(opr + " " + var + " 1");
                
                return var;
            }
        }

        return null;
    }
}
