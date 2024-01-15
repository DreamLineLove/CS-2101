class Ex5_4 {

    public static void main(String[] args) {

        int a = Integer.parseInt(args[0]);
        System.out.println(isEven(a));

    }

    static boolean isMultiple(int a, int b) {
        if (b % a == 0) return true;
        else return false;
    }

    static boolean isEven(int a) {
        if (isMultiple(2, a)) return true;
        else return false;
    }

}
