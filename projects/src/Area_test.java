import java.util.Scanner;

class Area_test {

    static int shape;
    static String []shapes = {
        "Circle",
        "Square",
        "Triangle",
        "Rectangle",
        "Parallelogram",
        "Trapezoid",
        "Ellipse",
    };
    static String []formulae = {
        "Area of circle = π * r * r",
        "Area of square = l * l",
        "Area of triangle = (b * h) / 2",
        "Area of rectangle = l * w",
        "Area of parallelogram = b * h",
        "Area of trapezoid = ((a + b) / 2) * h",
        "Area of ellipse = π * a * b",
    };

    public static void main(String argv[]) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < shapes.length; i++) {
            System.out.println(i + "\t" + shapes[i]);
        }
        System.out.print("\nChoose shape.. ");
        shape = sc.nextInt();

        calculateArea(sc, formulae[shape]);

        sc.close();
    }

    static void calculateArea(Scanner sc, String formula) {
        box(formula);
        String terms = FormulaParser.separateTerms(formula);
        FormulaParser.evaluate(sc, terms);
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
