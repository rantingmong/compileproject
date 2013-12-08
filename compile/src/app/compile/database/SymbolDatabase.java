package app.compile.database;

import java.util.ArrayList;

public class SymbolDatabase
{
    public class SymbolDatabaseList extends ArrayList<SymbolDatabaseEntry>
    {
        private static final long serialVersionUID = 1234;

        @Override
        public boolean add(SymbolDatabaseEntry arg0)
        {
            if (contains(arg0))
            {
                return false;
            }

            return super.add(arg0);
        }
    }

    public SymbolDatabase     parent    = null;

    public String             scopeName = "";
    public SymbolDatabaseList entries   = new SymbolDatabaseList();

    public SymbolDatabaseEntry find(String name)
    {
        SymbolDatabase database = this;
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

        SymbolDatabase database = this;
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
