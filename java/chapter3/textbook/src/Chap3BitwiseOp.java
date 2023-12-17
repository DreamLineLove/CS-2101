class Chap3BitwiseOp {

    public static void main(String[] args) {

        int a = 5; // 0000 0101
        int b = 14; // 0000 1110
        int c = 0;

        c = a & b; // decimal 4 or binary 0000 0100
        System.out.println("Decimal c = " + c + "\t\tBinary c = " + Integer.toBinaryString(c));

    }

}
