package app.compile.productions;

import org.antlr.v4.runtime.tree.ParseTree;

import app.compile.util.stateMachine;

public abstract class production
{
    /*
     * What this does is to pair the parse tree entry to an execution node
     */
    
    public abstract boolean alsoReadChildren    ();
    
    public abstract boolean isProductionValid   (ParseTree pt);
    public abstract void    process             (ParseTree pt, int level, stateMachine state); 
}
