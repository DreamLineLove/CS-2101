import java.util.Scanner;
import java.text.DecimalFormat;

class KmMileConverter {

    public static void main(String argv[]) {
        int choice; 
        String conversions[] = {
            "km to mile",
            "mile to km",
        };

        java.util.Scanner sc = new Scanner(System.in);
        for (int i = 0; i < conversions.length; i++) {
            System.out.println(i + "\t" + conversions[i]);
        }
        System.out.print("\nChoose conversion.. ");
        choice = sc.nextInt();

        convertDistance(conversions[choice], sc);

        sc.close();
    }

    static void convertDistance(String conversion, Scanner sc) {
        String []units = conversion.split(" to ");
        double value;
        DecimalFormat result = new DecimalFormat("0.000000");

        System.out.print("\nEnter value of " + units[0] + "\t");
        value = sc.nextDouble();

        switch (units[0]) {
            case "km":
                System.out.println("- " + value + " " + units[0] + " is " + result.format(value * 0.621371) + " " + units[1]);
                break;
            case "mile":
                System.out.println("- " + value + " " + units[0] + " is " + result.format(value * 1.609344) + " " + units[1]);
                break;
        }
    }

}
