class Chap4ForFor {

    public static void main(String argv[]) {

        int[][] matrix = new int[10][10];
        for (int i = 1; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                matrix[i][j] = (i * 10) + j;
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Out of for statement");

    }

}
