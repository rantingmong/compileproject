package app.compile.executions;

import java.util.List;

import org.antlr.v4.runtime.tree.ParseTree;

import app.compile.core.parameterInformation;
import app.compile.core.programDatabase;
import app.compile.core.database.symbolDatabase;

public abstract class executionNode
{
    /*
     * An execution node is the core on how a function will run. This defines the statements
     * that will be used by the interpreter.
     * 
     * An execution node can either by defined by native code (in this case Java) or the language itself
     * (in this case JABASCREEP).
     */
    
    /*
     * This method converts the parse tree to (pseudo) three symbol code.
     */
    public abstract void convert    (ParseTree pt);
    
    /*
     * This method runs the statements defined.
     * 
     * capturedScope: this defines the variables that are defined before this execution node is called.
     * program: this holds information such as defined functions and imported functions.
     */
    public abstract void run        (List<parameterInformation> paramInfo, symbolDatabase capturedScope, programDatabase program);
}
