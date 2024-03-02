package general;

import java.util.Scanner;

/**
 * Volume.java uses 
 * - putInsideBox() method from GeneralUtilities.java and
 * - evaluate() method from InfixToPostfixConverter.java .
 * 
 * If Teacher is manually compiling using command-line, please
 * also compile these classes.
 * 
 * If Teacher is using Eclipse, it will automatically compile
 * them for you when you click "Run".
 */
class Volume {
    static int shape;

    static String[] shapes = {
            "Cube",
            "Triangular Prism",
            "Cuboid",
            "Pyramid",
    };

    static String[] formulae = {
            "Volume of cube = s * s * s",
            "Volume of triangular prism = (b * h * l) / 2",
            "Volume of cuboid = l * w * h",
            "Volume of pyramid = (l * w * h) / 3",
    };

    public static void main(String argv[]) {
        System.out.println("\tVOLUME CALCULATOR");
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

        volume(sc, formulae[shape]);

        sc.close();
    }

    static void volume(Scanner sc, String formula) {
        GeneralUtilities.putInsideBox(formula);
        String parts[] = formula.split("=", 2);
        double ans = FormulaParser.evaluate(sc, parts[1]);
        System.out.println("> " + parts[0] + "= " + ans);
    }
}
