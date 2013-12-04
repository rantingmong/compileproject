package app.compile.interpreter.operatorcodes;

import java.util.ArrayList;

import app.compile.core.DataValue;
import app.compile.database.SymbolDatabaseEntry;
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
        
        SymbolDatabaseEntry destinationEntry = state.currentScope.find(destination);
        
        if (destinationEntry != null)
        {
            DataValue dValue = ValueGetter.getValue(value, state, state.currentScope);
            
            if (dValue != null)
            {
                destinationEntry.dataValue = new DataValue(destinationEntry.dataType, dValue.valueAsString());                
            }
            else
            {
                System.err.println("UH-OH.");
            }
        }
        else
        {
            // get data type of value
            if      (destination.toLowerCase().contains("arg"))
            {
                int         argnum      = Integer.parseInt(destination.substring(3));
                DataValue   xvalue      = ValueGetter.getValue(value, state, state.currentScope);
                
                state.ARGS_LIST[argnum] = new DataValue(xvalue.getDataType(), ValueGetter.getValue(value, state, state.currentScope).valueAsString());
            }
            else if (destination.toLowerCase().contains("param"))
            {
                int         paramnum    = Integer.parseInt(destination.substring(5));
                DataValue   xvalue      = ValueGetter.getValue(value, state, state.currentScope);

                state.PARAM_LIST[paramnum] = new DataValue(xvalue.getDataType(), ValueGetter.getValue(value, state, state.currentScope).valueAsString());
            }
            else if (destination.toLowerCase().contains("ret"))
            {
                DataValue   xvalue      = ValueGetter.getValue(value, state, state.currentScope);

                state.RET = new DataValue(xvalue.getDataType(), ValueGetter.getValue(value, state, state.currentScope).valueAsString());                
            }
            else
            {
                // TODO: error checking                
            }
        }
    }
}
