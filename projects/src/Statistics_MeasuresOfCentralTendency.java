import java.util.Map;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.Scanner;

class Statistics_MeasuresOfCentralTendency {

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
        System.out.println("\nMean\t" + mean(set));
        mode(map);
        System.out.println("\nMedian\t" + median(set));
        System.out.println("\nRange\t" + range(set));

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
            System.out.println(entry.getKey() + "\t" + entry.getValue());
        }
    }

    static void mode(Map<Double, Integer> map) {
        ArrayList<Double> mode = new ArrayList<>();
        double maxFrequency = 0;

        for (Map.Entry<Double, Integer> entry : map.entrySet()) {
            int frequency = entry.getValue();

            if (frequency > maxFrequency) {
                maxFrequency = frequency;
                mode.clear();
                mode.add(entry.getKey());
            } else if (frequency == maxFrequency) {
                mode.add(entry.getKey());
            }
        }

        if (mode.size() == 1) {
            System.out.println("\nMode\t" + mode.get(0));
        } else {
            System.out.println("\nMode(s)");
            for (Double m : mode) {
                System.out.println("\t" + m);
            }
        }
    }

    static double median(double []set) {
        if (set.length % 2 == 0) {
            return (set[set.length / 2] + set[(set.length / 2) + 1]) / 2;
        } else {
            return set[set.length % 2 + 1];
        }
    }

    static double range(double []set) {
        return largest(set) - smallest(set);
    }

    static double largest(double []arr) {
        int largestElementIndex = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > arr[largestElementIndex]) largestElementIndex = i;
        }
        return arr[largestElementIndex];
    }

    static double smallest(double []arr) {
        int smallestElementIndex = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < arr[smallestElementIndex]) smallestElementIndex = i;
        }
        return arr[smallestElementIndex];
    }

}
