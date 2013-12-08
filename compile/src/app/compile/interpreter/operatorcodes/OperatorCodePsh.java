package app.compile.interpreter.operatorcodes;

import java.util.ArrayList;

import app.compile.database.SymbolDatabase;
import app.compile.interpreter.ProgramState;

public class OperatorCodePsh extends OperatorCode
{
    @Override
    public String getOperatorCode()
    {
        return "psh";
    }

    @Override
    public void process(ProgramState state, ArrayList<String> opCodeArgs)
    {
        SymbolDatabase newDatabase          = new SymbolDatabase();
                       newDatabase.parent   = state.currentScope;
                       
                       state.currentScope                           = newDatabase;
                       state.FUNCTION_STACK.peek().functionScope    = newDatabase;
    }
}
