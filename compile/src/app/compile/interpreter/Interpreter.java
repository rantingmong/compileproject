package app.compile.interpreter;

import java.util.ArrayList;

import javax.tools.JavaCompiler;

import app.compile.core.DataType;
import app.compile.core.ParameterInformation;
import app.compile.database.SymbolDatabase;
import app.compile.interpreter.ProgramState.FuncStackEntry;
import app.compile.interpreter.operatorcodes.OperatorCode;
import app.compile.interpreter.operatorcodes.OperatorCodeAdd;
import app.compile.interpreter.operatorcodes.OperatorCodeAnd;
import app.compile.interpreter.operatorcodes.OperatorCodeAsg;
import app.compile.interpreter.operatorcodes.OperatorCodeCal;
import app.compile.interpreter.operatorcodes.OperatorCodeCase;
import app.compile.interpreter.operatorcodes.OperatorCodeDec;
import app.compile.interpreter.operatorcodes.OperatorCodeDefault;
import app.compile.interpreter.operatorcodes.OperatorCodeDiv;
import app.compile.interpreter.operatorcodes.OperatorCodeElse;
import app.compile.interpreter.operatorcodes.OperatorCodeElseIf;
import app.compile.interpreter.operatorcodes.OperatorCodeEnd;
import app.compile.interpreter.operatorcodes.OperatorCodeEndIf;
import app.compile.interpreter.operatorcodes.OperatorCodeEndSwitch;
import app.compile.interpreter.operatorcodes.OperatorCodeEql;
import app.compile.interpreter.operatorcodes.OperatorCodeGt;
import app.compile.interpreter.operatorcodes.OperatorCodeGte;
import app.compile.interpreter.operatorcodes.OperatorCodeIf;
import app.compile.interpreter.operatorcodes.OperatorCodeJmp;
import app.compile.interpreter.operatorcodes.OperatorCodeLt;
import app.compile.interpreter.operatorcodes.OperatorCodeLte;
import app.compile.interpreter.operatorcodes.OperatorCodeMul;
import app.compile.interpreter.operatorcodes.OperatorCodeNql;
import app.compile.interpreter.operatorcodes.OperatorCodeOr;
import app.compile.interpreter.operatorcodes.OperatorCodeSub;
import app.compile.interpreter.operatorcodes.OperatorCodeSwitch;

public class Interpreter
{
    public class FuncCodeEntry
    {
        public String                          functionName = "";

        public DataType                        returnType   = DataType.NOTHING;

        public ArrayList<ParameterInformation> params       = new ArrayList<ParameterInformation>();

        public ArrayList<String>               ilCode       = new ArrayList<String>();
    }

    public class LineEntry
    {
        public String            opCode;
        
        public ArrayList<String> arguments;
    }
    
    private FuncCodeEntry            mainFunction = null;
    
    private ProgramState             programState = new ProgramState();
    private ArrayList<FuncCodeEntry> functions    = new ArrayList<Interpreter.FuncCodeEntry>();

    private ArrayList<OperatorCode>  opCodeList   = new ArrayList<OperatorCode>();

    public                           Interpreter    (String ilCodeSource)
    {
        opCodeList.add(new OperatorCodeGt       ());
        opCodeList.add(new OperatorCodeIf       ());
        opCodeList.add(new OperatorCodeLt       ());
        opCodeList.add(new OperatorCodeOr       ());
        opCodeList.add(new OperatorCodeAdd      ());
        opCodeList.add(new OperatorCodeAnd      ());
        opCodeList.add(new OperatorCodeAsg      ());
        opCodeList.add(new OperatorCodeCal      ());
        opCodeList.add(new OperatorCodeDec      ());
        opCodeList.add(new OperatorCodeDiv      ());
        opCodeList.add(new OperatorCodeEnd      ());
        opCodeList.add(new OperatorCodeEql      ());
        opCodeList.add(new OperatorCodeGte      ());
        opCodeList.add(new OperatorCodeJmp      ());
        opCodeList.add(new OperatorCodeLte      ());
        opCodeList.add(new OperatorCodeMul      ());
        opCodeList.add(new OperatorCodeNql      ());
        opCodeList.add(new OperatorCodeSub      ());
        opCodeList.add(new OperatorCodeCase     ());
        opCodeList.add(new OperatorCodeElse     ());
        opCodeList.add(new OperatorCodeEndIf    ());
        opCodeList.add(new OperatorCodeElseIf   ());
        opCodeList.add(new OperatorCodeSwitch   ());
        opCodeList.add(new OperatorCodeDefault  ());
        opCodeList.add(new OperatorCodeEndSwitch());
    }

    public void                      parse           ()
    {
        // separate the source file into its respective thingy
    }
    
    public boolean                   findFunction   (String functionName)
    {
        for (FuncCodeEntry function : functions)
        {
            if (function.equals(functionName))
            {
                return true;
            }
        }
        
        // TODO: include functions imported
        
        return false;
    }
    
    public FuncCodeEntry             getFunction    (String functionName)
    {
        for (FuncCodeEntry function : functions)
        {
            if (function.equals(functionName))
            {
                return function;
            }
        }

        // TODO: include functions imported
        
        return null;
    }
    
    public LineEntry                 parseLine      (String line)
    {
        String              procLine    = line + " ";
        
        int                 state       = 0; // 0 = init, 1 = op code read, 2 = inside string
        StringBuilder       opCode      = new StringBuilder();
        
        StringBuilder       curArgument = new StringBuilder();
        ArrayList<String>   arguments   = new ArrayList<String>();
        
        for (int i = 0; i < procLine.length(); i++)
        {
            char theChar = procLine.charAt(i);

            switch (state)
            {
            case 0:

                if (theChar == ' ')
                {
                    state = 1;
                }
                else
                {
                    opCode.append(theChar);
                }
                break;
            case 1:

                if      (theChar == ' ')
                {
                    // next argument
                    arguments.add(curArgument.toString());
                    
                    curArgument = new StringBuilder();
                }
                else if (theChar == '<')
                {
                    // inside string
                    state = 2;
                }
                else
                {
                    curArgument.append(theChar);
                }
                
                break;
            case 2:

                if (theChar == '>')
                {
                    state = 1;
                }
                else
                {
                    curArgument.append(theChar);
                }
                
                break;
            }
        }
        
        LineEntry   newLineEntry            = new LineEntry();

                    newLineEntry.opCode     = opCode.toString();
                    newLineEntry.arguments  = arguments;
        
        return newLineEntry;
    }
    
    public void                      execute        ()
    {
        
        // set curFunction to main
        FuncStackEntry  mainFunctionStack                = programState.new FuncStackEntry();
        
                        mainFunctionStack.functionName   = "main";
                        mainFunctionStack.functionScope  = new SymbolDatabase();
                        
                        mainFunctionStack.programCounter = 0;
        
        programState.FUNCTION_STACK.push(mainFunctionStack);

        FuncStackEntry curFunc = null;
        
        do
        {
            curFunc = programState.FUNCTION_STACK.peek();
            
            for (OperatorCode opCode : opCodeList)
            {
                LineEntry lineEntry = parseLine(getFunction(curFunc.functionName).ilCode.get(curFunc.programCounter));
                
                if (opCode.getOperatorCode().toLowerCase().equals(lineEntry.opCode))
                {
                    opCode.process(programState, lineEntry.arguments);
                    
                    if (opCode.incrementHandled() == false)
                    {
                        curFunc.programCounter += 1;
                    }
                }
            }
        } while (curFunc.programCounter < getFunction(curFunc.functionName).ilCode.size());
    }
}
