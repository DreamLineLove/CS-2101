import java.util.Scanner;

class Statistics_MeasuresOfCentralTendency {

    public static void main(String argv[]) {
        int size = 0;

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        size = sc.nextInt();
        double []set = new double[size];

        for (int i = 0; i < size; i++) {
            System.out.print("Enter element " + i + ": ");
            set[i] = sc.nextDouble();
        }

        System.out.println("Mean = ", mean(set));

        sc.close();
    }

    static double mean(double []set) {
        double sum = 0;

        for (int i = 0; i < set.length; i++) {
            sum += set[i];
        }

        return sum / set.length;
    }

}
