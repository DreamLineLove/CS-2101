class Ex5_2 {
    public static void main(String[] args) {
        printReverse(123456);
    }

    static void printReverse(int num) {
        String numStr = String.valueOf(num);
        char []reverseStr = new char[numStr.length()];
        for (int i = 0, j = numStr.length() - 1; i < numStr.length(); i++, j--) {
            reverseStr[i] = numStr.charAt(j);
        }
        System.out.println(reverseStr);
    }
}
