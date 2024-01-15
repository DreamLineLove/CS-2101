class Ex5_13 {

    public static void main(String[] args) {

        int v = Integer.parseInt(args[0]);
        System.out.println("The sum of digits is odd. " + isSumOdd(v));

    }

    static boolean isSumOdd(int v) {
        if (v < 10) {
            return v % 2 != 0; 
        } else {
            int lastDigit = v % 10;
            int remainingDigits = v / 10;
            return (lastDigit % 2 != 0) ^ isSumOdd(remainingDigits);
        }
    }

}
