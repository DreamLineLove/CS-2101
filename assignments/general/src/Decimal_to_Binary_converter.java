import java.util.Scanner;
import java.util.Stack;

class DecimalToBinaryConverter {
    static Stack<Character> toBinary(int dec) {
        Stack<Character> digits = new Stack<>();
        char currentDigit = 0;
        int dividend = dec;

        while (dividend > 0) {
            currentDigit = (char)((dividend % 2) + '0');
            digits.add(currentDigit);
            dividend = dividend / 2;
        }

        return digits;
    }

    public static void main(String []args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("\tDECIMAL TO BINARY CONVERTER");
        System.out.println("\t---------------------------\n");

        int dec;
        System.out.print("Enter decimal (base 10) number: ");
        dec = sc.nextInt();

        Stack<Character> bits = toBinary(dec);

        System.out.print("\nbase 10\t\tbase 2\n-------\t\t-------\n" + dec + "\t\t");

        int i = 1;
        while (!bits.empty()) {
            System.out.print(bits.pop());
            if (i % 4 == 0) System.out.print(" ");
        }
        System.out.println("\n");
        
        sc.close();
    }
}
