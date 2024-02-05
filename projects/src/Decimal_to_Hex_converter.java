import java.util.Scanner;

class DecimalToHexConverter {
    static char[] hexDigits(int dec) {
        int []digits = new int[64];
        int place = 0;
        int number = dec;
        while (number > 0) {
            digits[place] = number % 16;
            number = number / 16;
            place += 1;
        }
        digits[place] = -1;

        char []hexDigits = new char[place];

        for (int i = 0; i < place; i++) {
            int temp = digits[i];
            digits[i] = digits[place - 1];
            digits[place - 1] = temp;
            place -= 1;
        }

        for (int i = 0; i < hexDigits.length; i++) {
            if (digits[i] >= 0 && digits[i] < 10) {
                hexDigits[i] = (char)(digits[i] + '0');
            } else {
                hexDigits[i] = (char)(digits[i] - 10 + 'A');
            }
        }
        return hexDigits;
    }

    public static void main(String []args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("\tDECIMAL TO HEXADECIMAL CONVERTER");
        System.out.println("\t--------------------------------\n");

        int dec;
        System.out.print("Enter decimal (base 10) number: ");
        dec = sc.nextInt();

        char hexDigits[] = hexDigits(dec);

        System.out.print("\nbase 10\t\tbase 16\n-------\t\t-------\n" + dec + "\t\t");
        for (int i = 0; i < hexDigits.length; i++) {
                System.out.print(hexDigits[i]);
        }
        System.out.println("\n");
        
        sc.close();
    }
}
