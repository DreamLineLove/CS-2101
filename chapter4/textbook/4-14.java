class Ex4_14 {
    public static void main(String[] args) {
        int i = 0;

        for (i = 0; i <= 200; i++) {
            newline(i, 10);
            System.out.print(i * 5 + " ");
        }
        
        i = 0;
        System.out.println("\n");

        for (i = 0; i <= 1000; i++) {
            newline(i, 50);
            if (i % 5 == 0) System.out.print(i + " ");
        }

        i = 0;
        System.out.println("\n");

        while (i <= 1000) {
            newline(i, 50);
            if (i % 5 == 0) System.out.print(i + " ");
            i++;
        }

        i = 0;
        System.out.println("\n");

        do {
            newline(i, 50);
            if (i % 5 == 0) System.out.print(i + " ");
            i++;
        } while (i <= 1000);

        System.out.println("\n");
    } 

    static void newline(int i, int divideBy) {
        if (i % divideBy == 0) System.out.println();
    }
}
