import java.util.Scanner;

class Ex3_13 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of x = ");
        int x = sc.nextInt();
        sc.close();

        x--;
        System.out.println(x);

        x -= 1;
        System.out.println(x);

        x = x - 1;
        System.out.println(x);

        x = x & (~1);
        System.out.println(x);

    }

}
