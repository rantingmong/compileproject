package app.compile.interpreter.operatorcodes;

import java.util.ArrayList;

import app.compile.core.DataValue;
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
            
            FuncStackEntry  newEntry                    = state.new FuncStackEntry();
                            newEntry.functionName       = opCodeArgs.get(0);
                            newEntry.programCounter     = 0;
                            newEntry.functionScope      = functionDatabase;

                            newEntry.functionInfoHandle = state.program.getFunction(opCodeArgs.get(0));

            // change scope
            state.currentScope = functionDatabase;

            // populate argument list
            state.ARGS_LIST.clear();
            
            for (DataValue value : state.PARAM_LIST)
            {
                state.ARGS_LIST.add(value);
            }

            // check if we're dealing with native methods
            if (newEntry.functionInfoHandle.isNative)
            {
                // execute native method, we don't have to push this to the stack as the native method finishes
                // immediately
                if (newEntry.functionInfoHandle.nativeAction != null)
                    newEntry.functionInfoHandle.nativeAction.execute(state, functionDatabase);
            }
            else
            {
                // change program counter
                state.FUNCTION_STACK.push(newEntry);
            }
        }
        else
        {
            // TODO: error handling
        }
    }
}
