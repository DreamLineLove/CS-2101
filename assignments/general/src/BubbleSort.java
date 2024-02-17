// Teacher, please also compile GeneralUtilities.java because BubbleSort.java calls 
// the generateRandom() and printArr() methods from GeneralUtilities class in lines
// 26, 27, and 30 down below.

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
        arr = GeneralUtilities.generateRandom(n);
        GeneralUtilities.printArr(arr, "Random:");

        bubblesort(arr);
        GeneralUtilities.printArr(arr, "using Bubble Sort:");
    }
}
