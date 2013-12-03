package app.compile.util;

import org.antlr.v4.runtime.Token;

public class ErrorReporter
{
    public static void reportError(Token where, String error)
    {
        int line = where.getLine();
        int colm = where.getCharPositionInLine();
        
        System.err.println(String.format("Line %s, Column %s: %s", line, colm, error));
    }
}
