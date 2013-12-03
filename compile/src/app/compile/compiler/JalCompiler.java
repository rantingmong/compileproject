package app.compile.compiler;

import java.util.ArrayList;

import app.compile.core.FunctionInformation;
import app.compile.core.PackageInformation;
import app.compile.core.packages.PackageInformationStandard;
import app.compile.database.SymbolDatabase;

/**
 * 
 * This class converts the tree provided by ANTLR into IL-code to be consumed by
 * the interpreter.
 * 
 * @author micha_000
 * 
 */
public class JalCompiler
{
    public final ArrayList<FunctionInformation> functionList = new ArrayList<FunctionInformation>();

    public final ArrayList<PackageInformation>  packageList  = new ArrayList<PackageInformation>();

    public FunctionInformation                  curFunction  = null;

    public SymbolDatabase                       currentScope = new SymbolDatabase();
    
    public JalCompiler                          ()
    {
        packageList.add(new PackageInformationStandard());
    }
    
    public boolean                              findFunction (String functionName)
    {
        for (FunctionInformation fInfo : functionList)
        {
            if (fInfo.functionName.equals(functionName))
            {
                return true;
            }
        }
        
        for (PackageInformation p : packageList)
        {
            return p.findFunction(functionName);
        }
        
        return false;
    }
    
    public FunctionInformation                  getFunction  (String functionName)
    {
        for (FunctionInformation fInfo : functionList)
        {
            if (fInfo.functionName.equals(functionName))
            {
                return fInfo;
            }
        }

        for (PackageInformation p : packageList)
        {
            return p.getFunction(functionName);
        }
        
        return null;
    }
}
