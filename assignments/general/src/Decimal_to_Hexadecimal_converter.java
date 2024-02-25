import java.util.Scanner;
import java.util.Stack;

class DecimalToHexadecimalConverter {
    static Stack<Character> toHex(int dec) {
        Stack<Character> digits = new Stack<>();
        int currentDigit = 0;
        int dividend = dec;

        while (dividend > 0) {
            currentDigit = dividend % 16;
            if (currentDigit >= 0 && currentDigit < 10) {
                digits.add((char)(currentDigit + '0'));
            } else {
                digits.add((char)(currentDigit - 10 + 'A'));
            }
            dividend = dividend / 16;
        }

        return digits;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("\tDECIMAL to HEXADECIMAL converter");
        System.out.println("\t--------------------------------\n");

        int dec;
        System.out.print("Enter decimal (base 10) number: ");
        dec = sc.nextInt();

        Stack<Character> hexDigits = toHex(dec);

        System.out.println("\ndecimal     (base 10):\t\t" + dec);
        System.out.print("hexadecimal (base 16):\t\t");

        int i = 1;
        while (!hexDigits.empty()) {
            System.out.print(hexDigits.pop());
            if (i % 4 == 0) System.out.print(" ");
            i++;
        }
        System.out.println("\n");
        
        sc.close();
    }
}
