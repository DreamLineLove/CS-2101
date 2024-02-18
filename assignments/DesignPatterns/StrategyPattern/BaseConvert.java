import java.util.Scanner;

interface Base {
    char[] digits(int dec);
}

class BaseConverter {
    private Base base;

    void setBase(Base base) {
        this.base = base;
    }

    char[] convertBase(int dec) {
        return base.digits(dec);
    }
}

class Binary implements Base {
    @Override
    public char[] digits(int dec) {
        int[] digits = new int[64];
        int place = 0;
        int number = dec;
        while (number > 0) {
            digits[place] = number % 2;
            number = number / 2;
            place += 1;
        }
        digits[place] = -1;

        char[] bits = new char[place];

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
}

class Hexadecimal implements Base {
    @Override
    public char[] digits(int dec) {
        int []digits = new int[64];
        int place = 0;
        int number = dec;
        while (number > 0) {
            digits[place] = number % 16;
            number = number / 16;
            place += 1;
        }
        digits[place] = -1;

        char[] hexDigits = new char[place];

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
}

class BaseConvert {
    static int dec;
    static int base;
    static char[] digits;

    static String[] bases = {
        "Base 2 (Binary)",
        "Base 8 (Octal)",
        "Base 16 (Hexadecimal)",
    };

    public static void main(String []args) {
        Scanner sc = new Scanner(System.in);
        BaseConverter bc = new BaseConverter();

        System.out.println("\tDECIMAL TO BINARY CONVERTER");
        System.out.println("\t---------------------------\n");

        System.out.print("Enter base 10 (decimal) number: ");
        dec = sc.nextInt();

        System.out.println();
        for (int i = 0; i < bases.length; i++) {
            System.out.println(i + "\t" + bases[i]);
        }
        System.out.print("\nType number.. ");
        base = sc.nextInt();

        switch (base) {
            case 0:
            bc.setBase(new Binary());
            digits = bc.convertBase(dec);
            break;
            case 2:
            bc.setBase(new Hexadecimal());
            digits = bc.convertBase(dec);
            break;
        }

        String[] baseStr = bases[base].splitWithDelimiters(" ", 3);

        System.out.print("\nbase 10\t\t" + baseStr[0] + " " + baseStr[2] + "\n-------\t\t-------\n" + dec + "\t\t");
        for (int i = 0; i < digits.length; i++) {
            System.out.print(digits[i]);
            if ((i + 1) % 4 == 0) System.out.print(" ");
        }
        System.out.println("\n");
        
        sc.close();
    }
}
