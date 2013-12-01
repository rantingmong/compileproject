package app.compile.interpreter.operatorcodes;

import app.compile.core.DataType;
import app.compile.core.DataValue;
import app.compile.util.TypeCoercer;

public class OperatorCodeMul extends OperatorCodeBinary
{
    @Override
    public DataValue performOperation(DataValue lhs, DataValue rhs)
    {
        DataType lhsType = lhs.getDataType();
        DataType rhsType = rhs.getDataType();

        if      ((lhsType == DataType.CHARACTERS || lhsType == DataType.SYMBOL) &&
                 (lhsType == DataType.CHARACTERS || lhsType == DataType.SYMBOL))
        {
            return null;
        }
        else if ((lhsType == DataType.REAL_NUMBER || lhsType == DataType.WHOLE_NUMBER || lhsType == DataType.TORF) &&
                 (rhsType == DataType.REAL_NUMBER || rhsType == DataType.WHOLE_NUMBER || rhsType == DataType.TORF))
        {
            float finalLhsValue = 0;
            float finalRhsValue = 0;

            if (lhsType == DataType.TORF)
                finalLhsValue = lhs.valueAsTorf() ? 1 : 0;
            else
                finalLhsValue = lhs.valueAsFloat();
            
            if (rhsType == DataType.TORF)
                finalRhsValue = rhs.valueAsTorf() ? 1 : 0;
            else
                finalRhsValue = rhs.valueAsFloat();

            return new DataValue(TypeCoercer.coerceType(lhsType, rhsType), Float.toString(finalLhsValue * finalRhsValue));
        }
        else
        {
            return null;
        }
    }

    @Override
    public String getOperatorCode()
    {
        return "MUL";
    }
}
