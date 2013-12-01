package app.compile.util;

import app.compile.core.DataType;

public class TypeCoercer
{
    public static DataType coerceType(DataType lhs, DataType rhs)
    {
        int lhsRank = convertDataTypeToRank(lhs);
        int rhsRank = convertDataTypeToRank(rhs);

        return convertRankToDataType(Math.max(lhsRank, rhsRank));
    }

    public static int convertDataTypeToRank(DataType type)
    {
        switch (type)
        {
        case CHARACTERS:
            return 4;
        case REAL_NUMBER:
            return 3;
        case SYMBOL:
            return 2;
        case WHOLE_NUMBER:
            return 1;
        case TORF:
            return 0;
        default:
            return -1;
        }
    }

    public static DataType convertRankToDataType(int rank)
    {
        switch (rank)
        {
        case 0:
            return DataType.TORF;
        case 1:
            return DataType.WHOLE_NUMBER;
        case 2:
            return DataType.SYMBOL;
        case 3:
            return DataType.REAL_NUMBER;
        case 4:
            return DataType.CHARACTERS;
        default:
            return DataType.NOTHING;
        }
    }
}
