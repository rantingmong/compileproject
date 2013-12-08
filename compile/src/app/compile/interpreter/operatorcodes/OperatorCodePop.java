package app.compile.interpreter.operatorcodes;

import java.util.ArrayList;

import app.compile.interpreter.ProgramState;

public class OperatorCodePop extends OperatorCode
{
    @Override
    public String getOperatorCode()
    {
        return "pop";
    }

    @Override
    public void process(ProgramState state, ArrayList<String> opCodeArgs)
    {
        state.currentScope                          = state.currentScope.parent;
        state.FUNCTION_STACK.peek().functionScope   = state.currentScope;
    }
}
