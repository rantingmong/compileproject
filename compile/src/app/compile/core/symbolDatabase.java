package app.compile.core;

import java.util.ArrayList;
import java.util.List;

public class symbolDatabase
{
    /*
     * The symbol database holds variable information.
     * 
     * The entry 'parentSymbolDatabase' is there so that we can track variables declared a level
     * higher than the scope this symbol database is declared.
     */
    
    public String                       databaseName;
    public symbolDatabase               parentSymbolDatabase;
    
    public List<symbolDatabaseEntry>    entries;
    
    public symbolDatabase               (String name, symbolDatabase parent)
    {
        databaseName            = name;
        parentSymbolDatabase    = parent;
        
        entries                 = new ArrayList<symbolDatabaseEntry>();
    }
}
