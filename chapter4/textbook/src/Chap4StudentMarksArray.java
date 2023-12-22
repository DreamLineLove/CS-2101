class Chap4StudentsMarksArray {

    public static void main(String[] args) {

        String students[] = {"Benny", "Robin", "Sally", "Aaron", "Simon"};
        int marks[] = new int[5];
        marks[0] = 89;
        marks[1] = 56;
        marks[2] = 88;
        marks[3] = 35;
        marks[4] = 65;
        int i = 0;

        System.out.println("\nMarks for students:");

        for (i = 0; i < students.length; i++) {
            System.out.println(students[i] + " -> " + marks[i]);
        }

    }

}
