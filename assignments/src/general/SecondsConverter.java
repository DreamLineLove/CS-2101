package general;

import java.util.Scanner;

class SecondsConverter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter hours: ");
        int hour = sc.nextInt();
        
        System.out.print("Enter minutes: ");
        int minute = sc.nextInt();

        System.out.println("\n" + convertToSecond(hour, minute) + " seconds");

        sc.close();
    }

    static int convertToSecond(int hour, int minute) {
        return hour * 3600 + minute * 60;
    }
}
