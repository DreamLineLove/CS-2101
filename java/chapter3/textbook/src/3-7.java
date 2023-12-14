import java.util.Scanner;

class Ex3_7 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        
        System.out.println("x = " + x);
        System.out.println("x is " + (x % 2 == 0 ? "even" : "odd"));
        x = x % 2 == 0 ? 2 * x : 3 * x;
        System.out.println("final value of x = " + x);

        sc.close();

    }

}
