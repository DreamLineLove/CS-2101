import java.util.Scanner;

class Ex3_17 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        boolean condition1;
        System.out.println("Enter boolean value: ");
        condition1 = sc.nextBoolean();
        sc.close();

        if (condition1 == true)
        System.out.println("condition1 is true");
        else if (condition1 == false)
        System.out.println("condition1 is false");

    }

}
