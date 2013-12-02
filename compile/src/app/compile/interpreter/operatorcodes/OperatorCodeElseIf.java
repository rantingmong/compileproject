package app.compile.interpreter.operatorcodes;

import java.util.ArrayList;

import app.compile.database.SymbolDatabaseEntry;
import app.compile.interpreter.ProgramState;
import app.compile.interpreter.Interpreter.FuncCodeEntry;
import app.compile.interpreter.ProgramState.FuncStackEntry;

public class OperatorCodeElseIf extends OperatorCode
{
    @Override
    public boolean incrementHandled()
    {
        return true;
    }
    
    @Override
    public String getOperatorCode()
    {
        return "ELSEIF";
    }

    @Override
    public void process(ProgramState state, ArrayList<String> opCodeArgs)
    {
        if (state.CONDITIONAL_STACK.peek())
        {
            // conditional already processed! find ENDIF and continue execution after that line
            FuncStackEntry  functionStack   = state.FUNCTION_STACK.peek();
            FuncCodeEntry   functionHandle  = state.program.getFunction(functionStack.functionName);

            for (int i = functionStack.programCounter; i < functionHandle.ilCode.size(); i++)
            {
                if (functionHandle.ilCode.get(i).toLowerCase().contains("ENDIF"))
                {
                    functionStack.programCounter = i;
                    break;
                }
            }
        }
        else
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

            // if check is true go to next line
            if (finalValue)
            {
                state.CONDITIONAL_STACK.pop();
                state.CONDITIONAL_STACK.push(true);
                
                state.FUNCTION_STACK.peek().programCounter += 1;
            }
            // we find nearest ELSEIF, ELSE, ENDIF
            else
            {
                FuncStackEntry  functionStack   = state.FUNCTION_STACK.peek();
                FuncCodeEntry   functionHandle  = state.program.getFunction(functionStack.functionName);
                
                for (int i = functionStack.programCounter; i < functionHandle.ilCode.size(); i++)
                {
                    if (functionHandle.ilCode.get(i).toLowerCase().contains("ELSEIF")   ||
                        functionHandle.ilCode.get(i).toLowerCase().contains("ELSE")     ||
                        functionHandle.ilCode.get(i).toLowerCase().contains("ENDIF"))
                    {
                        functionStack.programCounter = i;
                        break;
                    }
                }
            }
        }
    }
}
