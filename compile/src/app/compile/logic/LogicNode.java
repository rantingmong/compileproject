package app.compile.logic;

import app.compile.core.DataValue;

public class LogicNode
{
    public boolean          visited = false;
    
    public LogicNodeType    type;
    
    public String           additionalData;
    public String           operator;
    
    public DataValue        data;
    
    public LogicNode        parent;
    
    public LogicNode        leftSide;
    public LogicNode        rightSide;
}
