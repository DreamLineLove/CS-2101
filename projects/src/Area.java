import java.util.Scanner;
import java.util.InputMismatchException;

class Area {

    public static void main(String argv[]) {
        int shape;
        String []shapes = {
            "Circle",
            "Square",
            "Triangle",
            "Rectangle",
            "Parallelogram",
            "Trapezoid",
            "Ellipse",
        };

        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < shapes.length; i++) {
            System.out.println(i + "\t" + shapes[i]);
        }
        System.out.print("\nChoose shape.. ");
        shape = sc.nextInt();

        while (true) {
            try {
                switch (shape) {
                    case 0:
                    calculateArea(shapes[0].toLowerCase(), "Area of circle = πr^2", sc, "radius");
                    break;
                    case 1:
                    calculateArea(shapes[1].toLowerCase(), "Area of square = length * length", sc, "side length");
                    break;
                    case 2:
                    calculateArea(shapes[2].toLowerCase(), "Area of triangle = 1/2 (base * height)", sc, "base", "height");
                    break;
                    case 3:
                    calculateArea(shapes[3].toLowerCase(), "Area of rectangle = length * width", sc, "length", "width");
                    break;
                    case 4:
                    calculateArea(shapes[4].toLowerCase(), "Area of parallelogram = base * height", sc, "base", "height");
                    break;
                    case 5:
                    calculateArea(shapes[5].toLowerCase(), "Area of trapezoid = ( (a + b) / 2 ) * height", sc, "a", "b", "height");
                    break;
                    case 6:
                    calculateArea(shapes[6].toLowerCase(), "Area of ellipse = πab", sc, "a", "b");
                    break;
                }
                break;
            } catch (InputMismatchException e ) {
                System.out.println("The input must be numerical values.\n");
            }
        }

        sc.close();
    }

    static void calculateArea(String shape, String formula, Scanner sc, String... terms) throws InputMismatchException {
        double []valueOfTerms = new double[terms.length];
        surround(formula);
        try {
            for (int i = 0; i < terms.length; i++) {
                System.out.print("Enter value of " + terms[i] + "\t");
                valueOfTerms[i] = sc.nextDouble();
            }
        } catch (InputMismatchException e) {}
        switch (shape) {
            case "circle":
                System.out.println("- Area of circle = " + Math.PI * valueOfTerms[0] * valueOfTerms[0]);
                break;
            case "square":
                System.out.println("- Area of square = " + valueOfTerms[0] * valueOfTerms[0]);
                break;
            case "triangle":
                System.out.println("- Area of triangle = " + ((valueOfTerms[0] * valueOfTerms[1]) / 2));
                break;
            case "rectangle":
                System.out.println("- Area of rectangle = " + valueOfTerms[0] * valueOfTerms[1]);
                break;
            case "parallelogram":
                System.out.println("- Area of parallelogram = " + valueOfTerms[0] * valueOfTerms[1]);
                break;
            case "trapezoid":
                System.out.println("- Area of trapezoid = " + ((valueOfTerms[0] + valueOfTerms[1]) / 2) * valueOfTerms[2]);
                break;
            case "ellipse":
                System.out.println("- Area of ellipse = " + Math.PI * valueOfTerms[0] * valueOfTerms[1]);
                break;
        }
    }

    static void surround(String s) {
        for (int i = 0; i < s.length() + 4; i++) {
            System.out.print("-");
        }
        System.out.println("\n| " + s + " |");
        for (int i = 0; i < s.length() + 4; i++) {
            System.out.print("-");
        }
        System.out.println("\n");
    }

}
