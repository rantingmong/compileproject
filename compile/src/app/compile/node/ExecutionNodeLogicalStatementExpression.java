package app.compile.node;

import java.util.Stack;

import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.TerminalNode;

import app.compile.core.*;
import app.compile.logic.LogicNode;
import app.compile.logic.LogicNodeType;
import app.compile.parser.codeParser;
import app.compile.parser.codeParser.*;

public class ExecutionNodeLogicalStatementExpression extends ExecutionNode
{
    @Override
    public boolean      IsValid                     (ParseTree entry)
    {
        return entry instanceof Logical_statementContext;
    }

    @Override
    public void         Evaluate                    (Program program, ProgramState state, ParseTree parseTree)
    {
        System.out.println("Evaluating logical expression.");
        
        // convert the parse tree into a binary tree :O
        LogicNode           logicTree       = convertParseTreeToLogicTree(program, state, null, parseTree);
        LogicNode           curNode         = logicTree;

        boolean             allProcessed    = false;
        
        Stack<String>       opStack         = new Stack<String>();
        Stack<DataValue>    valueStack      = new Stack<DataValue>();
        
        // walk through that tree in a prefix notation
        
        // we set the result to state.returnValue
    }
    
    private LogicNode   convertParseTreeToLogicTree (Program program, ProgramState state, LogicNode parent, ParseTree parseTree)
    {
        if (parseTree instanceof Expression_finalContext)
        {
            LogicNode   lfNode                  = new LogicNode();
            
                        lfNode.parent           = parent;
            
                        lfNode.type             = LogicNodeType.VALUE;
                        lfNode.data             = inferFinalType(program, state, parseTree.getChild(0));
                        
                        lfNode.additionalData   = "";
                        
                        lfNode.leftSide         = null;
                        lfNode.rightSide        = null;
                        
                        lfNode.operator         = "";
                        
            return lfNode;
        }
        else
        {
            int childCount = parseTree.getChildCount();
               
            if      (childCount == 1)
            {
                return convertParseTreeToLogicTree(program, state, parent, parseTree.getChild(0));
            }
            else if (childCount == 2)
            {
                // a self increment operator node
                LogicNode   siNode                  = new LogicNode();
                
                            siNode.parent           = parent;
                
                            siNode.type             = LogicNodeType.VALUE;
                            siNode.data             = inferFinalType(program, state, parseTree.getChild(0));
                            
                            siNode.additionalData   = parseTree.getChild(1).getText();
                            
                            siNode.leftSide         = null;
                            siNode.rightSide        = null;
                            
                            siNode.operator         = "";
                            
                return siNode;
            }
            else if (childCount == 3)
            {
                if (!(parseTree instanceof Operator_bool4Context))
                {
                    LogicNode   neNode                  = new LogicNode();
                    
                                neNode.parent           = parent;
                                
                                neNode.type             = LogicNodeType.OPERATOR;
                                neNode.data             = null;
                                
                                neNode.additionalData   = "";
                                
                                neNode.leftSide         = convertParseTreeToLogicTree(program, state, neNode, parseTree.getChild(0));
                                neNode.rightSide        = convertParseTreeToLogicTree(program, state, neNode, parseTree.getChild(2));
                    
                                neNode.operator         = parseTree.getChild(1).getText();
                                
                    return neNode;
                }
                
                return convertParseTreeToLogicTree(program, state, parent, parseTree.getChild(1));
            }
            else if (childCount == 4)
            {
                LogicNode   noNode              = new LogicNode();
            
                            noNode.parent           = parent;
                
                            noNode.type             = LogicNodeType.VALUE;
                            noNode.data             = inferFinalType(program, state, parseTree.getChild(2));
                            
                            noNode.additionalData   = "NOT";
                            
                            noNode.leftSide         = null;
                            noNode.rightSide        = null;
                            
                            noNode.operator         = "";
                            
                return noNode;
            }
            else
            {
                System.err.println("This should not happen.");
                
                return null;
            }
        }
    }
    
    private DataValue   inferFinalType              (Program program, ProgramState state, ParseTree input)
    {
        // this converts something to something. Joke. This finalizes function calls,
        // and sub logical expressions
        
        if      (input instanceof TerminalNode)
        {
            TerminalNode    terminalNode    = (TerminalNode)input;
            String          dataType        = "";
            
            switch (terminalNode.getSymbol().getType())
            {
            case codeParser.NUM:
                
                try
                {
                    Integer.parseInt(terminalNode.getText());
                    dataType = "WHOLE_NUMBER";
                }
                catch(NumberFormatException exp)
                {
                    dataType = "REAL_NUMBER";
                }
                break;
            case codeParser.STRING:
                
                if (terminalNode.getText().length() > 1)
                    dataType = "CHARACTERS";
                else
                    dataType = "SYMBOL";
                break;
            case codeParser.TOKEN_TORF:
                
                dataType = "TORF";
                break;
            default:
                
                System.err.println("Terminal node is not a data type.");
                dataType = "NOTHING";
                break;
            }
            
            return new DataValue(Enum.valueOf(DataType.class, dataType), terminalNode.getText());
        }
        else if (input instanceof Logical_statementContext)
        {
            ExecutionNodeLogicalStatementExpression logicalStatement = new ExecutionNodeLogicalStatementExpression();
            logicalStatement.Evaluate(program, state, input);
            
            return state.returnValue;
        }
        else if (input instanceof Function_callContext)
        {
            ExecutionNodeFunctionCall functionCall = new ExecutionNodeFunctionCall();
            functionCall.Evaluate(program, state, input);
            
            return state.returnValue;
        }
        else
        {
            return inferFinalType(program, state, input.getChild(0));
        }
    }

    @Override
    public boolean      ProcessChildren             ()
    {
        return false;
    }
}
