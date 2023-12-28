class Ex4_35_36_37 {

    public static void main(String[] args) {

        int matrix[][] = {
            {2, 3, 5},
            {3, 4, 5},
            {2, 3, 5},
        };
        display(matrix);
        displaySum(matrix);

    }

    static void display(int matrix[][]) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    static void displaySum(int matrix[][]) {
        int sum = 0;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                sum += matrix[i][j];
            }
        }
        
        System.out.println("\nSum of matrix = " + sum);
    }

}
