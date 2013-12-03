package app.compile.core;

import java.util.ArrayList;

public abstract class PackageInformation
{
    protected ArrayList<FunctionInformation> functions = new ArrayList<FunctionInformation>();
    
    public abstract void            setFunctions    ();
    
    public abstract String          getName         ();

    public PackageInformation()
    {
        setFunctions();
    }
    
    public boolean                  findFunction    (String functionName)
    {
        for (FunctionInformation fInfo : functions)
        {
            if (fInfo.functionName.equals(functionName))
            {
                return true;
            }
        }
        
        return false;
    }
    
    public FunctionInformation      getFunction     (String functionName)
    {
        for (FunctionInformation fInfo : functions)
        {
            if (fInfo.functionName.equals(functionName))
            {
                return fInfo;
            }
        }
        
        return null;
    }
}
