package app.compile.interpreter;

import java.util.ArrayList;

import app.compile.core.DataType;
import app.compile.core.ParameterInformation;
import app.compile.interpreter.operatorcodes.OperatorCode;

public class Interpreter
{
    public class FuncCodeEntry
    {
        public String                          functionName = "";

        public DataType                        returnType   = DataType.NOTHING;

        public ArrayList<ParameterInformation> params       = new ArrayList<ParameterInformation>();

        public ArrayList<String>               ilCode       = new ArrayList<String>();
    }

    private ProgramState             programState = new ProgramState();
    private ArrayList<FuncCodeEntry> functions    = new ArrayList<Interpreter.FuncCodeEntry>();

    private FuncCodeEntry            curFunction  = null;

    private ArrayList<OperatorCode>  opCodeList   = new ArrayList<OperatorCode>();

    public                           Interpreter    (String ilCodeSource)
    {

    }

    public boolean                   findFunction   (String functionName)
    {
        return false;
    }
    
    public FuncCodeEntry             getFunction    (String functionName)
    {
        return null;
    }
    
    public void                      execute        ()
    {
        // set curFunction to main

        // iterate through ilCode of curFunction until we go to the end, we then
        // pop from the function stack
    }
}
