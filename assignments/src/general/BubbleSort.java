package general;

/**
 * BubbleSort.java uses 
 * - randomIntArray() and printIntArray() methods from GeneralUtilities.java .
 * 
 * If Teacher is manually compiling using command-line, please
 * also compile these classes.
 * 
 * If Teacher is using Eclipse, it will automatically compile
 * them for you when you click "Run".
 */
class BubbleSort {
 static int n = 30;
 static int []arr = new int[n];

 static void bubblesort(int []arr) {
     boolean swapped = true;
     int index = arr.length - 1;
     while (swapped) {
         swapped = false;
         for (int i = 0; i < index; i++) {
             if (arr[i] > arr[i + 1]) {
                 int temp = arr[i];
                 arr[i] = arr[i + 1];
                 arr[i + 1] = temp;
                 swapped = true;
             }
         }
     }
 }

 public static void main(String[] args) {
     arr = GeneralUtilities.randomIntArray(n);
     GeneralUtilities.printIntArray(arr, "Random:");

     bubblesort(arr);
     GeneralUtilities.printIntArray(arr, "using Bubble Sort:");
 }
}
