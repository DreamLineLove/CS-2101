import java.util.Scanner;

class Ex4_4 {

    public static void main(String[] args) {

        String accountType;
        double amt, interest;
        int year;

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter account type: ");
        accountType = sc.nextLine();

        System.out.print("Enter amount loan: ");
        amt = sc.nextDouble();

        System.out.print("Enter loan period: ");
        year = sc.nextInt();

        sc.close();

        switch (accountType) {
            case "Normal":
                if (year < 5) interest = amt * 0.15; 
                else interest = amt * 0.17;
                break;
            case "Deluxe":
                if (year < 10) interest = amt * 0.14;
                else if (year >= 10 && year <= 15) interest = amt * 0.16;
                else interest = amt * 0.18;
                break;
            default:
                interest = amt * 0.18; 
        }

    }

}
