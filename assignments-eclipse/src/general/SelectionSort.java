package general;

/**
 * SelectionSort.java uses 
 * - randomIntArray() and printIntArray() methods from GeneralUtilities.java .
 * 
 * If Teacher is manually compiling using command-line, please
 * also compile these classes.
 * 
 * If Teacher is using Eclipse, it will automatically compile
 * them for you when you click "Run".
 */
class SelectionSort {
 static int n = 30;
 static int[] arr = new int[n];

 static void selectionsort(int[] arr) {
     for (int i = 0; i < arr.length - 1; i++) {
         int minIndex = i;
         for (int j = i + 1; j < arr.length; j++) {
             if (arr[j] < arr[minIndex]) minIndex = j;
         }
         if (minIndex != i) {
             int temp = arr[i];
             arr[i] = arr[minIndex];
             arr[minIndex] = temp;
         }
     }
 }

	public static void main(String []args) {
     arr = GeneralUtilities.randomIntArray(n);
     GeneralUtilities.printIntArray(arr, "Random:");

     selectionsort(arr);
     GeneralUtilities.printIntArray(arr, "using Selection Sort:");
	}
}
