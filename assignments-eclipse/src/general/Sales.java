package general;

import java.util.Scanner;

class Sales {
    static int n = 0;
    static double[] sales;
    static double total = 0;
    static double average = 0;
    static double minimum = 0;
    static double maximum = 0;
    static double amount;
    static int count = 0;

    static void i() {
        System.out.println("\nid\tamount");
        for (int i = 0; i < n; i++) {
            System.out.println(i + "\t" + sales[i]);
        }
    }

    static void ii() {
        for (int i = 0; i < n; i++) {
            total += sales[i];
        }
        average = total / n;
        System.out.println("\naverage = " + average);
    }

    static void iii() {
        int min = 0, max = 0;
        for (int i = 1; i < n; i++) {
            if (sales[i] < sales[min]) min = i;
            if (sales[i] > sales[max]) max = i;
        }
        System.out.printf("\nSalesperson %d had the highest sale with $%f\n", max, sales[max]);
        System.out.printf("Salesperson %d had the lowest sale with $%f\n", min, sales[min]);
    }

    static void iv(Scanner sc) {
        System.out.print("\nEnter a value: ");
        amount = sc.nextDouble();

        for (int i = 0; i < n; i++) {
            if (sales[i] > amount) {
                System.out.printf("\nSalesperson %d, amount = %f", i, sales[i]);
                count++;
            }
        }
        System.out.println("\nNumber of salespersons who exceeded " + amount + " = " + count);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Number of salespersons: ");
        n = sc.nextInt();
        
        sales = new double[n];
        for (int i = 0; i < n; i++) {
        	System.out.print("Salesperson " + i + ": ");
        	sales[i] = sc.nextDouble();
        }

        i();
        ii();
        iii();
        iv(sc);
        
        sc.close();
    }
}
