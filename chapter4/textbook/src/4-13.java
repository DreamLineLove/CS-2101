class Ex4_13a {

    static void run() {
        for (int x = 2; x < 8; x++) {
            int y = x;
            do {
                System.out.print(x);
                y += 2;
            } while (y < 10);
            System.out.println();
        }
    }

    // Prediction
    // When x = 2 -> 2222
    // When x = 3 -> 3333  
    // When x = 4 -> 444
    // When x = 5 -> 555
    // When x = 6 -> 66
    // When x = 7 -> 77
    // When x = 8 -> nothing
    
}

class Ex4_13b {

    static void run() {
        int x = 1;
        while (x <= 3) {
            int y = 0;
            do {
                System.out.print(x);
                y++;
            } while (y > x);
            System.out.println();
            x++;
        }
    }

    // Prediction
    // When x = 1 -> 1 \n
    // When x = 2 -> 2 \n
    // When x = 3 -> 3 \n
    // When x = 4 -> nothing
    
}

class Ex4_13 {

    public static void main(String[] args) {
       
        Ex4_13a.run();
        Ex4_13b.run();

    }

}
