import java.util.Scanner;

class Ex4_11 {
    public static void main(String[] args) {

        int x, y;
        double power;

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter value of x: ");
        x = sc.nextInt();

        System.out.print("Enter value of y: ");
        y = sc.nextInt();

        sc.close();

        power = power(x, y);
        System.out.println(x + " power " + y + " = " + power);

    }

    static double power(int x, int y) {
        double result = 1;

        for (int i = 0; i < absolute(y); i++) {
            result = result * x;
        }

        if (y < 0) {
            return 1 / result;
        } else {
            return result;
        }
    }

    static int absolute(int y) {
        if (y < 0) return -y;
        else return y;
    }
}
