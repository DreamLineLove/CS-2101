class Ex4_39 {

    public static void main(String[] args) {

        // int j = 0;
        // for (int i = 0; i < 10; i += 3) 
        //     j += i;
        // System.out.println(i + " " + j); 
        //
        // The above code does not even compile because i is not declared in the
        // bigger scope.
        
        int i = 0, j = 0;
        for (i = 0; i < 10; i += 3) 
            j += i;
        System.out.println(i + " " + j); // Guess -> i + j = 30

    }

}
