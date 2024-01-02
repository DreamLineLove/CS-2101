class Ex3_1 {

   public static void main(String[] args) {

       x.print(5, 2, true);
       x.print(5, 2, false);
       x.print(5, 2.0, false);
       x.print(5.0, 2.0, false);
        
    }

}

class x {

    static void print(double a, double b, boolean isInteger) {

        if (isInteger) {
            int y = (int)a;
            int z = (int)b;
            int x = y / z;

            System.out.println("int x = " + x + ";");
            return;
        }

        double x = a / b;
        System.out.println("double x = " + x + ";");

    }

}
