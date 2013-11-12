package app.compile.operators;

import java.util.ArrayList;

public class ValueOperatorManager
{
    private static ValueOperatorManager instance = new ValueOperatorManager();
    
    public static ValueOperatorManager getInstance()
    {
        return instance;
    }
    
    private final ArrayList<ValueOperator> operators = new ArrayList<ValueOperator>();
    
    public ArrayList<ValueOperator> getOperators()
    {
        return operators;
    }
    
    private ValueOperatorManager()
    {
        operators.add(new ValueOperatorAnd());
        operators.add(new ValueOperatorLte());
    }
}
