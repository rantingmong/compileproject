package app.compile.productions;

import java.util.ArrayList;
import java.util.List;

public class productionEntryManager
{
    private static  productionEntryManager  instance        = new productionEntryManager();
    
    public static   productionEntryManager  getInstance     ()
    {
        return instance;
    }
    
    
    public final    List<production>        productions     = new ArrayList<production>();
    
    private         productionEntryManager  ()
    {
        productions.add(new productionsFunctionCall());
    }
}
