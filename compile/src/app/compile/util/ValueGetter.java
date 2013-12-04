package app.compile.util;

import app.compile.core.DataType;
import app.compile.core.DataValue;
import app.compile.database.SymbolDatabase;
import app.compile.database.SymbolDatabaseEntry;
import app.compile.interpreter.ProgramState;

public class ValueGetter
{
    public static DataType inferType(String value)
    {
        if      (Checker.checkIfTokenIsChar(value))
        {
            return DataType.SYMBOL;
        }
        else if (Checker.checkIfTokenIsString(value))
        {
            return DataType.CHARACTERS;
        }
        else if (Checker.checkIfTokenIsNumber(value))
        {
            return DataType.WHOLE_NUMBER;
        } 
        else if (Checker.checkIfTokenIsFloat(value))
        {
            return DataType.REAL_NUMBER;
        }
        else if (Checker.checkIfTokenIsTorf(value))
        {
            return DataType.TORF;
        }
        
        System.err.println("Value was not infered! " + value);
        
        return DataType.NOTHING;
    }
    
    public static DataValue getValue(String input, ProgramState state, SymbolDatabase scope)
    {
        if      (Checker.checkIfTokenIsChar(input))
        {
            return new DataValue(DataType.SYMBOL, input);
        }
        else if (Checker.checkIfTokenIsNumber(input))
        {
            return new DataValue(DataType.WHOLE_NUMBER, input);
        }
        else if (Checker.checkIfTokenIsFloat(input))
        {
            return new DataValue(DataType.REAL_NUMBER, input);
        }
        else if (Checker.checkIfTokenIsTorf(input))
        {
            return new DataValue(DataType.TORF, input);
        }
        else if (input.toLowerCase().equals("ret"))
        {
            return state.RET;
        }
        else if (input.toLowerCase().contains("arg"))
        {
            return state.ARGS_LIST  [Integer.parseInt(input.substring(3))];
        }
        else if (input.toLowerCase().contains("param"))
        {
            return state.PARAM_LIST [Integer.parseInt(input.substring(5))];
        }
        // argument is not a constant. find it in the symbol database.
        else
        {
            SymbolDatabaseEntry entry = state.currentScope.find(input);
            
            if (entry != null)
                return entry.dataValue;
        }
        
        return new DataValue(DataType.CHARACTERS, input);
    }
}
