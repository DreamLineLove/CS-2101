class Ex5_3 {
    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        System.out.println(isMultiple(a, b));
    }

    static boolean isMultiple(int a, int b) {
        if (b % a == 0) return true;
        else return false;
    }
}
