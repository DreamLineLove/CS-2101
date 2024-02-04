import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class DecimalToBinaryConverter {
    static ArrayList<Integer> convertToBinary(int dec) {
        ArrayList<Integer> bits = new ArrayList<>();
        int number = dec;

        while (number > 0) {
            bits.add(number % 2);
            number = number / 2;
        }

        return bits;
    }

    static void displayBinary(int dec, ArrayList<Integer> bits) {
        System.out.print(dec + " in binary form is ");
        int count = 1;
        for (int i : bits) {
            System.out.print(i);
            if (count % 4 == 0) System.out.print(" ");
            count++;
        }
        System.out.println("\n");
    }

    public static void main(String []args) {
        Scanner sc = new Scanner(System.in);

        int dec;
        System.out.print("\nEnter number in decimal form: ");
        dec = sc.nextInt();
        
        ArrayList<Integer> binary = convertToBinary(dec);
        Collections.reverse(binary);
        displayBinary(dec, binary);

        sc.close();
    }
}
