class Ex3_2 {

    public static void main(String[] args) {

        Ex3_2a.run();
        Ex3_2b.run();

    }

}

class Ex3_2a {

    static void run() {

        int e = 1, f = 2, g = 3, h = 4; 

        int result = ++e - --f - g-- + ++h; // 2 - 1 - 3 + 5 = 3

        System.out.println(result);
        System.out.println(e + " " + f + " " + g + " " + h); // 2 + 1 + 2 + 5 = 12

    }

}

class Ex3_2b {

    static void run() {

        int e = 2, f = 3, g = 4, h = 4; 

        int result = --e - --f + ++g - h--; // 1 - 2 + 5 - 4 = 0

        System.out.println(result);
        System.out.println(e + " " + f + " " + g + " " + h); // 1 + 2 + 5 + 3 = 11
    }

}
