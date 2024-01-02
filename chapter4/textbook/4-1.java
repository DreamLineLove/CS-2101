class Ex4_1a {

    static void run() {

        boolean cond1 = true, cond2 = true, cond3 = false;     

        if (cond1 != false) 
        System.out.println("@@@@@");
        if (cond2) 
        System.out.println("#####");
        else
        System.out.println("$$$$$"); // Guess: will not get printed
        if (cond3) 
        System.out.println("&&&&&"); // Guess: will not get printed
        System.out.println("*****");

    }

}

class Ex4_1b {

    void mysteryMethod(char test) {
        switch (test) {
            case 'a':
                System.out.println("test is A");
            case 'b':
                System.out.println("test is B"); // Guess: this WILL get printed
            default :
                System.out.println("test is default"); // Guess: this WILL get printed
        }
    }

    static void run() {
        Ex4_1b mystery = new Ex4_1b();    

        mystery.mysteryMethod('b');
    }

}

class Ex4_1c {

    static void run() {

        int testcase = 2;
        boolean cond1 = true, cond2 = true, cond3 = false;

        switch (testcase) {
            case 1:
                if (cond1)
                    System.out.println("A");
                break;
            case 2:
                System.out.println("B"); // Guess: WILL print
                if (cond2)
                    System.out.println("C"); // Guess: WILL print
                else
                    System.out.println("D");
                System.out.println("E"); // Guess: WILL print
            case 3:
                if (cond3)
                    System.out.println("F");
            default:
                System.out.println("G"); // Guess: WILL print
                break;
        }

    }

}

class Ex4_1 {

    public static void main(String[] args) {

        Ex4_1a.run();
        Ex4_1b.run();
        Ex4_1c.run();

    }

}
