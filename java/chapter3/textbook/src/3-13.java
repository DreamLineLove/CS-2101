import java.util.Scanner;

class Ex3_13 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        sc.close();

        x--;
        x -= 1;
        x = x - 1;
        x = x & (~1);

    }

}
