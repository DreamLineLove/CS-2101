class Ex4_26 {

    public static void main(String[] args) {

        approximateValueOfPi(10);

    }

    static void approximateValueOfPi(int n) {
        double approximation = 0;

        for (int i = 1; i <= n; i++) {
            approximation += calculateNthTerm(i);
            System.out.println("Approximate value of pi by " + i + " term(s) = " + approximation);
        }
    }

    static double calculateNthTerm(int n) {
        return (n % 2 == 0) ? -4.0 / (2 * n - 1) : 4.0 / (2 * n - 1);
    }

}
