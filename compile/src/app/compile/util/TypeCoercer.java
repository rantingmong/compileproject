package app.compile.util;

import app.compile.core.DataType;
import app.compile.database.SymbolDatabase;
import app.compile.database.SymbolDatabaseEntry;

public class TypeCoercer
{
    public static DataType getDataType                          (SymbolDatabase database, String value, boolean ilName)
    {
        SymbolDatabaseEntry entry = database.find(value, ilName);
        
        if (entry != null)
        {
            return entry.dataType;
        }
        
        return ValueGetter.inferType(value);
    }
    
    public static DataType  coerceType                          (DataType lhs, DataType rhs)
    {
        int lhsRank = convertDataTypeToRank(lhs);
        int rhsRank = convertDataTypeToRank(rhs);

        return convertRankToDataType(Math.max(lhsRank, rhsRank));
    }

    private static boolean[][] aMatrix = new boolean[][]
    {
        new boolean[] {  true,  true, false, false, false, false },
        new boolean[] {  true,  true, false, false, false, false },
        new boolean[] { false, false,  true,  true, false, false },
        new boolean[] { false,  true,  true,  true, false, false },
        new boolean[] { false, false, false, false,  true, false },
        new boolean[] { false, false, false, false, false, false }
    };

    public static boolean   checkIfArithmeticallyCompatible     (DataType lhs, DataType rhs)
    {
        return aMatrix[convertDataTypeToInt(lhs)][convertDataTypeToInt(rhs)];
    }

    public static boolean   checkIfLogicallyCompatible          (DataType lhs, DataType rhs)
    {
        // we can only do boolean operations on both sides
        if (lhs == DataType.TORF && rhs == DataType.TORF)
        {
            return true;
        }
        
        return false;
    }
    
    public static int convertDataTypeToInt(DataType type)
    {
        switch (type)
        {
        case SYMBOL:
            return 0;
        case CHARACTERS:
            return 1;
        case WHOLE_NUMBER:
            return 2;
        case REAL_NUMBER:
            return 3;
        case TORF:
            return 4;
        case NOTHING:
            return 5;
        }
        
        return -1;
    }
    
    public static int       convertDataTypeToRank               (DataType type)
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

    public static DataType  convertRankToDataType               (int rank)
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
