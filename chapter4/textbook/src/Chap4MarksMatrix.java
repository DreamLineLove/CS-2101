class Chap4MarksMatrix {

    public static void main(String argv[]) {

        String students[] = {"Benny", "Robin", "Sally", "Aaron", "Simon"};
        int marks[][] = {
            {89, 56, 88, 35, 65},
            {45, 86, 81, 75, 62},
            {55, 23, 73, 39, 77}
        };
        int i = 0;
        int j = 0;
        int transponse[][] = getTranspose(marks);

        System.out.println("\nMarks for students:");

        for (i = 0; i < transponse.length; i++) {
            System.out.println(students[i] + " -> " + "maths=" + transponse[i][j] + " " + "english=" + transponse[i][j+1] + " " + "science=" + transponse[i][j+2]);
            System.out.println();
        }

    }

    private static int[][] getTranspose(int[][] o) {
        int temp[][] = new int[o[0].length][o.length];
        for (int i = 0; i < o.length; i++) {
            for (int j = 0; j < o[0].length; j++) {
                temp[j][i] = o[i][j];
            }
        }
        return temp;
    }

}

