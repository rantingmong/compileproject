package app.compile.executions;

import app.compile.core.programDatabase;
import app.compile.core.symbolDatabase;

public abstract class executionNode
{
    /*
     * Execution nodes holds the information about how would a statement would run.
     * 
     * Additionally, it has the functionality to check if there are any logic/syntax
     * errors present in the statement and inform the developer about it.
     * 
     */

    /*
     * This method checks if its correct, basically.
     */
    
    public abstract boolean checkForConformity  ();
    
    /*
     * This method runs the execution node.
     * 
     * The parameter 'pd' is there so that this execution node can access information such
     * as package declarations and function information.
     * 
     * The parameter 'parentSymbolDatabase' is there so that we can get whatever variables the
     * developer defined. Of course this execution node can also breed its own symbol database.
     */
    
    public abstract void    run                 (programDatabase pd, symbolDatabase parentSymbolDatabase);
}
