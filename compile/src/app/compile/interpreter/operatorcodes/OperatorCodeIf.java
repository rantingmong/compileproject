package app.compile.interpreter.operatorcodes;

import java.util.ArrayList;

import app.compile.core.DataValue;
import app.compile.database.SymbolDatabase;
import app.compile.interpreter.ProgramState;
import app.compile.interpreter.ProgramState.FuncStackEntry;
import app.compile.util.ValueGetter;

public class OperatorCodeIf extends OperatorCode
{
    @Override
    public boolean incrementHandled()
    {
        return true;
    }

    @Override
    public String getOperatorCode()
    {
        return "IF";
    }

    @Override
    public void process(ProgramState state, ArrayList<String> opCodeArgs)
    {
        DataValue       entry       = ValueGetter.getValue(opCodeArgs.get(0), state, state.currentScope);
        
        SymbolDatabase  ifDatabase          = new SymbolDatabase();
                        ifDatabase.parent   = state.currentScope;
        
        state.currentScope = ifDatabase;
                        
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
                if (functionStack.functionInfoHandle.ilCode.get(i).toLowerCase().contains("ELSEIF")   ||
                    functionStack.functionInfoHandle.ilCode.get(i).toLowerCase().contains("ELSE")     ||
                    functionStack.functionInfoHandle.ilCode.get(i).toLowerCase().contains("ENDIF"))
                {
                    functionStack.programCounter = i;
                    break;
                }
            }
        }
    }
}
