// Teacher, Area and Volume use the evaluate() method from this FormulaParser
// class. When running Area and Volume, please also compile this class.

import java.util.Scanner;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Stack;

class FormulaParser {
    static boolean isOperator(char c) {
        return (c == '+' || c == '-' || c == '*' || c == '/' || c == '(' || c == ')');
    }

    static int getPrecedence(char c) {
        switch (c) {
            case '+':
            case '-': return 1;
            case '*':
            case '/': return 2;
            case '(':
            case ')': return 3;
            default: return -1;
        }
    }

    static int operate(int val1, int val2, char c) {
        if (c == '+') return val1 + val2;
        if (c == '-') return val1 - val2;
        if (c == '*') return val1 * val2;
        return val1 / val2;
    }

    static HashMap<Character, Integer> getTerms(Scanner sc, String s) {
        HashSet<Character> varSet = new HashSet<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (Character.isLetter(c)) varSet.add(c);
        }

        int terms[] = new int[varSet.size()];
        int i = 0;
        for (Character c : varSet) {
            System.out.print("value of " + c + ": ");
            terms[i] = sc.nextInt();
            i++;        
        }

        HashMap<Character, Integer> map = new HashMap<>();
        i = 0;
        for (Character c : varSet) {
            map.put(c, terms[i]);
            i++;
        }
        return map;
    }

    static int evaluate(Scanner sc, String s) {
        HashMap<Character, Integer> variables = getTerms(sc, s);
        Stack<Integer> operands = new Stack<Integer>();
        Stack<Character> operators = new Stack<Character>();

        int val = 0;
        int pos = 0;

        while (pos < s.length()) {
            char spot = s.charAt(pos);
            if (Character.isDigit(spot)) {
                val = (val * 10) + Character.getNumericValue(spot);
            } else if (Character.isLetter(spot)) {
                val = variables.get(spot);
            } else if (isOperator(spot)) {
                if (spot == '(') {
                    operators.push(spot);
                    val = 0;
                }
                else if (operands.isEmpty()) {
                    operands.push(val);
                    operators.push(spot);
                    val = 0;
                }
                else if (spot == ')') {
                    operands.push(val);
                    while (operators.peek() != '(') {
                        spot = operators.pop();
                        val = operands.pop();
                        int prev = operands.pop();
                        val = operate(prev, val, spot);
                        operands.push(val);
                    }
                    operators.pop();
                    operands.pop();
                }
                else {
                    char prev = operators.peek();
                    if (getPrecedence(spot) > getPrecedence(prev)) {
                        operands.push(val);
                        operators.push(spot);
                        val = 0;
                    }
                    else {
                        int prevval = operands.pop();
                        char prevop = operators.pop();
                        prevval = operate(prevval, val, prevop);
                        operands.push(prevval);
                        operators.push(spot);
                        val = 0;
                    }
                }
            }
            pos++;
        }

        while (!operators.isEmpty()) {
            int prev = operands.pop();
            char spot = operators.pop();
            val = operate(prev, val, spot);
        }
        return val;
    }
}

