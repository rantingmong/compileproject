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
        state.ARGS_LIST.clear();
        state.PARAM_LIST.clear();
        
        state.FUNCTION_STACK.pop();
        state.currentScope = state.FUNCTION_STACK.peek().functionScope;
    }
}
