package app.compile.interpreter.operatorcodes;

import java.util.ArrayList;

import app.compile.database.SymbolDatabase;
import app.compile.interpreter.ProgramState;

public class OperatorCodeSwitch extends OperatorCode
{
    @Override
    public String getOperatorCode()
    {
        return "SWITCH";
    }

    @Override
    public void process(ProgramState state, ArrayList<String> opCodeArgs)
    {
        SymbolDatabase  ifDatabase          = new SymbolDatabase();
                        ifDatabase.parent   = state.currentScope;

        state.currentScope = ifDatabase;

        // we only inform the system that there's a new conditional shizz goin'
        state.CONDITIONAL_STACK.push(false);
    }
}
