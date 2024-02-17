// Teacher, please also compile GeneralUtilities.java because SelectionSort.java calls 
// the generateRandom() and printArr() methods from GeneralUtilities class in lines
// 24, 25, and 28 down below.

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
        arr = GeneralUtilities.generateRandom(n);
        GeneralUtilities.printArr(arr, "Random:");

        selectionsort(arr);
        GeneralUtilities.printArr(arr, "using Selection Sort:");
	}
}
