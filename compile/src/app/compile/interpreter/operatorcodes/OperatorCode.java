package app.compile.interpreter.operatorcodes;

import java.util.ArrayList;

import app.compile.database.SymbolDatabase;
import app.compile.interpreter.ProgramState;

public abstract class OperatorCode
{
    public abstract String  getOperatorCode ();
    
    public abstract void    process         (ProgramState state, SymbolDatabase currentScope, ArrayList<String> opCodeArgs);
}
