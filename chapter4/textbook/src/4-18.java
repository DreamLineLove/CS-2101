class Ex4_18 {

    public static void main(String[] args) {

        printFactorial(0);

    } 

    static void printFactorial(int n) {
        int factorial = calculateFactorial(n);
        System.out.println(n + "! = " + factorial);

        if (factorial < 120) {
            printFactorial(n + 1);
        }
    }

    static int calculateFactorial(int n) {
        if (n == 0 || n == 1) return 1;
        else {
            return n * calculateFactorial(n - 1);
        }
    }


}
