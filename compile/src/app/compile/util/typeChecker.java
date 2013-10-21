package app.compile.util;

public class typeChecker
{
    public static boolean isTokenAString(String input) {

        return input.contains("<") && input.contains(">");
    }
}
