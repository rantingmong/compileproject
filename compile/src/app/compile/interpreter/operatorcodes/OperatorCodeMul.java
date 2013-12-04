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

        if (TypeCoercer.checkIfArithmeticallyCompatible(lhsType, rhsType))
        {
            float finalLhsValue = 0;
            float finalRhsValue = 0;

            if      (lhsType == DataType.TORF)
                finalLhsValue = lhs.valueAsTorf() ? 1 : 0;
            else if (lhsType == DataType.WHOLE_NUMBER)
                finalLhsValue = lhs.valueAsInt();
            else if (lhsType == DataType.REAL_NUMBER)
                finalLhsValue = lhs.valueAsFloat();
            
            if      (rhsType == DataType.TORF)
                finalRhsValue = rhs.valueAsTorf() ? 1 : 0;
            else if (rhsType == DataType.WHOLE_NUMBER)
                finalRhsValue = rhs.valueAsInt();
            else if (rhsType == DataType.REAL_NUMBER)
                finalRhsValue = rhs.valueAsFloat();

            return new DataValue(TypeCoercer.coerceType(lhsType, rhsType), Float.toString(finalLhsValue * finalRhsValue));
        }
        else
        {
            System.err.println("NOT HANDLED!");
            
            return null;
        }
    }

    @Override
    public String getOperatorCode()
    {
        return "MUL";
    }
}
