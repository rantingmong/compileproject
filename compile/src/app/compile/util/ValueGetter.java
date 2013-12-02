package app.compile.util;

import app.compile.core.DataType;
import app.compile.core.DataValue;
import app.compile.database.SymbolDatabase;
import app.compile.database.SymbolDatabaseEntry;
import app.compile.interpreter.ProgramState;

public class ValueGetter
{
    public static DataValue getValue(String input, ProgramState state, SymbolDatabase scope)
    {
        if      (Checker.checkIfTokenIsString(input))
        {
            return new DataValue(DataType.CHARACTERS, input);
        }
        else if (Checker.checkIfTokenIsChar(input))
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
        else if (input.toLowerCase().contains("args"))
        {
            return state.ARGS_LIST.get(Integer.getInteger(input.charAt(input.length() - 1) + ""));
        }
        else if (input.toLowerCase().contains("param"))
        {
            return state.PARAM_LIST.get(Integer.getInteger(input.charAt(input.length() - 1) + ""));
        }
        // argument is not a constant. find it in the symbol database.
        else
        {
            SymbolDatabaseEntry entry = state.currentScope.find(input);
            
            if (entry != null)
                return entry.dataValue;
        }
        
        return null;
    }
}
