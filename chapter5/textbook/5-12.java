class Ex5_12 {
    public static void main(String[] args) {
        String str = args[0];
        System.out.println(removeAlt(str));
    }

    static String removeAlt(String str) {
        String newStr = "";
        for (int i = 0; i < str.length(); i++) {
            if (i % 2 == 0) newStr += str.charAt(i);
        }
        return newStr;
    }
}
