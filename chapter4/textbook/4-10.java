class Ex4_10 {

    public static void main(String[] args) {
        for (int i = 1; i <= 7; i += 2) {
            for (int j = i; j <= 7; j += 2) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    // The following is an older implementation using labels and the continue 
    // keyword.
    // The newer version above is much simpler.     
    // public static void main(String[] args) {
    //     outer: for (int i = 1; i <= 7; i++) {
    //         if (i % 2 == 0) continue outer;
    //         inner: for (int j = i; j <= 7; j++) {
    //             if (j % 2 == 0) continue inner;
    //             System.out.print(j + " ");
    //         }
    //         System.out.println();
    //     }
    // }
}
