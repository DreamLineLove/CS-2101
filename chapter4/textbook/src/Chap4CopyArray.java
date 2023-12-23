class Chap4CopyArray {

    public static void main(String argv[]) {

        int sourceMarks[] = new int[5];
        sourceMarks[0] = 89;
        sourceMarks[1] = 56;
        sourceMarks[2] = 88;
        sourceMarks[3] = 35;
        sourceMarks[4] = 65;

        int targetMarks[] = {30, 40, 50, 60, 70, 80};
        
        int i = 0;

        System.out.println("Before copying arrays");
        for (i = 0; i < sourceMarks.length; i++) {
            System.out.print("sourceMarks[" + i + "]=" + sourceMarks[i]);
            System.out.println(" targetMarks[" + i + "]=" + targetMarks[i]);
        }
        System.out.println();

        for (i = 0; i < sourceMarks.length; i++) {
            targetMarks[i] = sourceMarks[i];
        }

        System.out.println("After copying arrays");
        for (i = 0; i < sourceMarks.length; i++) {
            System.out.print("sourceMarks[" + i + "]=" + sourceMarks[i]);
            System.out.println(" targetMarks[" + i + "]=" + targetMarks[i]);
        }
        System.out.println();

    }

}
