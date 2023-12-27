import java.util.Scanner;

class Ex4_28 {

    public static void main(String[] args) {

        int arrLen = Integer.parseInt(args[0]);
        int arr[] = new int[arrLen];

        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < arrLen; i++) {
            System.out.print("Enter element " + i + ": ");
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter value of x: ");
        int x = sc.nextInt();
        sc.close();

        System.out.println("Count of " + x + " = " + countMultiple(arr, x));

    }

    static int countMultiple(int [] arr, int x) {
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) count++;
        }

        return count;
    }

} 

// write an array in c or c++ to take in the constrast
