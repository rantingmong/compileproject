package app.compile.interpreter.operatorcodes;

import java.util.ArrayList;

import app.compile.database.SymbolDatabaseEntry;
import app.compile.interpreter.Interpreter.FuncCodeEntry;
import app.compile.interpreter.ProgramState;
import app.compile.interpreter.ProgramState.FuncStackEntry;

public class OperatorCodeJmp extends OperatorCode
{
    @Override
    public boolean      incrementHandled    ()
    {
        return true;
    }
    
    @Override
    public String       getOperatorCode     ()
    {
        return "JMP";
    }

    @Override
    public void         process             (ProgramState state, ArrayList<String> opCodeArgs)
    {
        boolean             finalValue  = false;
        SymbolDatabaseEntry entry       = state.currentScope.find(opCodeArgs.get(0)); 
        
        // resolve resolve!
        
        // value is a variable
        if (entry != null)
        {
            finalValue = entry.dataValue.valueAsTorf();
        }
        // value is a constant
        else
        {
            finalValue =    opCodeArgs.get(0).toLowerCase().equals("true") ||
                            Integer.getInteger(opCodeArgs.get(0)) >= 1;
        }

        // simple: if arg0 is true, find the count where jump is and jump there
        if (finalValue)
        {
            // search for jump
            FuncStackEntry  functionStack   = state.FUNCTION_STACK.peek();
            FuncCodeEntry   functionHandle  = state.program.getFunction(functionStack.functionName);
            String          searchQuery     = opCodeArgs.get(1) + ":";
            
            for (int i = 0; i < functionHandle.ilCode.size(); i++)
            {
                if (searchQuery.equals(functionHandle.ilCode.get(i)))
                {
                    functionStack.programCounter = i;
                    break;
                }
            }
        }
        else
        {
            // we just increment program counter by 1
            state.FUNCTION_STACK.peek().programCounter += 1;
        }
    }
}
