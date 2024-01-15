class Ex5_12 {

    public static void main(String[] args) {

        String s = args[0];
        System.out.println(removeAlt(s));

    }

    static String removeAlt(String s) {
        String New = new String();
        for (int i = 0; i < s.length(); i++) {
            if (i % 2 == 0) New += s.charAt(i);
        }
        return New;
    }

}
