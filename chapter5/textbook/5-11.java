class Ex5_11 {

    static double minDay = 1.5;
    static double minCharge = 120;
    static double chargePerDay = 45.50;

    static String [] customer;
    static double [] daysRent;
    static double [] rentalCharge;

    static void initArrays(String argv[]) {
        customer = new String[argv.length / 2];
        daysRent = new double[argv.length / 2];
        rentalCharge = new double[argv.length / 2];
    }

    static void readInputValues(String argv[]) {
        int k = 0;
        for (int i = 0; i < argv.length/2; i++) {
            customer[i] = argv[k+0];
            daysRent[i] = Double.parseDouble(argv[k+1]);
            k += 2;
        }
    }

    static double getCharge(double days) {
        if (days == 0) return 0;
        else if (days <= 1.5) return minCharge;
        else return minCharge + Math.round(days - 1.5) * chargePerDay; 
    } 

    static void computeCharges() {
        for (int i = 0; i < customer.length; i++) {
            rentalCharge[i] = getCharge(daysRent[i]);
        }
    }

    static void printResult() {
        System.out.println("Day\tCharge\tCustomer");
        for (int i = 0; i < customer.length; i++) {
            System.out.println(daysRent[i] + "\t" + rentalCharge[i] + "\t" + customer[i]);
        }
    }

    public static void main(String argv[]) {
        initArrays(argv);
        readInputValues(argv);
        computeCharges();
        printResult();
    }
}
