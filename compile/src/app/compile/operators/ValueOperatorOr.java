package app.compile.operators;

import app.compile.core.DataType;
import app.compile.core.DataValue;

public class ValueOperatorOr extends ValueOperator
{
    @Override
    public boolean      IsOperator  (String value)
    {
        return value.toLowerCase().equals("or");
    }

    @Override
    public DataValue    Process     (DataValue lhs, DataValue rhs)
    {
        if (lhs.getDataType() == DataType.TORF && rhs.getDataType() == DataType.TORF)
        {
            boolean torflhs = lhs.valueAsTorf();
            boolean torfrhs = rhs.valueAsTorf();
            
            return new DataValue(DataType.TORF, (torflhs || torfrhs) + "");
        }
        
        System.err.println("And operation was not successful. Returning default value of FALSE.");
        
        return new DataValue(DataType.TORF, "FALSE");
    }
}
