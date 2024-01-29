import java.util.Scanner;

class Statistics_CompoundInterest {
    static String []terms = {
        "A", "total amount after n years",
        "P", "principal (original value)",
        "r", "rate of interest per year",
        "n", "number of years the money is invested",
    };

    public static void main(String argv[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("\tCOMPOUND INTEREST CALCULATOR\n");
        formula("A = P (1 + r / 100)^n", terms);

        double []values = new double[terms.length / 2 - 1];
        for (int i = 2, j = 0; i < terms.length; i+=2, j++) {
            System.out.print("\tenter " + terms[i] + ": ");
            values[j] = sc.nextDouble();
        }

        System.out.printf("\nTotal amount after %.1f years = %.4f\n", values[2], calculate(values));

        sc.close();
    }

    static double calculate(double []terms) {
        return terms[0] * Math.pow(1 + (terms[1] / 100), terms[2]);
    }

    static void formula(String s, String... terms) {
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
        for (int i = 0; i < terms.length; i++) {
            if (i % 2 == 0) System.out.print(terms[i] + "   = ");
            else System.out.println(terms[i]);
        }
        System.out.println();
    }
}
