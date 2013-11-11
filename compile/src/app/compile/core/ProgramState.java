package app.compile.core;

import java.util.Stack;

import app.compile.database.SymbolDatabase;

public class ProgramState
{
    public SymbolDatabase   currentScope;
    public Stack<String>    programStack    = new Stack<String>();
    
    public DataValue        returnValue     = null;
}
