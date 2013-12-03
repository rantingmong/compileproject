package app.compile.core;

import java.util.ArrayList;

import app.compile.database.SymbolDatabase;
import app.compile.interpreter.ProgramState;

public class FunctionInformation
{
    public interface NativeAction
    {
        void execute(ProgramState state, SymbolDatabase scope);
    }

    public boolean                         isNative      = false;

    public String                          functionName  = "";
    public ArrayList<ParameterInformation> parameterList = new ArrayList<ParameterInformation>();

    public DataType                        returnType    = DataType.NOTHING;

    public ArrayList<String>               ilCode        = new ArrayList<String>();

    public NativeAction                    nativeAction  = null;
}
