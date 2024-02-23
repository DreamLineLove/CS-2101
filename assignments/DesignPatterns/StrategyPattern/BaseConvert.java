import java.util.Scanner;
import java.util.Stack;

interface Base {
    Stack<Character> convert(int dec);
}

class BaseConverter {
    private Base base;

    void setBase(Base base) {
        this.base = base;
    }

    Stack<Character> convertBase(int dec) {
        return base.convert(dec);
    }
}

class Binary implements Base {
    @Override
    public Stack<Character> convert(int dec) {
        Stack<Character> digits = new Stack<>();
        char currentDigit;
        int dividend = dec;

        while (dividend > 0) {
            currentDigit = (char)((dividend % 2) + '0');
            digits.add(currentDigit);
            dividend = dividend / 2;
        }

        return digits;
    }
}

class Octal implements Base {
    @Override
    public Stack<Character> convert(int dec) {
        Stack<Character> digits = new Stack<>();
        char currentDigit;
        int dividend = dec;

        while (dividend > 0) {
            currentDigit = (char)((dividend % 8) + '0');
            digits.add(currentDigit);
            dividend = dividend / 2;
        }

        return digits;
    }
}

class Hexadecimal implements Base {
    @Override
    public Stack<Character> convert(int dec) {
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
}

class BaseConvert {
    static int dec;
    static int base;
    static Stack<Character> digits = new Stack<>();

    static String[] bases = {
        "Base 2 (Binary)",
        "Base 8 (Octal)",
        "Base 16 (Hexadecimal)",
    };

    public static void main(String []args) {
        Scanner sc = new Scanner(System.in);
        BaseConverter bc = new BaseConverter();

        System.out.println("\tDECIMAL TO BASE CONVERTER");
        System.out.println("\t-------------------------\n");

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
            case 1:
            bc.setBase(new Octal());
            digits = bc.convertBase(dec);
            break;
            case 2:
            bc.setBase(new Hexadecimal());
            digits = bc.convertBase(dec);
            break;
        }

        String[] baseStr = bases[base].splitWithDelimiters(" ", 3);
        System.out.println("\nBase 10 :\t" + dec);
        System.out.print(baseStr[0] + " " + baseStr[2] + " :\t");

        int i = 1;
        while (!digits.isEmpty()) {
            System.out.print(digits.pop());
            if (i % 4 == 0) System.out.print(" ");
            i++;
        }
        System.out.println("\n");
        
        sc.close();
    }
}
