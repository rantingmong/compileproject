package app.compile.interpreter.operatorcodes;

import java.util.ArrayList;

import app.compile.core.DataValue;
import app.compile.database.SymbolDatabase;
import app.compile.interpreter.ProgramState;
import app.compile.interpreter.Interpreter.FuncCodeEntry;
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

            FuncStackEntry  functionStack   = state.FUNCTION_STACK.peek();
            FuncCodeEntry   functionHandle  = state.program.getFunction(functionStack.functionName);

            for (int i = functionStack.programCounter; i < functionHandle.ilCode.size(); i++)
            {
                if (functionHandle.ilCode.get(i).toLowerCase().contains("ELSEIF")   ||
                    functionHandle.ilCode.get(i).toLowerCase().contains("ELSE")     ||
                    functionHandle.ilCode.get(i).toLowerCase().contains("ENDIF"))
                {
                    functionStack.programCounter = i;
                    break;
                }
            }
        }
    }
}
