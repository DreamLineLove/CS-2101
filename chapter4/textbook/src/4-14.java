class Ex4_14 {

    public static void main(String[] args) {

        int i = 0;

        for (i = 0; i <= 201; i++) {
            System.out.print(i * 5 + " ");

            newline(i);
        }

        i = 0;

        while (i <= 1000) {
            if (i % 5 == 0) System.out.print(i * 5 + " ");
            i++;

            newline(i);
        }
        
        i = 0;

        do {
            if (i % 5 == 0) System.out.print(i * 5 + " ");
            i++;

            newline(i);
        } while (i <= 1000);

    } 

    static void newline(int i) {
        if (i % 20 == 0) System.out.println();
    }

}
