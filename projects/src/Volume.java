import java.util.Scanner;
import java.util.InputMismatchException;

class Volume {

    public static void main(String argv[]) {
        int shape;
        String []shapes = {
            "Sphere",
            "Cube",
            "Triangular Prism",
            "Cuboid",
            "Cylinder",
            "Cone",
            "Pyramid",
        };

        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < shapes.length; i++) {
            System.out.println(i + "\t" + shapes[i]);
        }
        System.out.print("\nChoose shape.. ");
        shape = sc.nextInt();

        switch (shape) {
            case 0:
            calculateVolume(shapes[0].toLowerCase(), "Volume of sphere = 4/3 πr^3", sc, "radius");
            break;
            case 1:
            calculateVolume(shapes[1].toLowerCase(), "Volume of cube = s^3", sc, "side length");
            break;
            case 2:
            calculateVolume(shapes[2].toLowerCase(), "Volume of triangular prism = 1/2 bhl", sc, "base", "height", "length between the two triangles");
            break;
            case 3:
            calculateVolume(shapes[3].toLowerCase(), "Volume of cuboid = lwh", sc, "length", "width", "height");
            break;
            case 4:
            calculateVolume(shapes[4].toLowerCase(), "Volume of cylinder = πr^2h", sc, "radius of the base", "height");
            break;
            case 5:
            calculateVolume(shapes[5].toLowerCase(), "Volume of cone = 1/3 πr^2h", sc, "radius of the base", "height");
            break;
            case 6:
            calculateVolume(shapes[6].toLowerCase(), "Volume of pyramid = 1/3 lwh", sc, "length", "width", "height");
            break;
        }

        sc.close();
    }

    static void calculateVolume(String shape, String formula, Scanner sc, String... terms) throws InputMismatchException {
        double []valueOfTerms = new double[terms.length];
        box(formula);
        while (true) {
            try {
                for (int i = 0; i < terms.length; i++) {
                    System.out.print("Enter value of " + terms[i] + "\t");
                    valueOfTerms[i] = sc.nextDouble();
                }
                switch (shape) {
                    case "sphere":
                    System.out.println("- Volume of sphere = " + (Math.PI * valueOfTerms[0] * valueOfTerms[0] * valueOfTerms[0] * 4) / 3);
                    break;
                    case "cube":
                    System.out.println("- Volume of cube = " + valueOfTerms[0] * valueOfTerms[0] * valueOfTerms[0]);
                    break;
                    case "triangular prism":
                    System.out.println("- Volume of triangular prism = " + (valueOfTerms[0] * valueOfTerms[1] * valueOfTerms[2]) / 2);
                    break;
                    case "cuboid":
                    System.out.println("- Volume of cuboid = " + valueOfTerms[0] * valueOfTerms[1] * valueOfTerms[2]);
                    break;
                    case "cylinder":
                    System.out.println("- Volume of cylinder = " + Math.PI * valueOfTerms[0] * valueOfTerms[0] * valueOfTerms[1]);
                    break;
                    case "cone":
                    System.out.println("- Volume of cone = " + (Math.PI * valueOfTerms[0] * valueOfTerms[0] * valueOfTerms[1]) / 3);
                    break;
                    case "pyramid":
                    System.out.println("- Volume of pyramid = " + (valueOfTerms[0] * valueOfTerms[1] * valueOfTerms[2]) / 3);
                    break;
                }
                break;
            } catch (InputMismatchException e) {
                System.out.println("! The input must be numerical values.\n");
                sc.nextLine();
            }
        }
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
