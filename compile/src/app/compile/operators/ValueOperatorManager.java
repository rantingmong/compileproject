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
        operators.add(new ValueOperatorLt());
        operators.add(new ValueOperatorGte());
        operators.add(new ValueOperatorGt());
        operators.add(new ValueOperatorEquals());
        operators.add(new ValueOperatorNotEquals());
    }
}
