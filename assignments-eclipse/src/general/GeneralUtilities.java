package general;

import java.util.HashSet;
import java.util.HashMap;

class GeneralUtilities {
	static int[] randomIntArray(int size) {
		int[] arr = new int[size];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int)(Math.round(Math.random() * 9));
		}
		return arr;
	}

    static void printIntArray(int[] array, String description) {
        System.out.print(description);
        for (int i = 0; i < array.length; i++) {
            if (array.length > 10 && i == 0) System.out.println();
            System.out.print(array[i] + " ");
            if ((i + 1) % 10 == 0 && array.length > 10) System.out.println();
        }
        System.out.println();
    }
    
    static void putInsideBox(String s) {
        for (int i = 0; i < s.length() + 4; i++) {
            if (i == 0)
                System.out.print("┌");
            else if (i == s.length() + 3)
                System.out.print("┐");
            else
                System.out.print("─");
        }
        System.out.println("\n│ " + s + " │");
        for (int i = 0; i < s.length() + 4; i++) {
            if (i == 0)
                System.out.print("└");
            else if (i == s.length() + 3)
                System.out.print("┘");
            else
                System.out.print("─");
        }
        System.out.println("\n");
    }

    static void formula(String s, HashMap<Character, String> glossary) {
        // System.out.println();
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

        HashSet<Character> symbolSet = InfixToPostfixFormulaParser.uniqueSymbols(s);
        for (char c : symbolSet) {
            System.out.println(" " + c + " = " + glossary.get(c));
        }
        System.out.println();
    }
}
