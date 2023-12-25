class Ex4_19 {

    public static void main(String[] args) {
        
        printFibonacci(1);        

    }

    static void printFibonacci(int n) {
        int currentFibonacci = getCurrentFibonacci(n);
        System.out.print(currentFibonacci + " ");

        if (currentFibonacci < 144) {
            printFibonacci(n);
        }
    }

    static int getCurrentFibonacci(int n) {
        if (n == 0) return 0;
        if (n == 1) return 1;
        return getCurrentFibonacci(n - 1) + getCurrentFibonacci(n - 2);
    }

}
