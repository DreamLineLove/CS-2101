package general;

import java.util.Scanner;

class RegexCalculator {
    public static void main(String argv[]) {
        System.out.println("\tCALCULATOR (using regex)");
        System.out.println("\t------------------------\n");

        System.out.println("1.\tTwo operands may be used.");
        System.out.println("2.\t+ - * / < > are supported.");
        System.out.println("3.\tSpace is needed between operands and sign.");
        System.out.println("4.\tType q to exit.");
        System.out.println("\ne.g.    5 + 2");
        System.out.println("        7 > 2\n");
        Scanner sc = new Scanner(System.in);

        while (true) {
                System.out.print(">\t");
                if (sc.hasNext("q")) break;
                else {
                    double op1 = sc.nextDouble();
                    String opStr = sc.next("[+\\-*/><|&]");
                    char operator = opStr.charAt(0);
                    double op2 = sc.nextDouble();

                    switch (operator) {
                        case '+':
                        System.out.println(op1 + " " + operator + " " + op2 + " = " + (op1 + op2) + "\n");
                        break;
                        case '-':
                        System.out.println(op1 + " " + operator + " " + op2 + " = " + (op1 - op2) + "\n");
                        break;
                        case '*':
                        System.out.println(op1 + " " + operator + " " + op2 + " = " + (op1 * op2) + "\n");
                        break;
                        case '/':
                        System.out.println(op1 + " " + operator + " " + op2 + " = " + (op1 / op2) + "\n");
                        break;
                        case '>':
                        System.out.println(op1 + " " + operator + " " + op2 + " = " + (op1 > op2) + "\n");
                        break;
                        case '<':
                        System.out.println(op1 + " " + operator + " " + op2 + " = " + (op1 < op2) + "\n");
                        break;
                    }
                }
        }

        System.out.println("\n\tThanks for using regex calculator!");
        sc.close();
    }
}
