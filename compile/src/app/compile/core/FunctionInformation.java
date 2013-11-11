package app.compile.core;

import java.util.ArrayList;

import app.compile.parser.codeParser.Group_statementContext;

public class FunctionInformation
{
    public String                           functionName    = "";
    public ArrayList<ParameterInformation>  parameterList   = new ArrayList<ParameterInformation>();
    
    public DataType                         returnType      = DataType.NOTHING;
    
    public Group_statementContext           functionStatements;
}
