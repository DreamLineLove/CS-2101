import java.util.Scanner;

class Ex3_14 {

    public static void main(String[] args) {

        double b, h;        

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter base of triangle: ");
        b = sc.nextInt();

        System.out.println("Enter height of triangle: ");
        h = sc.nextInt();

        sc.close();

        double area = (1 / 2.0) * b * h;

        System.out.println(area);

    }

}
