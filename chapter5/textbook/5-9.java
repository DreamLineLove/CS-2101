class Ex5_9 {
    public static void main(String[] args) {
        int[] arr = new int[args.length];

        for (int i = 0; i < args.length; i++) {
            int element = Integer.valueOf(args[i]);
            arr[i] = element;
            System.out.println(element);
        }

        System.out.println("\nSmallest = " + smallestNumber(arr));
    }

    static int smallestNumber(int[] arr) {
        int smallest = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < smallest) smallest = arr[i];
        }

        return smallest;
    }
}
