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
                if (entry.name.equals(name))
                {
                    modifyEntry = entry;

                    break;
                }
            }

            database = database.parent;

        } while (database.parent != null);

        return modifyEntry;
    }
}
