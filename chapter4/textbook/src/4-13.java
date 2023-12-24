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
    // When x = 3 -> 2222  
    // When x = 4 -> 222
    // When x = 5 -> 222
    // When x = 6 -> 22
    // When x = 7 -> 22
    
}

class Ex4_13 {

    public static void main(String[] args) {
       
        Ex4_13a.run();

    }

}
