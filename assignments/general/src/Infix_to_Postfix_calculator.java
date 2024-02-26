import java.util.Stack;
import java.util.Scanner;

class InfixToPostfixCalculator {
    static double operate(double op1, double op2, char operator) {
        if (operator == '+') return op1 + op2;
        if (operator == '-') return op1 - op2;
        if (operator == '*') return op1 * op2;
        return op1 / op2;
    }

    static double evaluate(String postfixStr) {
        Stack<Double> operands = new Stack<>();

        double val = 0;
        int power = 1;
        boolean isFractional = false;
        boolean tempered = false;

        outer: for (int i = 0; i < postfixStr.length(); i++) {
            char c = postfixStr.charAt(i);

            if (InfixToPostfixConverter.isOperand(c)) {
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
        System.out.println("\tINFIX to POSTFIX calculator");
        System.out.println("\t---------------------------\n");

        System.out.println("LIMITATION");
        System.out.println("----------");
        System.out.println("- Cannot evaluate negative numbers yet.");
        System.out.println("  e.g. Inputting 5.5 + (-2.5) will not give the correct results!\n");
        Scanner sc = new Scanner(System.in);

        String infixStr;
        System.out.print("Enter infix expression:\t");
        infixStr = sc.nextLine();

        String postfixStr;
        postfixStr = InfixToPostfixConverter.toPostfix(infixStr);
        System.out.println("\n" + infixStr + " = " + evaluate(postfixStr));

        sc.close();
    }
}
