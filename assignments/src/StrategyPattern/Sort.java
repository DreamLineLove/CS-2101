package StrategyPattern;

import general.GeneralUtilities;

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

    public static void main(String[] args) {
        Sorter sorter = new Sorter();

        arr = GeneralUtilities.randomIntArray(25);
        GeneralUtilities.printIntArray(arr, "\nRandom\t");

        sorter.setSortingAlgorithm(new BubbleSort());
        sorter.useSortingAlgorithm(arr);
        GeneralUtilities.printIntArray(arr, "\nBubble Sort");

        System.out.println();

        arr = GeneralUtilities.randomIntArray(25);
        GeneralUtilities.printIntArray(arr, "\nRandom Again");

        sorter.setSortingAlgorithm(new SelectionSort());
        sorter.useSortingAlgorithm(arr);
        GeneralUtilities.printIntArray(arr, "\nSelection Sort");
    }
}
