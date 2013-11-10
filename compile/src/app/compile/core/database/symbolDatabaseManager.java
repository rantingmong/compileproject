package app.compile.core.database;

import java.util.ArrayList;
import java.util.List;

public class symbolDatabaseManager
{
    private static symbolDatabaseManager            instance;
    
    public 	static symbolDatabaseManager            getInstance     ()
    {
        if (instance == null)
            instance = new symbolDatabaseManager();
        
        return instance;
    }
    
    
    private final           List<symbolDatabase>     databaseList;
    
    private                 symbolDatabaseManager   ()
    {
        databaseList = new ArrayList<symbolDatabase>();
    }
    
    public symbolDatabase   createDatabase          (String databaseName, symbolDatabase parent)
    {
        for (symbolDatabase entry : databaseList)
        {
            if (entry.databaseName.equals(databaseName))
                return entry;
        }
        
        symbolDatabase newDatabase = new symbolDatabase(databaseName, parent);
        databaseList.add(newDatabase);
        
        return newDatabase;
    }
    
    public void             removeDatabase          (String databaseName)
    {
        symbolDatabase toBeRemoved = null;
        
        for (symbolDatabase entry : databaseList)
        {
            if (entry.databaseName.equals(databaseName))
            {
                toBeRemoved = entry;
                break;
            }
        }
        
        if (toBeRemoved != null)
            databaseList.remove(toBeRemoved);
    }
    
    public symbolDatabase   getDatabase             (String databaseName)
    {
        for (symbolDatabase entry : databaseList)
        {
            if (entry.databaseName.equals(databaseName))
                return entry;
        }
        
        return null;
    }
}
