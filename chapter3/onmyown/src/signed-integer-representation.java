class SignedIntegerRepresentation {

    public static void main(String[] args) {

        int a = 5; // 0000 0101 
        int b = ~a; // 1111 1010

        /*
         *
         * Converting 1111 1010 back to one's complement form, we get
         * 1111 1001. 
         *
         * Negating the one's complement form, we get the original number:
         * 0000 0110, which is 6 in decimal.
         *
         * Therefore, 1111 1010, even though it is the one's complement of 5,
         * in signed integer representation, it's the two's complement of -6,
         * because that's how you get negative numbers in this system.
         *
         */

        System.out.println(a);
        System.out.println(Integer.toBinaryString(a) + "\n");

        System.out.println(b);
        System.out.println(Integer.toBinaryString(b) + "\n");

    }

}
