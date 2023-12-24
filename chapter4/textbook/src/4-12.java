class Ex4_12 {

    public static void main(String[] args) {
        int total = 0;
        for (int count = 1; count <= 10; count++) {
            int randomInt;

            do {
                randomInt = (int)(Math.random() * 9);

            } while (randomInt % 2 != 0);

            System.out.println(randomInt);

            total += randomInt;
        }
        double average = total / 10.0;

        System.out.println(average);
    }

}
