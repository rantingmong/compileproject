package app.compile.core.packages;

import java.util.ArrayList;
import java.util.Scanner;

import app.compile.core.DataType;
import app.compile.core.DataValue;
import app.compile.core.FunctionInformation;
import app.compile.core.PackageInformation;
import app.compile.core.ParameterInformation;
import app.compile.core.FunctionInformation.NativeAction;
import app.compile.database.SymbolDatabase;
import app.compile.interpreter.ProgramState;
import app.compile.util.ValueGetter;

public class PackageInformationStandard extends PackageInformation
{
    @Override
    public void setFunctions()
    {
        ArrayList<FunctionInformation> functions = new ArrayList<FunctionInformation>();

        // =====================================================================================================

        ParameterInformation printTextParam1 = new ParameterInformation();

        printTextParam1.dataType = DataType.CHARACTERS;
        printTextParam1.parameterName = "input";

        FunctionInformation printText = new FunctionInformation();

        printText.functionName = "printText";
        printText.isNative = true;
        printText.returnType = DataType.NOTHING;

        printText.parameterList.add(printTextParam1);

        printText.nativeAction = new NativeAction()
        {
            @Override
            public void execute(ProgramState state, SymbolDatabase scope)
            {
                System.out.println(ValueGetter.getValue(state.FUNCTION_STACK.peek().ARGS_LIST[0].valueAsString(), state, scope).valueAsString());
            }
        };

        // =====================================================================================================

        FunctionInformation readText = new FunctionInformation();

        readText.functionName = "readText";
        readText.isNative = true;
        readText.returnType = DataType.NOTHING;

        readText.nativeAction = new NativeAction()
        {
            @Override
            public void execute(ProgramState state, SymbolDatabase scope)
            {
                Scanner s = new Scanner(System.in);
                state.RET = new DataValue(DataType.CHARACTERS, s.nextLine());

                s.close();
            }
        };

        // =====================================================================================================

        ParameterInformation wholeNumberToStringParam1 = new ParameterInformation();

        wholeNumberToStringParam1.dataType = DataType.WHOLE_NUMBER;
        wholeNumberToStringParam1.parameterName = "number";

        FunctionInformation wholeNumberToString = new FunctionInformation();

        wholeNumberToString.functionName = "wholeNumberToString";
        wholeNumberToString.isNative = true;
        wholeNumberToString.returnType = DataType.CHARACTERS;

        wholeNumberToString.parameterList.add(wholeNumberToStringParam1);
        
        wholeNumberToString.nativeAction = new NativeAction()
        {
            @Override
            public void execute(ProgramState state, SymbolDatabase scope)
            {
                state.RET = new DataValue(DataType.CHARACTERS, ValueGetter.getValue(state.FUNCTION_STACK.peek().ARGS_LIST[0].valueAsString(), state, scope).valueAsString());
            }
        };

        // =====================================================================================================

        ParameterInformation realNumberToStringParam1 = new ParameterInformation();

        realNumberToStringParam1.dataType = DataType.REAL_NUMBER;
        realNumberToStringParam1.parameterName = "number";

        FunctionInformation realNumberToString = new FunctionInformation();

        realNumberToString.functionName = "realNumberToString";
        realNumberToString.isNative = true;
        realNumberToString.returnType = DataType.CHARACTERS;
        
        realNumberToString.parameterList.add(realNumberToStringParam1);
        
        realNumberToString.nativeAction = new NativeAction()
        {
            @Override
            public void execute(ProgramState state, SymbolDatabase scope)
            {
                state.RET = new DataValue(DataType.CHARACTERS, state.FUNCTION_STACK.peek().ARGS_LIST[0].valueAsString());
            }
        };

        // =====================================================================================================

        ParameterInformation torfToStringParam1 = new ParameterInformation();

        torfToStringParam1.dataType = DataType.TORF;
        torfToStringParam1.parameterName = "boolean";

        FunctionInformation torfToString = new FunctionInformation();

        torfToString.functionName = "torfToString";
        torfToString.isNative = true;
        torfToString.returnType = DataType.CHARACTERS;

        torfToString.parameterList.add(torfToStringParam1);
        
        torfToString.nativeAction = new NativeAction()
        {
            @Override
            public void execute(ProgramState state, SymbolDatabase scope)
            {
                state.RET = new DataValue(DataType.CHARACTERS, state.FUNCTION_STACK.peek().ARGS_LIST[0].valueAsString());
            }
        };

        // =====================================================================================================

        ParameterInformation symbolToStringParam1 = new ParameterInformation();

        symbolToStringParam1.dataType = DataType.SYMBOL;
        symbolToStringParam1.parameterName = "char";

        FunctionInformation symbolToString = new FunctionInformation();

        symbolToString.functionName = "symbolToString";
        symbolToString.isNative = true;
        symbolToString.returnType = DataType.CHARACTERS;
        
        symbolToString.parameterList.add(symbolToStringParam1);

        symbolToString.nativeAction = new NativeAction()
        {
            @Override
            public void execute(ProgramState state, SymbolDatabase scope)
            {
                state.RET = new DataValue(DataType.CHARACTERS, state.FUNCTION_STACK.peek().ARGS_LIST[0].valueAsString());
            }
        };

        // =====================================================================================================

        functions.add(printText);
        functions.add(readText);

        functions.add(wholeNumberToString);
        functions.add(realNumberToString);
        functions.add(torfToString);
        functions.add(symbolToString);

        this.functions = functions;
    }

    @Override
    public String getName()
    {
        return "standard";
    }
}
