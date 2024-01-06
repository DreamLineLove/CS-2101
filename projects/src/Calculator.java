import java.util.Scanner;
import java.util.InputMismatchException;
import java.util.NoSuchElementException;

class Calculator {

    public static void main(String argv[]) {
        System.out.println("\tCALCULATOR");
        System.out.println("\t----------\n");

        System.out.println("1.\tTwo operands may be used.");
        System.out.println("2.\t+ - * / < > are supported.");
        System.out.println("3.\tSpace is needed between operands and sign.");
        System.out.println("4.\tType q to exit.");
        System.out.println("\ne.g.    5 + 2");
        System.out.println("        7 > 2\n");
        Scanner sc = new Scanner(System.in);

        while (true) {
            try {
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
            } catch (InputMismatchException e) {
                System.out.println("\n! Only +-*/ and numeric values are accepted.");
                sc.nextLine();
            } catch (NoSuchElementException e) {
                System.out.println("\n! You forgot something.");
                sc.nextLine();
            }
        }

        System.out.println("\n\tThanks for using calculator!");
        sc.close();
    }

}
