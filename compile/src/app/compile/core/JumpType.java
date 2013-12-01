package app.compile.core;

/**
 * 
 * Jump types for <code>jumpToParent</code> method.
 * 
 * @author micha_000
 *
 */
public enum JumpType
{
    /**
     * This will inform the program that it should escape the current scope.
     */
    Escape,
    /**
     * This will inform the program that it should escape the current scope but
     * the program will move again to the start.
     */
    Pass
}
