class Chap4Break {

    public static void main(String[] args) {

        int[][] matrix = new int[10][10];
        for (int i = 1; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                matrix[i][j] = (i * 10) + j;
                System.out.println(matrix[i][j]);
            }
            System.out.println();
        }

        System.out.println("\nNumbers divislbe by 3 are:");

        for (int i = 1; i < 10; i++) {
            inner: for (int j = 0; j < 10; j++) {
                if (matrix[i][j] % 3 == 0) {
                    System.out.println(matrix[i][j] + " ");
                    break inner;
                }
            }
            System.out.println();
            System.out.println("Out of inner for loop");
        }
        System.out.println("Out of outer for loop");

    }

}
