package app.compile.interpreter.operatorcodes;

import java.util.ArrayList;

import app.compile.core.FunctionInformation;
import app.compile.interpreter.ProgramState;
import app.compile.interpreter.ProgramState.FuncStackEntry;

public class OperatorCodeDefault extends OperatorCode
{
    @Override
    public String getOperatorCode()
    {
        // TODO Auto-generated method stub
        return "DEFAULT";
    }

    @Override
    public void process(ProgramState state, ArrayList<String> opCodeArgs)
    {
        if (state.CONDITIONAL_STACK.peek())
        {
            // conditional already processed! find endswitch and continue execution after that line
            FuncStackEntry      functionStack   = state.FUNCTION_STACK.peek();
            FunctionInformation functionHandle  = state.program.getFunction(functionStack.functionName);

            for (int i = functionStack.programCounter; i < functionHandle.ilCode.size(); i++)
            {
                if (functionHandle.ilCode.get(i).toLowerCase().contains("endswitch"))
                {
                    functionStack.programCounter = i;
                    break;
                }
            }
        }
        else
        {
            // just go to next line
            state.CONDITIONAL_STACK.pop();
            state.CONDITIONAL_STACK.push(true);
            
            state.FUNCTION_STACK.peek().programCounter += 1;
        }
    }
}
