package app.compile.interpreter.operatorcodes;

import java.util.ArrayList;

import app.compile.interpreter.ProgramState;
import app.compile.interpreter.ProgramState.FuncStackEntry;

public class OperatorCodeElse extends OperatorCode
{
    @Override
    public boolean incrementHandled()
    {
        return true;
    }
    
    @Override
    public String getOperatorCode()
    {
        // TODO Auto-generated method stub
        return "ELSE";
    }

    @Override
    public void process(ProgramState state, ArrayList<String> opCodeArgs)
    {
        if (state.CONDITIONAL_STACK.peek())
        {
            // conditional already processed! find ENDIF and continue execution after that line
            FuncStackEntry  functionStack   = state.FUNCTION_STACK.peek();

            for (int i = functionStack.programCounter; i < functionStack.functionInfoHandle.ilCode.size(); i++)
            {
                if (functionStack.functionInfoHandle.ilCode.get(i).toLowerCase().contains("endif"))
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
