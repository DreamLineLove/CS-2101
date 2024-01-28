import java.util.Scanner;

class Area {

    static int shape;
    static String []shapes = {
        "Square",
        "Triangle",
        "Rectangle",
        "Parallelogram",
        "Trapezoid",
    };
    static String []formulae = {
        "Area of square = L * L",
        "Area of triangle = (b * h) / 2",
        "Area of rectangle = l * w",
        "Area of parallelogram = b * h",
        "Area of trapezoid = ((a + b) / 2) * h",
    };

    public static void main(String argv[]) {
        System.out.println("\tAREA CALCULATOR");
        System.out.println("\t---------------");

        System.out.println("!.\tOnly integers may be calculated.");
        System.out.println("e.g.    5 is allowed.");
        System.out.println("        5.54 is not allowed.\n");

        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < shapes.length; i++) {
            System.out.println(i + "\t" + shapes[i]);
        }
        System.out.print("\nType number.. ");
        shape = sc.nextInt();

        calculateArea(sc, formulae[shape]);

        sc.close();
    }

    static void calculateArea(Scanner sc, String formula) {
        box(formula);
        String front = FormulaParser.separate(formula)[0];
        String terms = FormulaParser.separate(formula)[1];
        int result = FormulaParser.evaluate(sc, terms);
        System.out.println("> " + front + "= " + result);
    }

    static void box(String s) {
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
        System.out.println("\n");
    }

}
