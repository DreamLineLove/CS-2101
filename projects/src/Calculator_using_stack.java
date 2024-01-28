import java.util.Stack;

class CalculatorUsingStack {
    static boolean isDigit(char c) {
        return Character.isDigit(c);
    }

    static boolean isOperator(char c) {
        return (c == '+' || c == '-' || c == '*' || c == '/' || c == '(' || c == ')');
    }

    static double getPrecedence(char c) {
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

    static double operate(double val1, double val2, char c) {
        if (c == '+') return val1 + val2;
        if (c == '-') return val1 - val2;
        if (c == '*') return val1 * val2;
        return val1 / val2;
    }

    static double evaluate(String s) {
        Stack<Double> operands = new Stack<Double>();
        Stack<Character> operators = new Stack<Character>();

        double val = 0;
        int pos = 0;

        while (pos < s.length()) {
            char spot = s.charAt(pos);
            if (isDigit(spot)) {
                val = (val * 10) + Character.getNumericValue(spot);
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
                        double prev = operands.pop();
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
                        double prevval = operands.pop();
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
            double prev = operands.pop();
            char spot = operators.pop();
            val = operate(prev, val, spot);
        }
        return val;
    }

    public static void main(String []args) {
        System.out.println(evaluate("3 + 4 + 5"));
        System.out.println(evaluate("3 * 4 + 5"));
        System.out.println(evaluate("3 + 4 * 5"));
        System.out.println(evaluate("(3 + 4) * 5"));
    }
}

