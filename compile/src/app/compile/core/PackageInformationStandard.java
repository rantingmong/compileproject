package app.compile.core;

import java.util.ArrayList;
import java.util.Scanner;

import app.compile.core.FunctionInformation.NativeAction;
import app.compile.database.SymbolDatabase;
import app.compile.interpreter.ProgramState;

public class PackageInformationStandard extends PackageInformation
{
    @Override
    public void setFunctions()
    {
        ArrayList<FunctionInformation> functions = new ArrayList<FunctionInformation>();
        
        ParameterInformation printTextParam1                = new ParameterInformation();

                             printTextParam1.dataType       = DataType.CHARACTERS;
                             printTextParam1.parameterName  = "input";
             
        FunctionInformation  printText                      = new FunctionInformation();

                             printText.functionName         = "printText";
                             printText.isNative             = true;
        
        printText.parameterList.add(printTextParam1);

        printText.nativeAction = new NativeAction()
        {
            @Override
            public void execute(ProgramState state, SymbolDatabase scope)
            {
                System.out.println(state.ARGS_LIST.get(0).valueAsString());
            }
        };
        
        FunctionInformation readText                        = new FunctionInformation();
        
                            readText.functionName           = "readText";
                            readText.isNative               = true;

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

        functions.add(printText);
        functions.add(readText);
        
        this.functions = functions;
    }

    @Override
    public String getName()
    {
        return "standard";
    }
}
