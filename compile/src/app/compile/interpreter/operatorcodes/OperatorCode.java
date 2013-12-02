package app.compile.interpreter.operatorcodes;

import java.util.ArrayList;

import app.compile.interpreter.ProgramState;

public abstract class OperatorCode
{
    /**
     * Returns <code>false</code> if the interpreter should handle program counter increment.
     * Returns <code>true</code> if the operator code should handle program counter increment.
     * 
     * @return Returns <code>true</code> if the operator code will handle program counter increment. Otherwise, false.
     */
    public boolean          incrementHandled    ()
    {
        return false;
    }
    
    /**
     * Returns the operator code symbol for this operator code.
     * 
     * @return The operator code symbol.
     */
    public abstract String  getOperatorCode     ();

    /**
     * Processes the operator code.
     * 
     * @param state The handle to the program state which contains the necessary registers for the machine to work.
     * @param opCodeArgs The opcode arguments.
     */
    public abstract void    process             (ProgramState state, ArrayList<String> opCodeArgs);
}
