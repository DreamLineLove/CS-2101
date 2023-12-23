class Ex4_3 {

    public static void main(String[] args) {

        int type;
        double price;
        double profit;

        type = Integer.parseInt(args[0]);
        price = Double.parseDouble(args[1]);

        switch (type) {
            case 0:
                if (price < 0) {
                    System.err.println("Price should not be in the negative!");
                    return;
                }
                if (price < 20.0) profit = price * 0.10;
                else if (price >= 20.0 && price <= 50.0) profit = price * 0.15;
                else profit = price * 0.20;
                break;
            case 1:
                if (price < 0) {
                    System.err.println("Price should not be in the negative!");
                    return;
                }
                if (price < 5.0 || price > 30.0) profit = price * 0.05; 
                else profit = price * 0.10;
                break;
            default:
                System.err.println("Type of item not recognized!");
                return;
        }

        System.err.println("Profit is " + profit);

    }

}
