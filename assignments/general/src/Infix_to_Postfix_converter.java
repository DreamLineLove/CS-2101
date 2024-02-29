import java.util.Stack;
import java.util.Scanner;

class InfixToPostfixConverter {
    static boolean isOperand(char c) {
        boolean isDigit = (c >= '0' && c <= '9') ? true : false;
        return (isDigit || c == '.' || Character.isLetter(c));
    }

    static boolean isOperator(char c) {
        return (c == '+' || c == '-' || c == '*' || c == '/' || c == '(' || c == ')');
    }

    static int getNumericValue(char c) {
        return c - '0';
    }

    static int getPrecedence(char c) {
        switch (c) {
            case '+':
            case '-': return 1;
            case '*':
            case '/': return 2;
            default: return -1;
        }
    }

    static String toPostfix(String infixStr) {
        String postfixStr = "";
        Stack<Character> operators = new Stack<>();

        double val = 0;
        int power = 1;
        boolean isFractional = false;
        boolean tempered = false;

        outer: for (int i = 0; i < infixStr.length(); i++) {
            char c = infixStr.charAt(i);

            if (isOperand(c)) {
                if (Character.isLetter(c)) {
                    postfixStr += c + " ";
                    continue outer;
                }
                if (c == '.') {
                    isFractional = true;
                    continue outer;
                }
                if (isFractional) {
                    val += getNumericValue(c) / Math.pow(10, power);
                    power++;
                    tempered = true;
                } else {
                    val = val * 10 + getNumericValue(c);
                    tempered = true;
                }
                if (i < infixStr.length() - 1) {
                    char next = infixStr.charAt(i + 1);
                    if (!isOperand(next) && tempered) postfixStr += String.valueOf(val) + " ";
                }
            } else if (isOperator(c)) {
                val = 0;
                power = 1;
                isFractional = false;
                tempered = false;
                if (c == '(') {
                    operators.add(c);
                } else if (operators.isEmpty()) {
                    operators.add(c);
                } else if (operators.peek() == '(') {
                    operators.add(c);
                } else if (c == ')') {
                    while (operators.peek() != '(') {
                        postfixStr += operators.pop() + " ";
                    }
                    operators.pop();
                } else if (getPrecedence(c) > getPrecedence(operators.peek())) {
                    operators.add(c);
                } else {
                    char prev = operators.pop();
                    postfixStr += prev + " ";
                    operators.add(c);
                }
            } 
        }
        if (tempered) postfixStr += String.valueOf(val) + " ";
        while (!operators.isEmpty()) {
            postfixStr += operators.pop() + " ";
        }

        return postfixStr;
    }

    public static void main(String[] args) {
        System.out.println("\tINFIX to POSTFIX converter");
        System.out.println("\t--------------------------\n");

        System.out.println("INFIX    \t5.5 * (x - y)\tis equal to");
        System.out.println("POSTFIX  \t5.5 x y - *");

        System.out.println("\nLIMITATION");
        System.out.println("----------");
        System.out.println("- Cannot parse negative numbers yet.");
        System.out.println("  e.g. Inputting 5.5 + (-2.5) will not produce its equivalent in postfix form\n");
        Scanner sc = new Scanner(System.in);

        String infixStr;
        System.out.print("Enter infix expression:\t");
        infixStr = sc.nextLine();

        System.out.println("Postfix expression    : " + toPostfix(infixStr));
        sc.close();
    }
}
