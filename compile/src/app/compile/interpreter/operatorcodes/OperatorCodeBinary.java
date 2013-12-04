package app.compile.interpreter.operatorcodes;

import java.util.ArrayList;

import app.compile.core.DataValue;
import app.compile.database.SymbolDatabaseEntry;
import app.compile.interpreter.ProgramState;
import app.compile.util.ValueGetter;

public abstract class OperatorCodeBinary extends OperatorCode
{
    @Override
    public void process(ProgramState state, ArrayList<String> opCodeArgs)
    {
        SymbolDatabaseEntry destination = state.currentScope.find(opCodeArgs.get(2));
        
        DataValue lhs           = ValueGetter.getValue(opCodeArgs.get(0), state, state.currentScope);
        DataValue rhs           = ValueGetter.getValue(opCodeArgs.get(1), state, state.currentScope);

        DataValue returnValue   = performOperation(lhs, rhs);
        
        if (returnValue == null)
        {
            // TODO: error handling
        }
        else
        {
            destination.dataType    = returnValue.getDataType();
            destination.dataValue   = returnValue;
        }
    }

    public abstract DataValue performOperation(DataValue lhs, DataValue rhs);
}
