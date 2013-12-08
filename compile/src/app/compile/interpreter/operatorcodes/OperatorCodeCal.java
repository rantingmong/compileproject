package app.compile.interpreter.operatorcodes;

import java.util.ArrayList;

import app.compile.database.SymbolDatabase;
import app.compile.interpreter.ProgramState;
import app.compile.interpreter.ProgramState.FuncStackEntry;

public class OperatorCodeCal extends OperatorCode
{
    @Override
    public String getOperatorCode()
    {
        return "CAL";
    }

    @Override
    public void process(ProgramState state, ArrayList<String> opCodeArgs)
    {
        if (state.program.findFunction(opCodeArgs.get(0)))
        {
            SymbolDatabase  functionDatabase        = new SymbolDatabase();
                            functionDatabase.parent = state.currentScope;
            
            FuncStackEntry  newEntry                    = state.new FuncStackEntry();
                            newEntry.functionName       = opCodeArgs.get(0);
                            newEntry.programCounter     = 0;
                            newEntry.functionScope      = functionDatabase;

                            newEntry.functionInfoHandle = state.program.getFunction(opCodeArgs.get(0));

            // change scope
            state.currentScope = functionDatabase;

            // populate argument list
            for (int i = 0; i < 20; i++)
            {
                newEntry.ARGS_LIST[i] = state.FUNCTION_STACK.peek().PARAM_LIST[i];
            }

            // check if we're dealing with native methods
            if (newEntry.functionInfoHandle.isNative)
            {
                state.FUNCTION_STACK.push(newEntry);

                if (newEntry.functionInfoHandle.nativeAction != null)
                    newEntry.functionInfoHandle.nativeAction.execute(state, functionDatabase);

                state.FUNCTION_STACK.pop();
            }
            else
            {
                // change program counter
                state.FUNCTION_STACK.push(newEntry);
            }
            
            state.currentScope = functionDatabase.parent;
        }
        else
        {
            // TODO: error handling
        }
    }
}
