class Ex3_12 {

    public static void main(String[] args) {

        int total;
        int currentValue;

        total = 5;
        currentValue = 5;

        /*
         * total / currentValue; is not a statement!
         * the code therefore will error on compilation
         *
         * total / currentValue;
         *
         */

        // the result of the division is assigned back to variable total
        total = total / currentValue;
        currentValue++;

        System.out.println("Total is now " + total);

    }

}
