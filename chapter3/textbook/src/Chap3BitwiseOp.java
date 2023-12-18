class Chap3BitwiseOp {

    public static void main(String[] args) {

        int a = 5; // 0000 0101
        int b = 14; // 0000 1110
        int c = 0;

        c = a & b; // decimal 4 or binary 0000 0100
        System.out.println("Decimal c = " + c + "\t\tBinary c = " + Integer.toBinaryString(c));

        c = a ^ b; // decimal 11 or binary 0000 1011
        System.out.println("Decimal c = " + c + "\t\tBinary c = " + Integer.toBinaryString(c));

        c = a | b; // decimal 15 or binary 0000 1111
        System.out.println("Decimal c = " + c + "\t\tBinary c = " + Integer.toBinaryString(c));

        c = ~a; 
        /* 
         * binary 1111 1010 starts with negative bit (first bit 1). Therefore it
         * is a negative number.
         *
         * Negative numbers are represented by taking the two's complement of the
         * original number.
         *
         * To find out what 1111 1010 is the negative of, we have to find out the
         * original number first. 
         *
         * To do so, first turn it back to one's complement form, i.e. 1111 1001,
         * and then negate the one's complement, 0000 0110, which is 6 in decimal.
         *
         * Therefore, c is negative 6 or -6.
        */
        System.out.println("Decimal c = " + c + "\t\tBinary c = " + Integer.toBinaryString(c));

        c = b >> 2; // decimal 3 or binary 0000 0011
        System.out.println("Decimal c = " + c + "\t\tBinary c = " + Integer.toBinaryString(c));

        c = b << 2; // decimal 56 or binary 0011 1000
        System.out.println("Decimal c = " + c + "\t\tBinary c = " + Integer.toBinaryString(c));

        // c = a ^ b; // decimal 11 or binary 0000 1011
        // System.out.println("Decimal c = " + c + "\t\tBinary c = " + Integer.toBinaryString(c));

    }

}
