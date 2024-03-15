package general;

/**
 * If Teacher is using command-line, please also include the
 * program arguments.
 * e.g. java IsSumOdd 563
 * 
 * If Teacher is using Eclipse, please do the following:
 * - go to Run > Run configurations.. > Arguments > Program arguments:
 * e.g. 563
 */
class IsSumOdd {
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
