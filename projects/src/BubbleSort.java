// Teacher, BinarySearch uses generateRandom() and bubblesort() methods from 
// this BubbleSort class. When running BinarySearch, please also compile this class.

class BubbleSort {
    static int n = 30;
    static int []arr = new int[n];

	public static void main(String []args) {
        arr = generateRandom(n);
        bubblesort(arr);

        System.out.print("Sorted:\t\n");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
            if ((i + 1) %  10 == 0 && arr.length > 10) System.out.println();
        }
        System.out.println();
	}

    static int[] generateRandom(int size) {
        int arr[] = new int[size];
        System.out.print("Random:\t");
        for (int i = 0; i < size; i++) {
            if (size > 10 && i == 0) System.out.println();
            arr[i] = (int)(Math.round(Math.random() * 9));
            System.out.print(arr[i] + " ");
            if ((i + 1) % 10 == 0 && size > 10) System.out.println();
        }
        System.out.println();
        return arr;
    }

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
}
