class Ex5_1 {

    static double i = 1.5;

    static void changeI(double num) {
        int i = (int) num;
    }

    public static void main(String[] args) {
        changeI(i);
        System.out.println(i); // Guess: either it won't compile or i prints 1.5
    }

}
