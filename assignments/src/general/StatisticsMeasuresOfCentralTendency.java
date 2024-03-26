package general;

import java.text.DecimalFormat;
import java.util.Map;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.Scanner;

class StatisticsMeasuresOfCentralTendency {
	static DecimalFormat formatter = new DecimalFormat("#.####");

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int size = 0;
        System.out.print("Enter number of elements: ");
        size = sc.nextInt();

        double[] set = new double[size];
        Map<Double, Integer> countMap = new HashMap<>();

        System.out.println();
        for (int i = 0; i < size; i++) {
            System.out.print("\t enter element " + i + ": ");
            set[i] = sc.nextDouble();
            if (countMap.containsKey(set[i])) {
                int val = countMap.get(set[i]);
                countMap.put(set[i], val + 1);
            } else {
                countMap.put(set[i], 1);
            }
        }

        frequencyTable(countMap);
        System.out.printf("\nMean\t%s\n", formatter.format(mean(set)));
        mode(countMap);
        System.out.println("Median\t" + median(set));
        System.out.println("Range\t" + range(set));

        sc.close();
    }

    static void frequencyTable(Map<Double, Integer> countMap) {
        System.out.println("\nValue\tFrequency");
        System.out.println("-----\t---------");
        for (Map.Entry<Double, Integer> entry : countMap.entrySet()) {
            System.out.println(entry.getKey() + "\t" + entry.getValue());
        }
    }

    static double mean(double []set) {
        double sum = 0;
        for (int i = 0; i < set.length; i++) {
            sum += set[i];
        }
        return sum / set.length;
    }

    static void mode(Map<Double, Integer> countMap) {
        ArrayList<Double> mode = new ArrayList<>();
        double maxFrequency = 0;

        for (Map.Entry<Double, Integer> entry : countMap.entrySet()) {
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
            System.out.println("Mode\t" + mode.get(0));
        } else {
            System.out.println("\nMode(s)");
            for (Double m : mode) {
                System.out.println("\t" + m);
            }
            System.out.println();
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
        int maxIndex = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > arr[maxIndex]) maxIndex = i;
        }
        return arr[maxIndex];
    }

    static double smallest(double []arr) {
        int minIndex = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < arr[minIndex]) minIndex = i;
        }
        return arr[minIndex];
    }
}
