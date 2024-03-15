package general;

/**
 * If Teacher is using command-line, please also include the
 * program arguments.
 * e.g. java SmallestNumberInArray 5 6 1 2 2 3 6 7
 * 
 * If Teacher is using Eclipse, please do the following:
 * - go to Run > Run configurations.. > Arguments > Program arguments:
 * - Provide the arguments with space in between.
 * e.g. 5 6 1 2 2 3 6 7
 */
class SmallestNumberInArray {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Please provide integers as program arguments separated by space!");
            System.out.println("for example, 5 6 7 12 215 25 12");
        } else {
            int[] arr = new int[args.length];

            for (int i = 0; i < args.length; i++) {
                int element = Integer.valueOf(args[i]);
                arr[i] = element;
                System.out.println(element);
            }

            System.out.println("\nSmallest = " + smallestNumber(arr));
        }
    }

    static int smallestNumber(int[] arr) {
        int smallest = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < smallest) smallest = arr[i];
        }

        return smallest;
    }
}
