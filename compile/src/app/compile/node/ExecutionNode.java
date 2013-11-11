package app.compile.node;

import org.antlr.v4.runtime.tree.ParseTree;

import app.compile.core.Program;
import app.compile.core.ProgramState;

public abstract class ExecutionNode
{
    public abstract boolean ProcessChildren ();
    
    public abstract boolean IsValid         (ParseTree entry);
    public abstract void    Evaluate        (Program program, ProgramState state, ParseTree parseTree);
}
