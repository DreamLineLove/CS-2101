class Ex5_14_15_16 {

    public static void main(String[] args) {

        System.out.println(f1(234));
        // System.out.println(f2(10));
        System.out.println(f2(9));
        System.out.println(f3(1));
        System.out.println(f3(2));
        System.out.println(f3(3));
        System.out.println(f3(4));
        System.out.println(f3(5));

    }

    static int f1(int n) {
        if (n < 10) 
            return n;
        else 
            return n % 10 * f1(n / 10);

        // f1(234)
        // returns 234 % 10 = 4 * f1(23)
        //
        // f1(23)
        // returns 23 % 10 = 3 * f1(2)
        //
        // f1(2) 
        // returns 2;
        //
        // f1(234) 
        // finally returns 4 * 3 * 2 = 24
    }

    static int f2(int n) {
        if (n == 1)
            return n;
        else 
            return n + f2(n - 2);

        // f2(10)
        // returns 10 + f2(8);
        //
        // f2(8)
        // returns 8 + f2(6);
        //
        // f2(6)
        // returns 6 + f2(4);
        //
        // f2(4)
        // returns 4 + f2(2);
        //
        // f2(2)
        // returns 2 + f2(0);
        //
        // it goes forever i think
        //
        // a "stackoverflow" exception
        // at some point the functions calling itself recursively overflowed the
        // stack and the exception neatly traced itself down the stack i think.
        //
        // i tried f2(9) as well
        //
        // f2(9)
        // returns 9 + f2(7);
        //
        // f2(7)
        // returns 7 + f2(5);
        //
        // f2(5)
        // returns 5 + f2(3);
        //
        // f2(3)
        // returns 3 + f2(1);
        //
        // f2(1)
        // returns 1;
        //
        // finally returns 9 + 7 + 5 + 3 + 1 = 25
        //
        // so wheter f2(int n) overflows or not depends on the input
    }

    static int f3(int n) {
        if (n == 1)
            return 1;
        else 
            return 2 * n - 1 + f3(n - 1);

        // f3(1)
        // returns 1;
        //
        // f3(2)
        // returns 2 * 2 - 1 + f3(2 - 1);
        // returns 4 - 1 + 1 = 3 + 1 = 4;
        //
        // f(int n) might be a function for squaring n
    }

}
