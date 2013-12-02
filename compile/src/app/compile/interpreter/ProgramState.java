package app.compile.interpreter;

import java.util.ArrayList;
import java.util.Stack;

import app.compile.core.DataType;
import app.compile.core.DataValue;

import app.compile.database.SymbolDatabase;

public class ProgramState
{
    public class FuncStackEntry
    {
        public String         functionName   = "";
        public int            programCounter = 0;

        public SymbolDatabase functionScope  = new SymbolDatabase();
    }

    public Interpreter           program           = null;

    public DataValue             RET               = new DataValue(DataType.NOTHING);

    public ArrayList<DataValue>  ARGS_LIST         = new ArrayList<DataValue>(20);
    public ArrayList<DataValue>  PARAM_LIST        = new ArrayList<DataValue>(20);

    public Stack<FuncStackEntry> FUNCTION_STACK    = new Stack<FuncStackEntry>();
    
    public Stack<Boolean>        CONDITIONAL_STACK = new Stack<Boolean>();

    public SymbolDatabase        currentScope      = new SymbolDatabase();
}
