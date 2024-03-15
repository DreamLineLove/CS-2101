import java.util.Scanner;

class Ex5_8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter int1: ");
        int num1 = sc.nextInt();
        
        System.out.print("Enter int2: ");
        int num2 = sc.nextInt();

        System.out.println(gcd(num1, num2));

        sc.close();
    }

    static int gcd(int num1, int num2) {
        if (num2 == 0) return num1;
        else return gcd(num2, num1 % num2);
    }
}
