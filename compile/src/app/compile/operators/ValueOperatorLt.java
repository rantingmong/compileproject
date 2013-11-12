package app.compile.operators;

import app.compile.core.DataType;
import app.compile.core.DataValue;

public class ValueOperatorLt extends ValueOperator
{
    @Override
    public boolean      IsOperator  (String value)
    {
        return value.toLowerCase().equals("lt");
    }

    @Override
    public DataValue    Process     (DataValue lhs, DataValue rhs)
    {
        if      ((lhs.getDataType() == DataType.WHOLE_NUMBER || lhs.getDataType() == DataType.REAL_NUMBER) &&
                 (rhs.getDataType() == DataType.REAL_NUMBER  || rhs.getDataType() == DataType.WHOLE_NUMBER))
        {
            return new DataValue(DataType.TORF, (lhs.valueAsFloat() < rhs.valueAsFloat()) + "");
        }
        else if  (lhs.getDataType() == DataType.TORF && rhs.getDataType() == DataType.TORF)
        {
            boolean lhsValue = lhs.valueAsTorf();
            boolean rhsValue = rhs.valueAsTorf();
            
            return new DataValue(DataType.TORF, ((lhsValue ? 1 : 0) < (rhsValue ? 1 : 0)) + "");
        }

        System.err.println("Less than operation was not successful. Returning default value of FALSE.");
        
        return new DataValue(DataType.TORF, "FALSE");
    }
}
