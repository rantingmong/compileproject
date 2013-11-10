package app.compile.intermediate;

import java.util.ArrayList;
import java.util.List;

import app.compile.core.database.symbolDatabase;
import app.compile.core.database.symbolEntryValue;
import app.compile.intermediate.opcode.opCode;

public class intermediateEntry
{
    /*
     * This class defines an intermediate code entry. It contains the op-code and the
     * input list.
     * 
     * This class also has reference to the symbol database of the function with
     * captures.
     */

    public String                   jumpKeyword;
    public symbolDatabase           scope;
    
    public opCode                   opCode;
    
    public List<symbolEntryValue>   entries;
    
    public intermediateEntry        ()
    {
        entries     = new ArrayList<symbolEntryValue>();
        
        jumpKeyword = "";
        
        scope       = null;
        opCode      = null;
    }
}
