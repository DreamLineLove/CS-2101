class Ex5_5 {
    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        System.out.println(isOdd(a));
    }

    static boolean isMultiple(int a, int b) {
        if (b % a == 0) return true;
        else return false;
    }

    static boolean isOdd(int a) {
        if (!isMultiple(2, a)) return true;
        else return false;
    }
}
