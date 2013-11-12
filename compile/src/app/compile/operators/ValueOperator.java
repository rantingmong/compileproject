package app.compile.operators;

import app.compile.core.DataValue;

public abstract class ValueOperator
{
    public abstract boolean     IsOperator  (String value);
    
    public abstract DataValue   Process     (DataValue lhs, DataValue rhs);
}
