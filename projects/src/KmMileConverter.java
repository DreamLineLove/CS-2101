import java.util.Scanner;
import java.text.DecimalFormat;

class KmMileConverter {

    public static void main(String argv[]) {
        int choice; 
        String conversions[] = {
            "km to mile",
            "mile to km",
            "C to F",
            "F to C",
        };

        java.util.Scanner sc = new Scanner(System.in);
        for (int i = 0; i < conversions.length; i++) {
            System.out.println(i + "\t" + conversions[i]);
        }
        System.out.print("\nChoose conversion.. ");
        choice = sc.nextInt();

        convert(conversions[choice], sc);

        sc.close();
    }

    static void convert(String conversion, Scanner sc) {
        String []units = conversion.split(" to ");
        double value;
        DecimalFormat distance = new DecimalFormat("0.000000");
        DecimalFormat temperature = new DecimalFormat("0.00");

        System.out.print("\nEnter value of " + units[0] + "\t");
        value = sc.nextDouble();

        switch (units[0]) {
            case "km":
                System.out.println("- " + value + " " + units[0] + " is " + distance.format(value * 0.621371) + " " + units[1]);
                break;
            case "mile":
                System.out.println("- " + value + " " + units[0] + " is " + distance.format(value * 1.609344) + " " + units[1]);
                break;
            case "C":
                System.out.println("- " + value + " " + units[0] + " is " + temperature.format((value * 9 / 5) + 32) + " " + units[1]);
                break;
            case "F":
                System.out.println("- " + value + " " + units[0] + " is " + temperature.format((value - 32) * 5 / 9) + " " + units[1]);
                break;
        }
    }

}
