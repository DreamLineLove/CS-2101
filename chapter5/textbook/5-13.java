class Ex5_13 {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Provide an integer as program arguement!");
        } else if (args.length > 1) {
            System.out.println("Only one integer can be provided!");
        } else {
            int v = Integer.parseInt(args[0]);
            if (v < 0) {
                System.out.println("Only non-negative integers can be provided!");
            } else {
                System.out.println(isSumOdd(v));
            }
        }
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
