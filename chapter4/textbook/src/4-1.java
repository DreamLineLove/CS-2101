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

    static void mysteryMethod(char test) {
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



    }

}

class Ex4_1 {

    public static void main(String[] args) {

        Ex4_1a.run();

    }

}
