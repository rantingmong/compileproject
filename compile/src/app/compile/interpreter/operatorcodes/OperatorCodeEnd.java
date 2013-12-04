package app.compile.interpreter.operatorcodes;

import java.util.ArrayList;

import app.compile.interpreter.ProgramState;

public class OperatorCodeEnd extends OperatorCode
{
    @Override
    public String getOperatorCode()
    {
        return "END";
    }

    @Override
    public void process(ProgramState state, ArrayList<String> opCodeArgs)
    {
        state.FUNCTION_STACK.pop();
        
        if (state.FUNCTION_STACK.size() > 0)
            state.currentScope = state.FUNCTION_STACK.peek().functionScope;
    }
}
