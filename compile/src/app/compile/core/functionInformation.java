package app.compile.core;

import java.util.List;

import app.compile.executions.executionNode;

public class functionInformation
{
    public String                       functionName;
    public dataTypes                    returnType;
    
    public List<parameterInformation>   parameterList;

    public executionNode                intermediateCode;
}
