package app.compile.operators;

import app.compile.core.DataType;
import app.compile.core.DataValue;

public class ValueOperatorNotEquals extends ValueOperator
{
    @Override
    public boolean IsOperator(String value)
    {
        return value.toLowerCase().equals("not_equal");
    }

    @Override
    public DataValue Process(DataValue lhs, DataValue rhs)
    {
        if     ((lhs.getDataType() == DataType.WHOLE_NUMBER || lhs.getDataType() == DataType.REAL_NUMBER) &&
                (rhs.getDataType() == DataType.WHOLE_NUMBER || rhs.getDataType() == DataType.REAL_NUMBER))
        {
            return new DataValue(DataType.TORF, (lhs.valueAsFloat() != rhs.valueAsFloat()) ? "true" : "false");
        }
        else if (lhs.getDataType() == DataType.CHARACTERS && rhs.getDataType() == DataType.CHARACTERS)
        {
            return new DataValue(DataType.TORF, !(lhs.valueAsString().equals(rhs.valueAsString())) ? "true" : "false");
        }
        else if (lhs.getDataType() == DataType.SYMBOL && rhs.getDataType() == DataType.SYMBOL)
        {
            return new DataValue(DataType.TORF, (lhs.valueAsChar() != rhs.valueAsChar()) ? "true" : "false");
        }
        else
        {
            System.err.println("Not equal operation was not successful. Returning default value of FALSE.");

            return new DataValue(DataType.TORF, "FALSE");
        }
    }
}
