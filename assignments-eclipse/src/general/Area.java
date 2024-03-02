package general;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * Area.java uses 
 * - putInsideBox() method from GeneralUtilities.java and
 * - evaluate() method from FormulaParser.java .
 * 
 * If Teacher is manually compiling using command-line, please
 * also compile these classes.
 * 
 * If Teacher is using Eclipse, it will automatically compile
 * them for you when you click "Run".
 */
class Area {
	static DecimalFormat formatter = new DecimalFormat("#.####");

    static int shape;

    static String[] shapes = {
            "Circle",
            "Square",
            "Triangle",
            "Rectangle",
            "Parallelogram",
            "Trapezoid",
    };

    static String[] formulae = {
    		"Area of circle = π * r * r",
            "Area of square = s * s",
            "Area of triangle = (b * h) / 2",
            "Area of rectangle = l * w",
            "Area of parallelogram = b * h",
            "Area of trapezoid = ((a + b) / 2) * h",
    };

    public static void main(String argv[]) {
        System.out.println("\tAREA CALCULATOR");
        System.out.println("\t---------------");

        System.out.println("!.\tIntegers as well as floating-point numbers are permitted.");
        System.out.println("e.g.    5 is allowed.");
        System.out.println("        5.54 is also allowed.\n");

        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < shapes.length; i++) 
        {
            System.out.println(i + "\t" + shapes[i]);
        }
        System.out.print("\nType number.. ");
        shape = sc.nextInt();

        area(sc, formulae[shape]);

        sc.close();
    }

    static void area(Scanner sc, String formula) {
        GeneralUtilities.putInsideBox(formula);
        String parts[] = formula.split("=", 2);
        double ans = FormulaParser.evaluate(sc, parts[1]);
        System.out.println("> " + parts[0] + "= " + formatter.format(ans));
    }
}
