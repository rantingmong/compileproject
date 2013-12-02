package app.compile.interpreter.operatorcodes;

import java.util.ArrayList;

import app.compile.core.DataType;
import app.compile.core.DataValue;
import app.compile.database.SymbolDatabaseEntry;
import app.compile.interpreter.ProgramState;
import app.compile.util.Checker;

public abstract class OperatorCodeBinary extends OperatorCode
{
    @Override
    public void process(ProgramState state, ArrayList<String> opCodeArgs)
    {
        SymbolDatabaseEntry destination = state.currentScope.find(opCodeArgs.get(2));
        
        DataValue lhs = null;
        DataValue rhs = null;
        
        String lhsValue = opCodeArgs.get(0);
        String rhsValue = opCodeArgs.get(1);
        
        // lhs check
        
        // arugment is a constant
        if      (Checker.checkIfTokenIsString(lhsValue))
        {
            lhs = new DataValue(DataType.CHARACTERS, lhsValue);
        }
        else if (Checker.checkIfTokenIsChar(lhsValue))
        {
            lhs = new DataValue(DataType.SYMBOL, lhsValue);
        }
        else if (Checker.checkIfTokenIsNumber(lhsValue))
        {
            lhs = new DataValue(DataType.WHOLE_NUMBER, lhsValue);
        }
        else if (Checker.checkIfTokenIsFloat(lhsValue))
        {
            lhs = new DataValue(DataType.REAL_NUMBER, lhsValue);
        }
        else if (Checker.checkIfTokenIsTorf(lhsValue))
        {
            lhs = new DataValue(DataType.TORF, lhsValue);
        }
        // argument is not a constant. find it in the symbol database.
        else
        {
            lhs = state.currentScope.find(lhsValue).dataValue;
        }

        // rhs check
        
        // arugment is a constant
        if      (Checker.checkIfTokenIsString(rhsValue))
        {
            rhs = new DataValue(DataType.CHARACTERS, rhsValue);
        }
        else if (Checker.checkIfTokenIsChar(rhsValue))
        {
            rhs = new DataValue(DataType.SYMBOL, rhsValue);
        }
        else if (Checker.checkIfTokenIsNumber(rhsValue))
        {
            rhs = new DataValue(DataType.WHOLE_NUMBER, rhsValue);
        }
        else if (Checker.checkIfTokenIsFloat(rhsValue))
        {
            rhs = new DataValue(DataType.REAL_NUMBER, rhsValue);
        }
        else if (Checker.checkIfTokenIsTorf(rhsValue))
        {
            rhs = new DataValue(DataType.TORF, rhsValue);
        }
        // argument is not a constant. find it in the symbol database.
        else
        {
            rhs = state.currentScope.find(rhsValue).dataValue;
        }

        // perform the thingy!
        DataValue returnValue = performOperation(lhs, rhs);
        
        if (returnValue == null)
        {
            // TODO: error handling
        }
        else
        {
            destination.dataType    = returnValue.getDataType();
            destination.dataValue   = returnValue;
        }
    }

    public abstract DataValue performOperation(DataValue lhs, DataValue rhs);
}
