package app.compile.util;

public class Checker
{
    public static boolean checkIfTokenIsString(String token)
    {
        return token.charAt(0) == '<' && token.charAt(token.length() - 1) == '>';
    }

    public static boolean checkIfTokenIsChar(String token)
    {
        return checkIfTokenIsString(token) && (token.length() == 3);
    }

    public static boolean checkIfTokenIsNumber(String token)
    {
        try
        {
            Integer.valueOf(token);

            return true;
        }
        catch (NumberFormatException nfe)
        {
            return false;
        }
    }

    public static boolean checkIfTokenIsFloat(String token)
    {
        try
        {
            Float.valueOf(token);
            return true;
        }
        catch (NumberFormatException nfe)
        {
            return false;
        }
    }
    
    public static boolean checkIfTokenIsNothing(String token)
    {
        return token.toLowerCase().equals("nothing");
    }

    public static boolean checkIfTokenIsTorf(String token)
    {
        return token.toLowerCase().equals("true") || token.toLowerCase().equals("false");
    }
}
