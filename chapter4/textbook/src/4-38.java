class Ex4_38 {

    public static void main(String[] args) {

        switchVersion(19); // j = 4
        switchVersion(20); // j = 10
        switchVersion(21); // j = 9
        switchVersion(22); // j = 9
        switchVersion(23); // j = 4 
        switchVersion(24); // j = 7

    }

    static void switchVersion(int i) {
        int j = 0;

        switch (i) {
            case 20: j += 1; // j = 1
            case 21:  
            case 22: j += 2; // j = 3
            case 24: j += 3; // j = 6
            default: j += 4; // j = 10
        }

        System.out.println("(switch) j = " + j);
    }

}
