package app.compile.productions;

import org.antlr.v4.runtime.tree.ParseTree;

public abstract class production
{
    public abstract boolean alsoReadChildren    ();
    
    public abstract boolean isProductionValid   (ParseTree pt);
    public abstract void    process             (ParseTree pt, int level); 
}
