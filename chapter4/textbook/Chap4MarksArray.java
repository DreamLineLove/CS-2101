class Chap4MarksArray {

    public static void main(String argv[]) {

        String students[] = {"Benny", "Robin", "Sally", "Aaron", "Simon"};
        int mathsMarks[] = {89, 56, 88, 35, 65};
        int englishMarks[] = {45, 86, 81, 75, 62};
        int scienceMarks[] = {55, 23, 73, 39, 77};
        int i = 0;

        System.out.println("\nMarks for students:");

        for (i = 0; i < students.length; i++) {
            System.out.println(students[i] + " -> " + "maths=" + mathsMarks[i] + " " + "english=" + englishMarks[i] + " " + "science=" + scienceMarks[i]);
            System.out.println();
        }

    }

}
