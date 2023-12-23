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

        for (i = 0; i < sourceMarks.length; i++) {
            sourceMarks[i] = 0;
        }

        System.out.println("After reassigning sourceMarks array to 0");
        for (i = 0; i < sourceMarks.length; i++) {
            System.out.print("sourceMarks[" + i + "]=" + sourceMarks[i]);
            System.out.println(" targetMarks[" + i + "]=" + targetMarks[i]);
        }
        System.out.println();

        targetMarks = sourceMarks;

        System.out.println("After using assignment to \"copy\" arrays");
        for (i = 0; i < sourceMarks.length; i++) {
            System.out.print("sourceMarks[" + i + "]=" + sourceMarks[i]);
            System.out.println(" targetMarks[" + i + "]=" + targetMarks[i]);
        }
        System.out.println();

        for (i = 0; i < targetMarks.length; i++) {
            targetMarks[i] = 88;
        }

        System.out.println("After making changes to targetMarks array");
        for (i = 0; i < sourceMarks.length; i++) {
            System.out.print("sourceMarks[" + i + "]=" + sourceMarks[i]);
            System.out.println(" targetMarks[" + i + "]=" + targetMarks[i]);
        }
        System.out.println();

        for (i = 0; i < sourceMarks.length; i++) {
            sourceMarks[i] = 3;
        }

        System.out.println("After making changes to sourceMarks array");
        for (i = 0; i < sourceMarks.length; i++) {
            System.out.print("sourceMarks[" + i + "]=" + sourceMarks[i]);
            System.out.println(" targetMarks[" + i + "]=" + targetMarks[i]);
        }
        System.out.println();

    }

}
