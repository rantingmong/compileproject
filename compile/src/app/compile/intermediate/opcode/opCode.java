package app.compile.intermediate.opcode;

/**
 * A representation of an operation code.
 */
public abstract class opCode
{
    public abstract String  getOpCode   ();
    
    public abstract void    process     ();
}
