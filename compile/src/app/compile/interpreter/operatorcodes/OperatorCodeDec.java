package app.compile.interpreter.operatorcodes;

import java.util.ArrayList;

import app.compile.core.DataType;
import app.compile.database.SymbolDatabase;
import app.compile.database.SymbolDatabaseEntry;
import app.compile.database.SymbolDatabaseEntryType;
import app.compile.interpreter.ProgramState;

public class OperatorCodeDec extends OperatorCode
{
    @Override
    public String getOperatorCode()
    {
        return "DEC";
    }

    @Override
    public void process(ProgramState state, SymbolDatabase currentScope, ArrayList<String> opCodeArgs)
    {
        // TODO: error check if there are dupes

        SymbolDatabaseEntry newEntry            = new SymbolDatabaseEntry();
                            newEntry.dataType   = Enum.valueOf(DataType.class, opCodeArgs.get(1));
                            newEntry.entryType  = SymbolDatabaseEntryType.VARIABLE;
                            newEntry.name       = opCodeArgs.get(0);
                            
        currentScope.entries.add(newEntry);
    }
}
