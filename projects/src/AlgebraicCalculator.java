import java.util.Scanner;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.Stack;

class AlgebraicCalculator {
    static boolean isDigit(char c) {
        return Character.isDigit(c);
    }

    static boolean isLetter(char c) {
        return Character.isLetter(c);
    }

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

    static ArrayList<Character> extractVariables(String s) {
        ArrayList<Character> varArr = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (isLetter(c)) varArr.add(c);
        }
        return varArr;
    }

    static HashMap<Character, Integer> mapVariables(ArrayList<Character> varArr, int []terms) {
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < terms.length; i++) {
            map.put(varArr.get(i), terms[i]);
        }
        return map;
    }

    static int[] getTerms(Scanner sc, ArrayList<Character> varArr) {
        int terms[] = new int[varArr.size()];
        for (int i = 0; i < terms.length; i++) {
            System.out.print("value of " + varArr.get(i) + ": ");
            terms[i] = sc.nextInt();
        }
        return terms;
    }

    static int evaluate(Scanner sc, String s) {
        ArrayList<Character> varArr = extractVariables(s);
        int terms[] = getTerms(sc, varArr);
        HashMap<Character, Integer> map = mapVariables(varArr, terms);
        Stack<Integer> operands = new Stack<Integer>();
        Stack<Character> operators = new Stack<Character>();

        int val = 0;
        int pos = 0;

        while (pos < s.length()) {
            char spot = s.charAt(pos);
            if (isDigit(spot)) {
                val = (val * 10) + Character.getNumericValue(spot);
            } else if (isLetter(spot)) {
                val = map.get(spot);
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

    public static void main(String []args) {
        System.out.println("\tCALCULATOR (algebraic/symbolic)");
        System.out.println("\t-------------------------------\n");

        System.out.println("1.\tBoth characters and integers may be used.");
        System.out.println("2.\t+ - * / ( ) are supported.");
        System.out.println("3.\tAvoid using nested ().");
        System.out.println("4.\tType q to exit.");
        System.out.println("\ne.g.    x + 2");
        System.out.println("        (7 * a) + b");
        System.out.println("        (x * y) + z * 4 \n");
        Scanner sc = new Scanner(System.in);
        
        while (true) {
                System.out.print("Enter: \t");
                if (sc.hasNext("q")) break;
                else {
                    String s = sc.nextLine();
                    System.out.println("> \t" + evaluate(sc, s) + "\n"); 
                    sc.nextLine();
                }
        }

        System.out.println("\n\tThanks for using calculator!");
        sc.close();
    }
}

