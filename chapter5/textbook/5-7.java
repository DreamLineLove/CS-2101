import java.util.Scanner;

class Ex5_7 {
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
        int gcd = 1, num = 1;

        while (num <= num1 && num <= num2) {
            if (num1 % num == 0 && num2 % num == 0) {
                gcd = num;
                num++;
            } else num++;
        }

        return gcd;
    }
}
