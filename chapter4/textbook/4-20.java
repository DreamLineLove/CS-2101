class Ex4_20 {

    public static void main(String[] args) {

        for (int i = 10; i > 0; i--) {
            int j = 0;
            innerWhile:
                while (j < i) {
                    j++;
                    if (j % 8 == 0) 
                    break innerWhile;
                    else if (j % 2 == 0) 
                    continue;
                    System.out.print(j + " ");
                }
                System.out.println();
        }          

        // Prediction
        // When i = 10 --> 1 3 5 7
        // When i = 9  --> 1 3 5 7
        // When i = 8  --> 1 3 5 7
        // When i = 7  --> 1 3 5 7
        // When i = 6  --> 1 3 5
        // When i = 5  --> 1 3 5
        // When i = 4  --> 1 3
        // When i = 3  --> 1 3
        // When i = 2  --> 1
        // When i = 1  --> 1

    }

}
