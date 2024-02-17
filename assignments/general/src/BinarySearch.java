// Teacher, BinarySearch calls generateRandom() method from GeneralUtilities.java and 
// bubblesort() method from BubbleSort.java. When running BinarySearch, please also 
// compile these classes.

import java.util.Scanner;

class BinarySearch {
    static int n = 10;
    static int []arr = new int[n];
    static int t;

    public static void main(String []args) {
        arr = GeneralUtilities.generateRandom(n);
        BubbleSort.bubblesort(arr);
        GeneralUtilities.printArr(arr, "\nSorted array:\t");

        System.out.print("\nEnter integer to search: ");
        Scanner sc = new Scanner(System.in);
        t = sc.nextInt();

        int i = binarysearchFirstOccurence(arr, 0, arr.length - 1, t);
        if (i < 0) System.out.println("\n" + t + " not found.");
        else System.out.println("\n" + t + " is found first time at index " + i);
        System.out.println();

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
