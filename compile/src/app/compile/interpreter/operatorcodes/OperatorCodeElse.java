package app.compile.interpreter.operatorcodes;

import java.util.ArrayList;

import app.compile.interpreter.ProgramState;
import app.compile.interpreter.Interpreter.FuncCodeEntry;
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
            FuncCodeEntry   functionHandle  = state.program.getFunction(functionStack.functionName);

            for (int i = functionStack.programCounter; i < functionHandle.ilCode.size(); i++)
            {
                if (functionHandle.ilCode.get(i).toLowerCase().contains("ENDIF"))
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
