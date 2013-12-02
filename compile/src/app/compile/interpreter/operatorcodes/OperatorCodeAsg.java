package app.compile.interpreter.operatorcodes;

import java.util.ArrayList;

import app.compile.core.DataValue;
import app.compile.database.SymbolDatabaseEntry;
import app.compile.interpreter.ProgramState;

public class OperatorCodeAsg extends OperatorCode
{
    @Override
    public String getOperatorCode()
    {
        return "asg";
    }

    @Override
    public void process(ProgramState state, ArrayList<String> opCodeArgs)
    {
        SymbolDatabaseEntry modifyEntry = state.currentScope.find(opCodeArgs.get(0));
        
        if (modifyEntry != null)
        {
            modifyEntry.dataValue = new DataValue(modifyEntry.dataType, opCodeArgs.get(1)); 
        }
        else
        {
            // TODO: error handling
        }
    }
}
