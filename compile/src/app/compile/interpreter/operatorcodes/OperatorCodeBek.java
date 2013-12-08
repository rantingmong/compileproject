package app.compile.interpreter.operatorcodes;

import java.util.ArrayList;

import app.compile.interpreter.ProgramState;

public class OperatorCodeBek extends OperatorCode
{

    @Override
    public String getOperatorCode()
    {
        return "BEK";
    }

    @Override
    public void process(ProgramState state, ArrayList<String> opCodeArgs)
    {
        // TODO: this operator code triggers a breakpoint in the program.
        // in its default state, this is left unimplemented as this needs
        // an external IDE to work.
    }
}
