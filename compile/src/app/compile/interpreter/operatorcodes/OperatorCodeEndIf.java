package app.compile.interpreter.operatorcodes;

import java.util.ArrayList;

import app.compile.interpreter.ProgramState;

public class OperatorCodeEndIf extends OperatorCode
{
    @Override
    public String getOperatorCode()
    {
        return "ENDIF";
    }

    @Override
    public void process(ProgramState state, ArrayList<String> opCodeArgs)
    {
        // next line...
        state.CONDITIONAL_STACK.pop();
    }

}
