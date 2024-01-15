class Ex5_6 {

    public static void main(String[] args) {

        int hour = Integer.parseInt(args[0]);
        int minute = Integer.parseInt(args[1]);
        System.out.println(convertToSecond(hour, minute));

    }

    static int convertToSecond(int hour, int minute) {
        return hour * 3600 + minute * 60;
    }

}
