class Ex5_7 {

    public static void main(String[] args) {

        int num1 = Integer.parseInt(args[0]);
        int num2 = Integer.parseInt(args[1]);
        System.out.println(gcd(num1, num2));

    }

    static int gcd(int num1, int num2) {
        int gcd = 1, num = 1;

        while (num <= num1 && num <= num2) {
            if (num1 % num == 0 && num2 % num == 0) {
                gcd = num;
                num++;
            } else num++;
        }

        return gcd;
    }

}
