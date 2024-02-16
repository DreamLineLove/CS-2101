import java.util.Scanner;

class DecimalToBinaryConverter {
    static char[] bits(int dec) {
        int []digits = new int[64];
        int place = 0;
        int number = dec;
        while (number > 0) {
            digits[place] = number % 2;
            number = number / 2;
            place += 1;
        }
        digits[place] = -1;

        char []bits = new char[place];

        for (int i = 0; i < place; i++) {
            int temp = digits[i];
            digits[i] = digits[place - 1];
            digits[place - 1] = temp;
            place -= 1;
        }

        for (int i = 0; i < bits.length; i++) {
            bits[i] = (char)(digits[i] + '0');
        }
        return bits;
    }

    public static void main(String []args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("\tDECIMAL TO BINARY CONVERTER");
        System.out.println("\t---------------------------\n");

        int dec;
        System.out.print("Enter decimal (base 10) number: ");
        dec = sc.nextInt();

        char bits[] = bits(dec);

        System.out.print("\nbase 10\t\tbase 2\n-------\t\t-------\n" + dec + "\t\t");
        for (int i = 0; i < bits.length; i++) {
            System.out.print(bits[i]);
            if ((i + 1) % 4 == 0) System.out.print(" ");
        }
        System.out.println("\n");
        
        sc.close();
    }
}
