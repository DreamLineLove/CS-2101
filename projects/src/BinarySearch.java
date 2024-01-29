// Teacher, BinarySearch calls generateRandom() and bubblesort() methods from 
// BubbleSort. When running BinarySearch, please also compile BubbleSort.

import java.util.Scanner;

class BinarySearch {
    static int n = 10;
    static int []arr = new int[n];
    static int t;

    public static void main(String []args) {
        arr = BubbleSort.generateRandom(n);
        BubbleSort.bubblesort(arr);

        System.out.print("Sorted:\t");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        System.out.print("Enter integer to search: ");
        Scanner sc = new Scanner(System.in);
        t = sc.nextInt();

        int i = binarysearchFirstOccurence(arr, 0, arr.length - 1, t);
        if (i < 0) System.out.println("\n" + t + " not found.");
        else System.out.println("\n" + t + " found first time at index " + i);

        sc.close();
    }

    static int binarysearchFirstOccurence(int []arr, int start, int end, int target) {
        if (start > end) return -1;
        int mid = (start + end) / 2;
        if (target == arr[mid] && (mid == start || (arr[mid - 1] < target))) return mid;
        if (target == arr[mid]) return binarysearchFirstOccurence(arr, start, mid - 1, target);
        if (target > arr[mid]) return binarysearchFirstOccurence(arr, mid + 1, end, target); 
        else return binarysearchFirstOccurence(arr, start, mid - 1, target);
    }
}
