package app.compile.core;

import java.util.List;

import app.compile.codeDataTypes;
import app.compile.executions.executionNode;

public class functionInformation
{
    public String                       functionName;
    public codeDataTypes                returnType;
    
    public List<parameterInformation>   parameterList;
    
    public List<executionNode>          statements;
}
