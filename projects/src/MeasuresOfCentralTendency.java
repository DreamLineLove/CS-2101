import java.util.Map;
import java.util.HashMap;
import java.util.Scanner;
import java.text.DecimalFormat;

class MeasuresOfCentralTendency {

    static DecimalFormat fmt = new DecimalFormat("#.##");

    public static void main(String argv[]) {
        Scanner sc = new Scanner(System.in);

        int size = 0;
        System.out.print("Enter number of elements: ");
        size = sc.nextInt();

        double []set = new double[size];
        Map<Double, Integer> map = new HashMap<>();

        for (int i = 0; i < size; i++) {
            System.out.print("\t enter element " + i + ": ");
            set[i] = sc.nextDouble();
            if (map.containsKey(set[i])) {
                int val = map.get(set[i]);
                map.put(set[i], val + 1);
            } else {
                map.put(set[i], 1);
            }
        }

        frequencyTable(map);
        System.out.println("\nMean = " + mean(set));

        sc.close();
    }

    static double mean(double []set) {
        double sum = 0;

        for (int i = 0; i < set.length; i++) {
            sum += set[i];
        }

        return sum / set.length;
    }

    static void frequencyTable(Map<Double, Integer> map) {
        System.out.println("\nValue\tFrequency");
        System.out.println("-----\t---------");
        for (Map.Entry<Double, Integer> entry : map.entrySet()) {
            Double key = entry.getKey();
            String displayKey = Math.floor(key) == key ? fmt.format(key) : String.valueOf(key);
            System.out.println(displayKey + "\t" + entry.getValue());
        }
    }

}
