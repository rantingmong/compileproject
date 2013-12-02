package app.compile.compiler;

import java.util.ArrayList;

import app.compile.core.FunctionInformation;
import app.compile.core.PackageInformation;

/**
 * 
 * This class converts the tree provided by ANTLR into IL-code to be consumed by
 * the interpreter.
 * 
 * @author micha_000
 * 
 */
public class Compiler
{
    public final ArrayList<FunctionInformation> functionList = new ArrayList<FunctionInformation>();

    public final ArrayList<PackageInformation>  packageList  = new ArrayList<PackageInformation>();
}
