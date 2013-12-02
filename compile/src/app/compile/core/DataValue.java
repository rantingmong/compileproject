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
        try
        {
            return Float.parseFloat(value);
        }
        catch (NumberFormatException nfe)
        {
            return 0;
        }
    }
    
    public int          valueAsInt      ()
    {
        try
        {
            return Integer.parseInt(value);
        }
        catch (NumberFormatException nfe)
        {
            return 0;
        }
    }
    
    public char         valueAsChar     ()
    {
        return value.charAt(0);
    }
    
    public String       valueAsString   ()
    {
        return value;
    }
    
    public boolean      valueAsTorf     ()
    {
        if      (value.toLowerCase().equals("true"))
        {
            return true;
        }
        else if (value.toLowerCase().equals("false"))
        {
            return false;
        }
        else
        {
            return valueAsInt() >= 1;
        }
    }
}
