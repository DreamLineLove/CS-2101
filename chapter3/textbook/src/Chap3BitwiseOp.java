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

        c = ~a; // decimal -6 or binary 1111 1010
        System.out.println("Decimal c = " + c + "\t\tBinary c = " + Integer.toBinaryString(c));

        c = b >> 2; // decimal 3 or binary 0000 0011
        System.out.println("Decimal c = " + c + "\t\tBinary c = " + Integer.toBinaryString(c));

        c = b << 2; // decimal 56 or binary 0011 1000
        System.out.println("Decimal c = " + c + "\t\tBinary c = " + Integer.toBinaryString(c));

        c = ~a >> 2; // decimal -2 or binary 1111 1110
        System.out.println("Decimal c = " + c + "\t\tBinary c = " + Integer.toBinaryString(c));

        c = ~a >>> 2; 
        System.out.println("Decimal c = " + c + "\tBinary c = " + Integer.toBinaryString(c));
        
    }
}
