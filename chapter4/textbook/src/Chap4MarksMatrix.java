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

        System.out.println("\nMarks for students:");

        for (i = 0; i < students.length; i++) {
            System.out.println(students[i] + " -> " + "maths=" + marks[i][j] + " " + "english=" + marks[i][j+1] + " " + "science=" + marks[i][j+2]);
            System.out.println();
        }

    }

}
