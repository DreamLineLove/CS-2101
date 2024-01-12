class Ex5_10 {

    public static void main(String[] args) {

        int year = Integer.parseInt(args[0]);
        if (isLeapYear(year)) {
            System.out.println(year + " is a leap year");
        }
        else {
            System.out.println(year + " is NOT a leap year");
        }

    }

    static boolean isLeapYear(int year) {
        if (year % 400 == 0) return true;
        else if (year % 4 == 0 && year % 100 != 0) return true;
        else return false;
    }

}
