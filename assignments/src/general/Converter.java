package general;

import java.util.HashMap;
import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * Converter.java uses 
 * - formula() method from GeneralUtilities.java , 
 * - evaluate() method from FormulaParser.java .
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
     "Hours to Seconds",
     "Minutes to Seconds",
 };

 static String[] formulae = {
     "C = (F - 32) * 5 / 9",
     "F = (C * 9) / 5 + 32",
     "C = K - 273",
     "K = C + 273",
     "S = H * 3600",
     "S = M * 60",
 };

 static HashMap<Character, String> unitsMap = new HashMap<>();
 static {
     unitsMap.put('F', "fahrenheit");
     unitsMap.put('C', "celsius");
     unitsMap.put('K', "kelvin");
     unitsMap.put('S', "seconds");
     unitsMap.put('H', "hours");
     unitsMap.put('M', "minutes");
 }
 
 static DecimalFormat formatter = new DecimalFormat("#.####");

 public static void main(String []args) {
     System.out.println("\tUNIT CONVERTER");
     System.out.println("\t--------------");

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
     double ans = FormulaParser.evaluate(sc, parts[1]);
     System.out.printf("> %s = %s\n", parts[0], formatter.format(ans));
 }
}
