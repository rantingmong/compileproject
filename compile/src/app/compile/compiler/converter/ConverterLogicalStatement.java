package app.compile.compiler.converter;

import java.util.ArrayList;

import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.TerminalNode;

import app.compile.core.DataType;
import app.compile.database.SymbolDatabase;
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

    private ArrayList<String>   ilCode              = new ArrayList<String>();
    
    @Override
    public boolean              processChildren     ()
    {
        return false;
    }

    @Override
    public boolean              productionValid     (ParseTree parseTree)
    {
        return parseTree.getClass().equals(codeParser.Logical_statementContext.class);
    }

    @Override
    public ConverterResult    process             (ParseTree parseTree, Compiler compiler, SymbolDatabase scope)
    {
        ConverterResult cr                  = new ConverterResult();
                        cr.emmittedCode     = ilCode;
                        cr.variableHandle   = processLogicTree(parseTree, compiler, scope);

        return cr;
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
    public String               processLogicTree    (ParseTree parseTree, Compiler compiler, SymbolDatabase scope)
    {
        if      (parseTree.getChildCount() == 1)
        {
            // for those nodes that only have one child
            return processLogicTree(parseTree.getChild(0), compiler, scope);
        }
        else if (parseTree instanceof Expression_finalContext)
        {
            // LEAF NODE
            if (parseTree.getChild(0) instanceof TerminalNode)
            {
                return parseTree.getChild(0).getText();
            }
            else
            {
                // FUNCTION CALL. HANDLE THAT FUNCTION CALL FIRST. AND RETURN THE VARIABLE MADE BY THE FUNCTION CALL,
                // which is RET.
                new ConverterFunctionCall().process(parseTree.getChild(0), compiler, scope);
                
                return "RET";
            }
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
            String lhs = processLogicTree(parseTree.getChild(0), compiler, scope);
            String rhs = processLogicTree(parseTree.getChild(2), compiler, scope);

            String opr = parseTree.getChild(1).getText();

            // then we add this:
            ilCode.add("DEC" + " " + "temp0 " + "NOTHING"); // TODO: change temp0 into something that's really working
            ilCode.add(opr + " " + lhs + " " + rhs + " " + "temp0");
            
            return "temp0"; // return the resulting variable
        }
        else if (parseTree instanceof codeParser.Operator_bool4Context  ||
                 parseTree instanceof codeParser.Expression5Context)
        {
            // PARENTHESIS NODE
            return processLogicTree(parseTree.getChild(1), compiler, scope);
        }
        else if (parseTree instanceof codeParser.Operator_bool5Context  ||
                 parseTree instanceof codeParser.Expression4Context)
        {
            if (parseTree instanceof codeParser.Operator_bool5Context)
            {
                String ret = processLogicTree(parseTree.getChild(2), compiler, scope);
                
                // NOT operator
                ilCode.add("NOT " + ret);
                
                return ret;
            }
            else
            {
                String res = processLogicTree(parseTree.getChild(0), compiler, scope);
                String opr = parseTree.getChild(1).getText();
                
                // UNARY operator
                ilCode.add("DEC " + "temp0" + "NOTHING");
                ilCode.add("ASG " + "temp0 " + res);
                
                ilCode.add(opr + " " + "temp0 1");
                
                return "temp0";
            }
        }
        
        return null;
    }
}
