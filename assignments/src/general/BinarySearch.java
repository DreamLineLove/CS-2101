package general;

import java.util.Scanner;

/**
 * BinarySearch.java uses 
 * - randomIntArray() and printIntArray() methods from GeneralUtilities.java , 
 * - bubblesort() method from BubbleSort.java and
 * - selectionsort() method from SelectionSort.java .
 * 
 * If Teacher is manually compiling using command-line, please
 * also compile these classes.
 * 
 * If Teacher is using Eclipse, it will automatically compile
 * them for you when you click "Run".
 */
class BinarySearch {
 static int n = 10;
 static int[] arr = new int[n];
 static int a, t;
 
 static String[] sorting_algorithms = {
		 "Selection Sort",
		 "Bubble Sort",
 };

 public static void main(String []args) {
     Scanner sc = new Scanner(System.in);

     arr = GeneralUtilities.randomIntArray(n);

     for (int i = 0; i < sorting_algorithms.length; i++) 
     {
    	 System.out.println(i + "\t" + sorting_algorithms[i]);
     }
     System.out.print("\nType number.. ");
     a = sc.nextInt();
     
     switch (a) 
     {
     case 0:
    	 SelectionSort.selectionsort(arr);
    	 break;
     default: 
    	 BubbleSort.bubblesort(arr);
    	 break;
     }
     GeneralUtilities.printIntArray(arr, "\n" + sorting_algorithms[a] + ":\t");

     System.out.print("\nEnter integer to search: ");
     t = sc.nextInt();

     int i = binarysearchFirstOccurence(arr, 0, arr.length - 1, t);
     if (i < 0) 
    	 System.out.println("\n" + t + " not found.");
     else 
    	 System.out.println("\n" + t + " is found the first time at index " + i);
     System.out.println();

     sc.close();
 }

 static int binarysearchFirstOccurence(int []arr, int start, int end, int target) {
     if (start > end) return -1;
     int mid = (start + end) / 2;

     if (target == arr[mid] && (mid == start || (arr[mid - 1] < target))) 
    	 return mid;
     else if (target > arr[mid]) 
    	 return binarysearchFirstOccurence(arr, mid + 1, end, target); 
     else 
    	 return binarysearchFirstOccurence(arr, start, mid - 1, target);
 }
}
