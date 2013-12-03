package app.compile.interpreter.operatorcodes;

import java.util.ArrayList;

import app.compile.core.DataValue;
import app.compile.interpreter.ProgramState;
import app.compile.interpreter.ProgramState.FuncStackEntry;
import app.compile.util.ValueGetter;

public class OperatorCodeJmp extends OperatorCode
{
    @Override
    public boolean      incrementHandled    ()
    {
        return true;
    }
    
    @Override
    public String       getOperatorCode     ()
    {
        return "JMP";
    }

    @Override
    public void         process             (ProgramState state, ArrayList<String> opCodeArgs)
    {
        DataValue entry = ValueGetter.getValue(opCodeArgs.get(0), state, state.currentScope); 

        if (entry.valueAsTorf())
        {
            // search for jump
            FuncStackEntry  functionStack   = state.FUNCTION_STACK.peek();
            String          searchQuery     = opCodeArgs.get(1) + ":";
            
            for (int i = 0; i < functionStack.functionInfoHandle.ilCode.size(); i++)
            {
                if (searchQuery.equals(functionStack.functionInfoHandle.ilCode.get(i)))
                {
                    functionStack.programCounter = i;
                    break;
                }
            }
        }
        else
        {
            // we just increment program counter by 1
            state.FUNCTION_STACK.peek().programCounter += 1;
        }
    }
}
