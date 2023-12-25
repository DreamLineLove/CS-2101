class Ex4_17 {
    
    static int N;

    public static void main(String[] args) {

        N = (int)(Math.random() * 9) + 1;
        recursive();

    } 

    static void recursive() {
        if (N == 1) System.out.println(N);
        else {
            System.out.println(N);
            if (N % 2 == 0) N = N / 2;
            else N = (N * 3) + 1;
            recursive(N);
        }
    }

}
