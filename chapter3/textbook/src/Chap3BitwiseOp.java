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

        c = ~a >> 2; // decimal -2 or binary 1111 1110
        System.out.println("Decimal c = " + c + "\t\tBinary c = " + Integer.toBinaryString(c));

        c = ~a >>> 2; 
        /*
         * Taking the complement of a results in a number starting with 1 (negative).
         * It is then shifted two positions to the right disregarding sign.
         * (Meaning the leftmost 2 bits are now filled with 0).
         *
         * This means the resulting number is a very huge positive number, since
         * c is defined as an int (32-bits).
        */
        System.out.println("Decimal c = " + c + "\tBinary c = " + Integer.toBinaryString(c));
        
    }
}
