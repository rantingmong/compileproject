package app.compile.interpreter.operatorcodes;

import java.util.ArrayList;

import app.compile.core.DataValue;
import app.compile.interpreter.ProgramState;
import app.compile.interpreter.ProgramState.FuncStackEntry;
import app.compile.util.ValueGetter;

public class OperatorCodeElseIf extends OperatorCode
{
    @Override
    public boolean incrementHandled()
    {
        return true;
    }
    
    @Override
    public String getOperatorCode()
    {
        return "ELSEIF";
    }

    @Override
    public void process(ProgramState state, ArrayList<String> opCodeArgs)
    {
        if (state.CONDITIONAL_STACK.peek())
        {
            // conditional already processed! find ENDIF and continue execution after that line
            FuncStackEntry functionStack = state.FUNCTION_STACK.peek();

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
            DataValue entry = ValueGetter.getValue(opCodeArgs.get(0), state, state.currentScope);

            if (entry.valueAsTorf())
            {
                state.CONDITIONAL_STACK.push(true);
                state.FUNCTION_STACK.peek().programCounter += 1;
            }
            // we find nearest ELSEIF, ELSE, ENDIF
            else
            {
                state.CONDITIONAL_STACK.push(false);

                FuncStackEntry functionStack = state.FUNCTION_STACK.peek();

                for (int i = functionStack.programCounter; i < functionStack.functionInfoHandle.ilCode.size(); i++)
                {
                    if (functionStack.functionInfoHandle.ilCode.get(i).toLowerCase().contains("elseif")   ||
                        functionStack.functionInfoHandle.ilCode.get(i).toLowerCase().contains("else")     ||
                        functionStack.functionInfoHandle.ilCode.get(i).toLowerCase().contains("endif"))
                    {
                        functionStack.programCounter = i;
                        break;
                    }
                }
            }
        }
    }
}
