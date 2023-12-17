class AutoOperators {
    public static void main(String args[]) {
        int a, b, c, d;

        a = 0;
        b = 6;

        c = 0;
        d = 6;

        a = b--;
        c = --d;

        System.out.println("a = " + a + "\nb = " + b + "\n");
        System.out.println("c = " + c + "\nd = " + d + "\n");
    }
}
