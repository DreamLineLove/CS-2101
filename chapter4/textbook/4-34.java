class Ex4_34 {

    public static void main(String[] args) {

        int list[] = {-3, 4, -2, 6, -9};

        for (int i = 0; i < list.length; i++) {
            if (list[i] < 0) list[i] = -(list[i]);
        }
        
        for (int i = 0; i < list.length; i++) {
            System.out.println(list[i]);
        }
    }

}
