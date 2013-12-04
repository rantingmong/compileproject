package app.compile.database;

import java.util.ArrayList;

public class SymbolDatabase
{
    public SymbolDatabase                 parent    = null;

    public String                         scopeName = "";
    public ArrayList<SymbolDatabaseEntry> entries   = new ArrayList<SymbolDatabaseEntry>();

    public SymbolDatabaseEntry            find      (String name)
    {
        SymbolDatabase      database    = this;
        SymbolDatabaseEntry modifyEntry = null;

        do
        {
            for (SymbolDatabaseEntry entry : database.entries)
            {
                if (entry.name != null && entry.name.equals(name))
                {
                    modifyEntry = entry;

                    break;
                }
            }

            database = database.parent;

        } while (database != null);

        return modifyEntry;
    }
    
    public SymbolDatabaseEntry find(String name, boolean findIlName)
    {
        if (!findIlName)
        {
            return find(name);
        }
        
        SymbolDatabase      database    = this;
        SymbolDatabaseEntry modifyEntry = null;

        do
        {
            for (SymbolDatabaseEntry entry : database.entries)
            {
                if (entry.ilName.equals(name))
                {
                    modifyEntry = entry;

                    break;
                }
            }

            database = database.parent;

        } while (database != null);

        return modifyEntry;
    }
}
