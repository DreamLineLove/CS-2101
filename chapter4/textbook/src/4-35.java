class Ex4_35 {

    public static void main(String[] args) {

        int matrix[][] = {
            {2, 3, 5},
            {3, 4, 5},
            {2, 3, 5},
        };
        display(matrix);

    }

    static void display(int matrix[][]) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j]);
            }
            System.out.println();
        }
    }

}
