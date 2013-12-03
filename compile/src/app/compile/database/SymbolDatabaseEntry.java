package app.compile.database;

import app.compile.core.DataType;
import app.compile.core.DataValue;

public class SymbolDatabaseEntry
{
    public String                   name;
    
    public String                   ilName;
    
    public DataType                 dataType;
    public DataValue                dataValue;
    
    public SymbolDatabaseEntryType  entryType;
}
