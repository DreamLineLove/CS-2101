import java.util.Scanner;

class DecimalToOctalConverter {
    static char[] octalDigits(int dec) {
        int[] digits = new int[64];
        int place = 0;
        int number = dec;
        while (number > 0) {
            digits[place] = number % 8;
            number = number / 8;
            place += 1;
        }
        digits[place] = -1;

        char[] octalDigits = new char[place];

        for (int i = 0; i < place; i++) {
            int temp = digits[i];
            digits[i] = digits[place - 1];
            digits[place - 1] = temp;
            place -= 1;
        }

        for (int i = 0; i < octalDigits.length; i++) {
            octalDigits[i] = (char)(digits[i] + '0');
        }
        return octalDigits;
    }

    public static void main(String []args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("\tDECIMAL TO OCTAL CONVERTER");
        System.out.println("\t---------------------------\n");

        int dec;
        System.out.print("Enter decimal (base 10) number: ");
        dec = sc.nextInt();

        char[] octalDigits = octalDigits(dec);

        System.out.print("\nbase 10\t\tbase 8\n-------\t\t-------\n" + dec + "\t\t");
        for (int i = 0; i < octalDigits.length; i++) {
            System.out.print(octalDigits[i]);
            if ((i + 1) % 4 == 0) System.out.print(" ");
        }
        System.out.println("\n");
        
        sc.close();
    }
}
