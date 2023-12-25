class Ex4_17 {

    public static void main(String[] args) {

        int N = (int)(Math.random() * 9);

        for (int i = 0; i < 50; i++) {
            if (i % 10 == 0) System.out.println();
            System.out.print(N + " ");
        }

    } 

}
