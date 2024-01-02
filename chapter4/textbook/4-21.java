import java.util.Scanner;

class Ex4_21 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        sc.close();

        System.out.println("Total = " + sumDigits(num)); 

    }

    static int sumDigits(int num) {
        String str = Integer.toString(num);
        int total = 0;

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            int intValue = Character.getNumericValue(c);
            total += intValue;
        }

        return total;
    }

}
