class Ex4_22 {

    public static void main(String[] args) {

        User user = new User("ZNZ", 10);
        user.print();

    }

}

class User {
    String name;
    int month;

    User(String name, int month) {
        name = this.name; 
        month = this.month;
    }

    void print() {
        System.out.println("My name is " + name);
        System.out.println("It is " + monthName(month));
    }

    String monthName(int month) {
        String monthStr;
        
        switch (month) {
            case 1: monthStr = "January"; break;
            case 2: monthStr = "February"; break;
            case 3: monthStr = "March"; break;
            case 4: monthStr = "April"; break;
            case 5: monthStr = "May"; break;
            case 6: monthStr = "June"; break;
            case 7: monthStr = "July"; break;
            case 8: monthStr = "August"; break;
            case 9: monthStr = "September"; break;
            case 10: monthStr = "October"; break;
            case 11: monthStr = "November"; break;
            case 12: monthStr = "December"; break;
            default: monthStr = "Invalid";
        }

        return monthStr;
    }

}
