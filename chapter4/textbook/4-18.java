class Ex4_18 {
    // Either recursive or iterative may be asked in exam but probably not both.
    public static void main(String[] args) {
        iterativeFactorial();
        System.out.println();
        recursiveFactorial(0, 120);
    }
    
    static void iterativeFactorial() {
        for (int i = 0; i <= 5; i++) {
            int factorial = 1;
            for (int j = i; j >= 1; j--) {
                factorial *= j;
            }
            System.out.println(i + "!" + " = " + factorial);
        }
    }

    static void recursiveFactorial(int n, int max) {
        int factorial = factorial(n);
        System.out.println(n + "!" + " = " + factorial);

        if (factorial < max) {
            recursiveFactorial(n + 1, max);
        }
    }

    static int factorial(int n) {
        if (n == 0 || n == 1) return 1;
        else return n * factorial(n - 1);
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

    // public static void main(String[] args) {
    //
    //     printFactorial(0);
    //
    // } 
    //
    // public static void main(String[] args) {
    //
    //     printFactorial(0);
    //
    // } 
    //
    // static void printFactorial(int n) {
    //     int factorial = calculateFactorial(n);
    //     System.out.println(n + "! = " + factorial);
    //
    //     if (factorial < 120) {
    //         printFactorial(n + 1);
    //     }
    // }
    //
    // static int calculateFactorial(int n) {
    //     if (n == 0 || n == 1) return 1;
    //     else {
    //         return n * calculateFactorial(n - 1);
    //     }
    // }
}
