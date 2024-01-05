import java.util.Scanner;

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

        switch (shape) {
            case 0:
                double []circle = new double[1];
                surround("Area of circle = Pi * radius * radius");
                System.out.print("Enter radius.. ");
                circle[0] = sc.nextDouble();
                System.out.println("- Area of circle = " + Math.PI * circle[0] * circle[0]);
                break;
            case 1:
                double []square = new double[1];
                surround("Area of square = length * length");
                System.out.print("Enter side length.. ");
                square[0] = sc.nextDouble();
                System.out.println("- Area of square = " + square[0] * square[0]);
                break;
            case 2:
                double []triangle = new double[2];
                surround("Area of triangle = 1/2 (base * height)");
                System.out.print("Enter base.. ");
                triangle[0] = sc.nextDouble();
                System.out.print("Enter height.. ");
                triangle[1] = sc.nextDouble();
                System.out.println("- Area of triangle = " + ((triangle[0] * triangle[1]) / 2));
                break;
            case 3:
                double []rectangle = new double[2];
                surround("Area of rectangle = length * width");
                System.out.print("Enter length.. ");
                rectangle[0] = sc.nextDouble();
                System.out.print("Enter width.. ");
                rectangle[1] = sc.nextDouble();
                System.out.println("- Area of rectangle = " + rectangle[0] * rectangle[1]);
                break;
        }

        sc.close();
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
