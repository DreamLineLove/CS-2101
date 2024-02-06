// Teacher, please also compile FormulaParser.java because Converter.java 
// calls the evaluate() method from FormulaParser in line 55 down below.

import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

class Converter {
    static int which;

    static String []conversions = {
        "Fahrenheit to Celsius",
        "Celsius to Fahrenheit",
        "Kelvin to Celsius",
        "Celsius to Kelvin",
    };

    static String []formulae = {
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

        System.out.println("!.\tOnly integers may be calculated.");
        System.out.println("e.g.    5 is allowed.");
        System.out.println("        5.54 is not allowed.\n");

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
        formula(formula);
        String []parts = formula.split(" = ", 2);
        int ans = FormulaParser.evaluate(sc, parts[1]);
        System.out.println("> " + parts[0] + " = " + ans);
    }

    static void formula(String s) {
        System.out.println();
        for (int i = 0; i < s.length() + 4; i++) {
            if (i == 0) System.out.print("┌");
            else if (i == s.length() + 3) System.out.print("┐");
            else System.out.print("─");
        }
        System.out.println("\n│ " + s + " │");
        for (int i = 0; i < s.length() + 4; i++) {
            if (i == 0) System.out.print("└");
            else if (i == s.length() + 3) System.out.print("┘");
            else System.out.print("─");
        }
        System.out.println();

        HashSet<Character> symbolSet = FormulaParser.getSymbolSet(s);
        for (char c : symbolSet) {
            System.out.println(" " + c + " = " + unitsMap.get(c));
        }
        System.out.println();
    }
}
