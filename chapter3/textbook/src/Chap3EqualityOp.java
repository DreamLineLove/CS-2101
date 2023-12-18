class Chap3EqualityOp {

    public static void main(String[] args) {

        int a = 5;
        int b = 5;
        int c = 6;
        String s1 = new String("John");
        String s2 = new String("John");

        if (a == b) System.out.println("a == b is true");
        if (a == c) System.out.println("a == c is true");
        if (b != c) System.out.println("b != c is true");
        if (s1 == s2) System.out.println("s1 == s2 is true");
        if (s1 == s1) System.out.println("s1 == s1 is true");
        if (s1.equals(s2)) System.out.println("s1, s2 contents are the same");

    }

}
