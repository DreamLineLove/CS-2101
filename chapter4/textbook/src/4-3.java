import java.util.Scanner;

class Ex4_3 {

    public static void main(String[] args) {

        int type;
        double price, profit;

        Scanner sc = new Scanner(System.in);

        System.out.print("enter type of item (0 or 1): ");
        type = sc.nextInt();

        System.out.print("enter price of item: ");
        price = sc.nextDouble();

        sc.close();

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
