package app.compile.interpreter.operatorcodes;

import java.util.ArrayList;

import app.compile.core.DataValue;
import app.compile.interpreter.ProgramState;
import app.compile.interpreter.ProgramState.FuncStackEntry;
import app.compile.util.ValueGetter;

public class OperatorCodeCase extends OperatorCode
{
    @Override
    public String getOperatorCode()
    {
        return "CASE";
    }

    @Override
    public void process(ProgramState state, ArrayList<String> opCodeArgs)
    {
        if (state.CONDITIONAL_STACK.peek())
        {
            // find endswitch statement
            FuncStackEntry funcEntry = state.FUNCTION_STACK.peek();
            
            for (int i = funcEntry.programCounter; i < funcEntry.functionInfoHandle.ilCode.size(); i++)
            {
                if (funcEntry.functionInfoHandle.ilCode.get(i).toLowerCase().contains("ENDSWITCH"))
                {
                    funcEntry.programCounter = i;
                    break;
                }
            }
        }
        else
        {
            DataValue result = ValueGetter.getValue(opCodeArgs.get(0), state, state.currentScope);
            
            if (result.valueAsTorf())
            {
                state.CONDITIONAL_STACK.pop();
                state.CONDITIONAL_STACK.push(true);
                
                state.FUNCTION_STACK.peek().programCounter += 1;
            }
            else
            {
                // find next case or default statement
                FuncStackEntry  funcEntry   = state.FUNCTION_STACK.peek();
                
                for (int i = funcEntry.programCounter; i < funcEntry.functionInfoHandle.ilCode.size(); i++)
                {
                    if (funcEntry.functionInfoHandle.ilCode.get(i).toLowerCase().contains("CASE") ||
                        funcEntry.functionInfoHandle.ilCode.get(i).toLowerCase().contains("DEFAULT"))
                    {
                        funcEntry.programCounter = i;
                        break;
                    }
                }
            }
        }
    }
}
