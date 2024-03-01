package general;

import java.util.HashMap;
import java.util.Scanner;

/**
 * BinarySearch.java uses 
 * - formula() method from GeneralUtilities.java , 
 * - evaluate() method from InfixToPostfixFormulaParser.java .
 * 
 * If Teacher is manually compiling using command-line, please
 * also compile these classes.
 * 
 * If Teacher is using Eclipse, it will automatically compile
 * them for you when you click "Run".
 */
class Converter {
 static int which;

 static String[] conversions = {
     "Fahrenheit to Celsius",
     "Celsius to Fahrenheit",
     "Kelvin to Celsius",
     "Celsius to Kelvin",
 };

 static String[] formulae = {
     "C = (F - 32) * 5 / 9",
     "F = (C * 9) / 5 + 32",
     "C = K - 273",
     "K = C + 273",
 };

 static HashMap<Character, String> unitsMap = new HashMap<>();
 static {
     unitsMap.put('F', "fahrenheit");
     unitsMap.put('C', "celsius");
     unitsMap.put('K', "kelvin");
 }

 public static void main(String []args) {
     System.out.println("\tUNIT CONVERTER");
     System.out.println("\t--------------");

     // System.out.println("!.\tOnly integers may be calculated.");
     // System.out.println("e.g.    5 is allowed.");
     // System.out.println("        5.54 is not allowed.\n");

     Scanner sc = new Scanner(System.in);
     for (int i = 0; i < conversions.length; i++) {
         System.out.println(i + "\t" + conversions[i]);
     }
     System.out.print("\nType number.. ");
     which = sc.nextInt();

     convert(sc, formulae[which]);

     sc.close();
 }

 static void convert(Scanner sc, String formula) {
     GeneralUtilities.formula(formula, unitsMap);
     String[] parts = formula.split(" = ", 2);
     double ans = InfixToPostfixFormulaParser.evaluate(sc, parts[1]);
     System.out.println("> " + parts[0] + " = " + ans);
 }
}
