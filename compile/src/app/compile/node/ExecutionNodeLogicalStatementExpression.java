package app.compile.node;

import java.util.Collections;
import java.util.Stack;

import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.TerminalNode;

import app.compile.core.*;
import app.compile.logic.LogicNode;
import app.compile.logic.LogicNodeType;
import app.compile.operators.ValueOperator;
import app.compile.operators.ValueOperatorManager;
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

        Stack<String>       opStack         = new Stack<String>();
        Stack<DataValue>    valueStack      = new Stack<DataValue>();
        
        Stack<LogicNode>    nodeStack       = new Stack<LogicNode>();
        
        nodeStack.push(logicTree);
        
        // walk through that tree in a prefix notation
        while (nodeStack.size() > 0)
        {
            LogicNode curNode = nodeStack.peek();
            
            if      (curNode.leftSide != null && curNode.leftSide.visited == false)
            {
                // visit left child node
                nodeStack.push(curNode.leftSide);
            }
            else if (curNode.rightSide != null && curNode.rightSide.visited == false)
            {
                // visit right child node
                nodeStack.push(curNode.rightSide);
            }
            else if (curNode.leftSide == null && curNode.rightSide == null)
            {
                // leaf node
                LogicNode   leafNode            = nodeStack.pop();
                
                            leafNode.visited    = true;
                            
                // add this node to the value stack
                valueStack.push(leafNode.data);
                
                System.out.println("Leaf");
            }
            else if (curNode.leftSide != null && curNode.rightSide != null &&
                     curNode.leftSide.visited && curNode.rightSide.visited)
            {
                LogicNode   opNode              = nodeStack.pop();
                            opNode.visited      = true;
            
                            // add this node to the operator stack
                            opStack.push(opNode.operator);
                            
                            // process this node!
                            valueStack.push(processValue(opStack, valueStack));

                System.out.println("Parent");
            }
        }
        
        // we set the result to state.returnValue
        System.out.println(opStack.size());
        System.out.println(valueStack.size());
        
        state.returnValue = valueStack.pop(); 
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
                DataValue   result                  = inferFinalType(program, state, parseTree.getChild(2));
                
                if (result == null)
                {
                    System.err.println("Result is unknown!");
                    
                    result = new DataValue(DataType.TORF, "false");
                }
                else
                {
                    if (result.getDataType() == DataType.TORF)
                    {
                        result = new DataValue(DataType.TORF, !result.valueAsTorf() + "");
                    }
                }
                
                LogicNode   noNode                  = new LogicNode();
            
                            noNode.parent           = parent;
                
                            noNode.type             = LogicNodeType.VALUE;
                            noNode.data             = result; 
                            
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
        else if (input instanceof Function_callContext)
        {
            Function_callContext fcc = (Function_callContext)input;
            
            // return type checking
            String              fName = fcc.ID().getText();
            FunctionInformation fInfo = null;
            
            for (FunctionInformation functionInfo : program.functionInformation)
            {
                if (fName.equals(functionInfo.functionName))
                {
                    fInfo = functionInfo;
                    break;
                }
            }
            
            if (fInfo != null && fInfo.returnType != DataType.NOTHING)
            {
                ExecutionNodeFunctionCall functionCall = new ExecutionNodeFunctionCall();
                functionCall.Evaluate(program, state, input);
                
                return state.returnValue;       
            }
            else if (fInfo == null)
            {
                System.err.println("Function " + fName + " cannot be found!");
            }
            else if (fInfo.returnType == DataType.NOTHING)
            {
                System.err.println("Function " + fName + " returns data type 'NOTHING' which is not allowed!");
            }
            
            return new DataValue(DataType.NOTHING, "");
        }
        else if (input instanceof Logical_statementContext)
        {
            ExecutionNodeLogicalStatementExpression logicalStatement = new ExecutionNodeLogicalStatementExpression();
            logicalStatement.Evaluate(program, state, input);
            
            return state.returnValue;
        }
        else
        {
            return inferFinalType(program, state, input.getChild(0));
        }
    }

    private DataValue   processValue                (Stack<String> op, Stack<DataValue> value)
    {
        String      operator    = op.pop();
        
        DataValue   rhs         = value.pop();
        DataValue   lhs         = value.pop();
        
        System.out.println("OPT: " + operator);
        
        System.out.println("LHS: " + (lhs != null ? lhs.valueAsString() + " " + lhs.getDataType().toString() : "NULL LHS"));
        System.out.println("RHS: " + (rhs != null ? rhs.valueAsString() + " " + rhs.getDataType().toString() : "NULL RHS"));
        
        for (ValueOperator item : ValueOperatorManager.getInstance().getOperators())
        {
            if (item.IsOperator(operator))
            {
                DataValue finalValue = item.Process(lhs, rhs);
                
                System.out.println(operator + " result is: " + finalValue.valueAsString());
                
                return finalValue;
            }
        }
        
        System.err.println("Operator not handled! Uh-oh...");
        
        return new DataValue(DataType.CHARACTERS, "Placeholder_" + operator);
    }
    
    @Override
    public boolean      ProcessChildren             ()
    {
        return false;
    }
}
