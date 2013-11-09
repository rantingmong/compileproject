package app.compile.productions;

import org.antlr.v4.runtime.tree.ParseTree;

import app.compile.executions.executionNode;

public abstract class production
{
    /*
     * What this does is to pair the parse tree entry to an execution node
     */
    
    public abstract boolean             alsoReadChildren        ();
    
    public abstract boolean             isProductionValid       (ParseTree pt);
    
    public abstract executionNode       produceProduction       (ParseTree pt);
}
