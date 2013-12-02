package app.compile.interpreter.operatorcodes;

import java.util.ArrayList;

import app.compile.core.DataValue;
import app.compile.interpreter.ProgramState;
import app.compile.util.ValueGetter;

public class OperatorCodeAsg extends OperatorCode
{
    @Override
    public String getOperatorCode()
    {
        return "asg";
    }

    @Override
    public void process(ProgramState state, ArrayList<String> opCodeArgs)
    {
        String      destination         = opCodeArgs.get(0);
        String      value               = opCodeArgs.get(1);
        
        DataValue   destinationValue    = ValueGetter.getValue(destination, state, state.currentScope);
        
        if (destinationValue != null)
        {
            destinationValue.setValue(value);
        }
        else
        {
            // TODO: error checking
        }
    }
}
