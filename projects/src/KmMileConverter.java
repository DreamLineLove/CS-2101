import java.util.Scanner;

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
        double result;

        System.out.print("\nEnter value of " + units[0] + "\t");
        value = sc.nextDouble();

        switch (units[0]) {
            case "km":
                result = value * 0.621371;
                System.out.println("- " + value + " " + units[0] + " is " + result + " " + units[1]);
                break;
            case "mile":
                result = value * 1.609344;
                System.out.println("- " + value + " " + units[0] + " is " + result + " " + units[1]);
                break;
        }
    }

}
