package general;

import java.text.DecimalFormat;
import java.util.Scanner;

class Speed {
    static DecimalFormat formatter = new DecimalFormat("#.#########");

    static double meters;
    static double hours;
    static double minutes;
    static double seconds;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Input distance in meters: ");
        meters = sc.nextDouble();

        double kilometers = meters / 1000;
        double miles = meters / 1609;

        System.out.print("Input hours: ");
        hours = sc.nextDouble();

        System.out.print("Input minutes: ");
        minutes = sc.nextDouble();

        System.out.print("Input seconds: ");
        seconds = sc.nextDouble();

        double inHours = hours + minutes / 60 + seconds / 3600;
        double inSeconds = hours * 3600 + (minutes * 60) + seconds;

        System.out.println("\nYour speed in meters/second is "+ formatter.format(meters / inSeconds));
        System.out.println("Your speed in km/h is "+ formatter.format(kilometers / inHours));
        System.out.println("Your speed in miles/h is "+ formatter.format(miles / inHours));

        sc.close();
    }
}
