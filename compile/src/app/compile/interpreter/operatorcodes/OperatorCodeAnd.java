package app.compile.interpreter.operatorcodes;

import app.compile.core.DataType;
import app.compile.core.DataValue;

public class OperatorCodeAnd extends OperatorCodeBinary
{
    @Override
    public DataValue performOperation(DataValue lhs, DataValue rhs)
    {
        DataType lhsType = lhs.getDataType();
        DataType rhsType = rhs.getDataType();

        if (lhsType != DataType.TORF && rhsType != DataType.TORF)
        {
            return null;
        }
        else
        {
            return new DataValue(DataType.TORF, (lhs.valueAsTorf() && rhs.valueAsTorf()) ? "true" : "false");
        }
    }

    @Override
    public String getOperatorCode()
    {
        return "AND";
    }
}
