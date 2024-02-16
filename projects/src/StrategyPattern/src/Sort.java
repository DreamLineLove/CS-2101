interface SortingAlgorithm {
    void sort(int arr[]);
}

class Sorter {
    private SortingAlgorithm algorithm;

    void setSortingAlgorithm(SortingAlgorithm algorithm) {
        this.algorithm = algorithm;
    }

    void useSortingAlgorithm(int arr[]) {
        algorithm.sort(arr);
    }
}

class BubbleSort implements SortingAlgorithm {
    @Override
    public void sort(int arr[]) {
        boolean swapped = true;
        while (swapped) {
            swapped = false;
            for (int i = 0; i < arr.length - 1; i++) {
                if (arr[i] > arr[i+1]) {
                    int temp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = temp;
                    swapped = true;
                }
            }
        }
    }
}

class SelectionSort implements SortingAlgorithm {
    @Override
    public void sort(int arr[]) {
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
}

class Sort {
    static int[] arr;

    static int[] generateRandom(int size) {
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = (int)(Math.round(Math.random() * 9));
        }
        return arr;
    }

    static void printArr(int[] arr, String desc) {
        System.out.print(desc + ":\t");
        for (int i = 0; i < arr.length; i++) {
            if (arr.length > 10 && i == 0) System.out.println();
            System.out.print(arr[i] + " ");
            if ((i + 1) % 10 == 0 && arr.length > 10) System.out.println();
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Sorter sorter = new Sorter();

        arr = generateRandom(10);
        printArr(arr, "Random\t");

        sorter.setSortingAlgorithm(new BubbleSort());
        sorter.useSortingAlgorithm(arr);
        printArr(arr, "Bubble Sort");

        System.out.println();

        arr = generateRandom(10);
        printArr(arr, "Random Again");

        sorter.setSortingAlgorithm(new SelectionSort());
        sorter.useSortingAlgorithm(arr);
        printArr(arr, "Selection Sort");
    }
}
