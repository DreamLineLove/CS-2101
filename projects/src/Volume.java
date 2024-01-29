import java.util.Scanner;

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

        System.out.println("!.\tOnly integers may be calculated.");
        System.out.println("e.g.    5 is allowed.");
        System.out.println("        5.54 is not allowed.\n");

        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < shapes.length; i++) {
            System.out.println(i + "\t" + shapes[i]);
        }
        System.out.print("\nType number.. ");
        shape = sc.nextInt();

        volume(sc, formulae[shape]);

        sc.close();
    }

    static void volume(Scanner sc, String formula) {
        putInsideBox(formula);
        String parts[] = formula.split("=", 2);
        int ans = FormulaParser.evaluate(sc, parts[1]);
        System.out.println("> " + parts[0] + "= " + ans);
    }

    static void putInsideBox(String s) {
        for (int i = 0; i < s.length() + 4; i++) {
            if (i == 0)
                System.out.print("┌");
            else if (i == s.length() + 3)
                System.out.print("┐");
            else
                System.out.print("─");
        }
        System.out.println("\n│ " + s + " │");
        for (int i = 0; i < s.length() + 4; i++) {
            if (i == 0)
                System.out.print("└");
            else if (i == s.length() + 3)
                System.out.print("┘");
            else
                System.out.print("─");
        }
        System.out.println("\n");
    }
}
