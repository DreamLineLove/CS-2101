import java.util.Scanner;
import java.util.Stack; 

class DecimalToOctalConverter {
    static Stack<Character> toOctal(int dec) {
        Stack<Character> digits = new Stack<>();
        char currentDigit;
        int dividend = dec;

        while (dividend > 0) {
            currentDigit = (char)((dividend % 8) + '0');
            digits.add(currentDigit);
            dividend = dividend / 8;
        }

        return digits;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("\tDECIMAL TO OCTAL CONVERTER");
        System.out.println("\t---------------------------\n");

        int dec;
        System.out.print("Enter decimal (base 10) number: ");
        dec = sc.nextInt();

        Stack<Character> octalDigits = toOctal(dec);

        System.out.println("\ndecimal (base 10):\t" + dec);
        System.out.print("octal   (base 8 ):\t");

        int i = 1;
        while (!octalDigits.empty()) {
            System.out.print(octalDigits.pop());
            if (i % 4 == 0) System.out.print(" ");
            i++;
        }
        System.out.println("\n");
        
        sc.close();
    }
}
