class Ex3_15 {

    public static void main(String[] args) {

       int tempResult = 2;
       int w = 3, x = 9, y = 2, z = 6;

        if ( (w != x) && (y == (z / 3)) ) {
            System.out.println("Output A");
        } else {
            System.out.println("Output B");
        }

        tempResult *= x++ * --y;
        System.out.println("tempResult = " + tempResult);
        System.out.println("x = " + x);
        System.out.println("y = " + y);

    }

}
