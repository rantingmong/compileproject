package app.compile.interpreter.operatorcodes;

import java.util.ArrayList;

import app.compile.database.SymbolDatabaseEntry;
import app.compile.interpreter.ProgramState;
import app.compile.interpreter.Interpreter.FuncCodeEntry;
import app.compile.interpreter.ProgramState.FuncStackEntry;

public class OperatorCodeCase extends OperatorCode
{
    @Override
    public String getOperatorCode()
    {
        return "CASE";
    }

    @Override
    public void process(ProgramState state, ArrayList<String> opCodeArgs)
    {
        if (state.CONDITIONAL_STACK.peek())
        {
            // find endswitch statement
            FuncStackEntry  functionStack   = state.FUNCTION_STACK.peek();
            FuncCodeEntry   functionHandle  = state.program.getFunction(functionStack.functionName);
            
            for (int i = functionStack.programCounter; i < functionHandle.ilCode.size(); i++)
            {
                if (functionHandle.ilCode.get(i).toLowerCase().contains("ENDSWITCH"))
                {
                    functionStack.programCounter = i;
                    break;
                }
            }
        }
        else
        {
            // input is not a constant always
            SymbolDatabaseEntry entry = state.currentScope.find(opCodeArgs.get(0));
            
            if (entry.dataValue.valueAsTorf())
            {
                state.CONDITIONAL_STACK.pop();
                state.CONDITIONAL_STACK.push(true);
                
                state.FUNCTION_STACK.peek().programCounter += 1;
            }
            else
            {
                // find next case or default statement
                FuncStackEntry  functionStack   = state.FUNCTION_STACK.peek();
                FuncCodeEntry   functionHandle  = state.program.getFunction(functionStack.functionName);
                
                for (int i = functionStack.programCounter; i < functionHandle.ilCode.size(); i++)
                {
                    if (functionHandle.ilCode.get(i).toLowerCase().contains("CASE") ||
                        functionHandle.ilCode.get(i).toLowerCase().contains("DEFAULT"))
                    {
                        functionStack.programCounter = i;
                        break;
                    }
                }
            }
        }
    }
}
