class Ex4_16 {

    public static void main(String[] args) {

        int numOfRow = Integer.parseInt(args[0]);
        int numOfAsterisk = Integer.parseInt(args[1]);

        for (int i = 0; i < numOfRow; i++) {
            for (int j = 0; j < numOfAsterisk; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }

}
