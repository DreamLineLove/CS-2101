class GeneralUtilities {
    static int[] generateRandom(int size) {
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = (int)(Math.round(Math.random() * 9));
        }
        return arr;
    }

    static void printArr(int[] arr, String desc) {
        System.out.print(desc);
        for (int i = 0; i < arr.length; i++) {
            if (arr.length > 10 && i == 0) System.out.println();
            System.out.print(arr[i] + " ");
            if ((i + 1) % 10 == 0 && arr.length > 10) System.out.println();
        }
        System.out.println();
    }
}
