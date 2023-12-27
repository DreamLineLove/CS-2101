class Ex4_32 {

    public static void main(String[] args) {

        int[] list = {3, 5, 0, 1, 4};

        int i = list[3]; // i = 1
        list[1] = 7; // 5 is now 7
        // list = {3, 7, 0, 1, 4};
        int j = list[list[2]]; // j = 3
        list[list[0]] = 4; // 1 is now 4
        // list = {3, 7, 0, 4, 4};
        list[list[3]] = list[list[1]]; // probably should error here

        // Nope! Got an ArrayIndexOutOfBoundsException straight up!

    }

}
