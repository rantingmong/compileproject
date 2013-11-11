package app.compile.database;

import java.util.ArrayList;

public class SymbolDatabase
{
    public SymbolDatabase                   parent      = null;
    
    public String                           scopeName   = "";
    public ArrayList<SymbolDatabaseEntry>   entries     = new ArrayList<SymbolDatabaseEntry>();
}
