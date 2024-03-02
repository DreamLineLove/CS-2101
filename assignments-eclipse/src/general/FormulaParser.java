package general;

import java.util.Stack;
import java.util.HashSet;
import java.util.HashMap;
import java.util.Scanner;

/**
 * FormulaParser.java uses 
 * - evaluate() method from InfixToPostfixConverter.java .
 * 
 * If Teacher is manually compiling using command-line, please
 * also compile these classes.
 * 
 * If Teacher is using Eclipse, it will automatically compile
 * them for you when you click "Run".
 */
class FormulaParser {
	static HashMap<Character, Double> constants = new HashMap<>();
	static {
		constants.put('π', Math.PI);
	}

    static double operate(double op1, double op2, char operator) {
        if (operator == '+') return op1 + op2;
        if (operator == '-') return op1 - op2;
        if (operator == '*') return op1 * op2;
        return op1 / op2;
    }
    
    static HashSet<Character> uniqueSymbols(String postfixStr) {
        HashSet<Character> symbolSet = new HashSet<>();
        for (int i = 0; i < postfixStr.length(); i++) {
            char c = postfixStr.charAt(i);
            if (Character.isLetter(c)) symbolSet.add(c);
        }
        return symbolSet;
    }

    static HashMap<Character, Double> getTerms(Scanner sc, HashSet<Character> uniqueSymbols) {
        HashMap<Character, Double> map = new HashMap<>();
        for (char c : uniqueSymbols) {
        	if (!constants.containsKey(c)) {
        		System.out.print("value of " + c + ": ");
        		double val = sc.nextDouble();
        		map.put(c, val);
        	} else map.put(c, constants.get(c));
        }
        return map;
    }

    static double evaluate(Scanner sc, String infixStr) {
    	String postfixStr = InfixToPostfixConverter.toPostfix(infixStr);
        HashSet<Character> uniqueSymbols = uniqueSymbols(postfixStr);
        HashMap<Character, Double> terms = getTerms(sc, uniqueSymbols);
        Stack<Double> operands = new Stack<>();

        double val = 0;
        int power = 1;
        boolean isFractional = false;
        boolean tempered = false;

        outer: for (int i = 0; i < postfixStr.length(); i++) {
            char c = postfixStr.charAt(i);

            if (InfixToPostfixConverter.isOperand(c)) {
                if (Character.isLetter(c)) {
                    operands.add(terms.get(c));
                    continue outer;
                }
                if (c == '.') {
                    isFractional = true;
                    continue outer;
                }
                if (isFractional) {
                    val += InfixToPostfixConverter.getNumericValue(c) / Math.pow(10, power);
                    power++;
                    tempered = true;
                } else {
                    val = val * 10 + InfixToPostfixConverter.getNumericValue(c);
                    tempered = true;
                }
                if (i < postfixStr.length() - 1) {
                    char next = postfixStr.charAt(i + 1);
                    if (!InfixToPostfixConverter.isOperand(next) && tempered) {
                        operands.add(val);
                        val = 0;
                        power = 1;
                        isFractional = false;
                        tempered = false;
                    }
                }
            } else if (InfixToPostfixConverter.isOperator(c)) {
                double op2 = operands.pop();
                double op1 = operands.pop();
                double result = operate(op1, op2, c);
                operands.add(result);
            }
        }

        return operands.pop();
    }

    public static void main(String[] args) {
        System.out.println("\tINFIX to POSTFIX formula parser");
        System.out.println("\t-------------------------------\n");

        System.out.println("LIMITATION");
        System.out.println("----------");
        System.out.println("- Cannot evaluate negative operands yet.");
        System.out.println("  e.g. Inputting -5 + a * (-b) will not give the correct results!\n");
        Scanner sc = new Scanner(System.in);

        String infixStr;
        System.out.print("Enter infix expression:\t");
        infixStr = sc.nextLine();
        System.out.println("\n" + infixStr + " = " + evaluate(sc, infixStr));

        sc.close();
    }
}
