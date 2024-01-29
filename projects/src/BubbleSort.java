class BubbleSort {
    static int []arr = new int[10];

	public static void main(String []args) {
        generateRandom();
        bubblesort(arr);

        System.out.print("Sorted:\t");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
	}

    static void generateRandom() {
        System.out.print("Random:\t");
        for (int i = 0; i < 10; i++) {
            arr[i] = (int)(Math.round(Math.random() * 9));
            System.out.print(arr[i] + " ");
        }
        System.out.println();
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
