package app.compile.interpreter;

import java.util.ArrayList;

import app.compile.compiler.JalCompiler;
import app.compile.core.FunctionInformation;
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
    public class LineEntry
    {
        public String            opCode;

        public ArrayList<String> arguments;
        
        @Override
        public String toString()
        {
            return opCode + " " + arguments.size();
        }
    }

    private ProgramState                   programState = new ProgramState();
    private ArrayList<OperatorCode>        opCodeList   = new ArrayList<OperatorCode>();

    private JalCompiler                    compiler;
    private FunctionInformation            mainFunction;
    
    public Interpreter(JalCompiler compiler)
    {
        programState.program = this;
        this.compiler = compiler;
        
        opCodeList.add(new OperatorCodeGt());
        opCodeList.add(new OperatorCodeIf());
        opCodeList.add(new OperatorCodeLt());
        opCodeList.add(new OperatorCodeOr());
        opCodeList.add(new OperatorCodeAdd());
        opCodeList.add(new OperatorCodeAnd());
        opCodeList.add(new OperatorCodeAsg());
        opCodeList.add(new OperatorCodeCal());
        opCodeList.add(new OperatorCodeDec());
        opCodeList.add(new OperatorCodeDiv());
        opCodeList.add(new OperatorCodeEnd());
        opCodeList.add(new OperatorCodeEql());
        opCodeList.add(new OperatorCodeGte());
        opCodeList.add(new OperatorCodeJmp());
        opCodeList.add(new OperatorCodeLte());
        opCodeList.add(new OperatorCodeMul());
        opCodeList.add(new OperatorCodeNql());
        opCodeList.add(new OperatorCodeSub());
        opCodeList.add(new OperatorCodeCase());
        opCodeList.add(new OperatorCodeElse());
        opCodeList.add(new OperatorCodeEndIf());
        opCodeList.add(new OperatorCodeElseIf());
        opCodeList.add(new OperatorCodeSwitch());
        opCodeList.add(new OperatorCodeDefault());
        opCodeList.add(new OperatorCodeEndSwitch());
        
        mainFunction = compiler.functionList.get(compiler.functionList.size() - 1);
    }

    public boolean findFunction(String functionName)
    {
        return compiler.findFunction(functionName);
    }

    public FunctionInformation getFunction(String functionName)
    {
        return compiler.getFunction(functionName);
    }

    public LineEntry parseLine(String line)
    {
        String procLine = line + " ";

        int state = 0; // 0 = init, 1 = op code read, 2 = inside string
        StringBuilder opCode = new StringBuilder();

        StringBuilder curArgument = new StringBuilder();
        ArrayList<String> arguments = new ArrayList<String>();

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

                if (theChar == ' ')
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

        LineEntry newLineEntry = new LineEntry();

        newLineEntry.opCode = opCode.toString();
        newLineEntry.arguments = arguments;

        return newLineEntry;
    }

    public void execute()
    {
        // set curFunction to main
        FuncStackEntry mainFunctionStack = programState.new FuncStackEntry();

        mainFunctionStack.functionName          = "main";
        mainFunctionStack.functionScope         = new SymbolDatabase();

        mainFunctionStack.programCounter        = 0;

        mainFunctionStack.functionInfoHandle    = mainFunction;

        programState.FUNCTION_STACK.push(mainFunctionStack);

        FuncStackEntry curFunc = null;

        do
        {
            if (programState.FUNCTION_STACK.size() > 0)
            {
                curFunc                     = programState.FUNCTION_STACK.peek();
                programState.currentScope   = curFunc.functionScope;

                String      line        = curFunc.functionInfoHandle.ilCode.get(curFunc.programCounter);
                LineEntry   lineEntry   = parseLine(line);

                for (OperatorCode opCode : opCodeList)
                {
                    if (opCode.getOperatorCode().toLowerCase().equals(lineEntry.opCode.toLowerCase()))
                    {
                        opCode.process(programState, lineEntry.arguments);

                        if (opCode.incrementHandled() == false)
                        {
                            curFunc.programCounter += 1;
                        }
                    }
                }
            }
            else
            {
                break;
            }
            
            // Notice we don't pop the function here. It is the opcode "END"'s job to do that.
            
        } while (curFunc.programCounter < curFunc.functionInfoHandle.ilCode.size());
    }
}
