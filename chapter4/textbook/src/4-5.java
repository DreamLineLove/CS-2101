class Ex4_5 {

    public static void main(String[] args) {

        boolean conditionA = true, conditionB = false, conditionC = false;      
        int num1 = 5, num2 = 15;

        if (conditionA == conditionB) {
            System.out.println("A");
        } else if (conditionB == false) {
            System.out.println("B"); // this will print
            if (conditionC == conditionB) {
                System.out.println("C"); // this will print
                if (num1 == num2) {
                    System.out.println("D");
                } else {
                    System.out.println("E"); // this will print
                }
            } else {
                System.out.println("F");
            }
        } else if (conditionC == false) {
            System.out.println("G");
        } else if (conditionB == conditionC) {
            System.out.println("H");
        }

    }

}
