class Ex4_23 {

    public static void main(String[] args) {

        int highest = 0;

        for (int i = 0; i < 5; i++) {
            int num = (int)(Math.random() * 16) + 15;
            System.out.println("Number " + i + " : " + num);
            if (highest < num) highest = num;
        }
        System.out.println("Highest Number is " + highest);

    }

}
