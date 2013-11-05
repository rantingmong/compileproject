package app.compile.util;

public class stateMachine
{
    public static final String STATE_INVALID    = "INVALID";
    public static final String SCOPE_NO_SCOPE   = "NO_SCOPE";
    
    public static final String STATE_FUNCTION   = "FUNCTION";
    
    private String  currentState    = STATE_INVALID;
    private String  currentScope    = SCOPE_NO_SCOPE;
    
    public String   getCurrentState ()
    {
        return currentState;
    }
    public void     setCurrentState (String value)
    {
        currentState = value;
    }


    public String   getCurrentScope ()
    {
        return currentScope;
    }

    public void     setCurrentScope (String currentScope)
    {
        this.currentScope = currentScope;
    }
}
