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
        System.out.println();

        switch (shape) {
            case 0:
                int r;
                System.out.println("Area of circle = Pi * radius * radius\n");
                System.out.print("Enter radius.. ");
                r = sc.nextInt();
                System.out.println("Area of circle = " + Math.PI * r * r);
                break;
            case 1:
                int s;
                System.out.println("Area of square = length * length\n");
                System.out.print("Enter side length.. ");
                s = sc.nextInt();
                System.out.println("Area of square = " + s * s);
                break;
            case 2:
                int b, h;
                System.out.println("Area of triangle = 1/2 (base * height)\n");
                System.out.print("Enter base.. ");
                b = sc.nextInt();
                System.out.print("Enter height.. ");
                h = sc.nextInt();
                System.out.println("Area of square = " + ((b * h) / 2));
                break;
            case 3:
            case 4:
            case 5:
        }
            // "Circle",
            // "Ellipse",
            // "Square",
            // "Rectangle",
            // "Triangle",
            // "Parallelogram",
            // "Trapezoid",


        sc.close();
    }

}
