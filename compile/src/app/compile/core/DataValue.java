package app.compile.core;

public class DataValue
{
    private String      value;
    private DataType    dataType;
    
    public              DataValue       (DataType dataType)
    {
        this.dataType   = dataType;
    }
    
    public              DataValue       (DataType dataType, String data)
    {
        this.value      = data;
        this.dataType   = dataType;
    }
    
    public DataType     getDataType     ()
    {
        return dataType;
    }
    
    public float        valueAsFloat    ()
    {
        return Float.parseFloat(value);
    }
    
    public int          valueAsInt      ()
    {
        return Integer.parseInt(value);
    }
    
    public char         valueAsChar     ()
    {
        return value.charAt(0);
    }
    
    public String       valueAsString   ()
    {
        return value;
    }
}
