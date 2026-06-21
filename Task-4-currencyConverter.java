import java.util.Scanner;
public class currencyConverter {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        System.out.println("********** Currency Converter **********");

        System.out.print("Enter amount : ");
        double amount = sc.nextDouble();

        System.out.println("\nSelect Source Currency:");
        System.out.println("1. USD");
        System.out.println("2. INR");
        System.out.println("3. EUR");
        System.out.println("4. GBP");
        int source = sc.nextInt();

        System.out.println("\nSelect Target Currency:");
        System.out.println("1. USD");
        System.out.println("2. INR");
        System.out.println("3. EUR");
        System.out.println("4. GBP");
        int target = sc.nextInt();

        double amountInUSD = 0;
        double convertedAmount = 0;

       
        switch (source) {
            case 1:
                amountInUSD = amount;
                break;
            case 2:
                amountInUSD = amount / 83.0;
                break;
            case 3:
                amountInUSD = amount / 0.92;
                break;
            case 4:
                amountInUSD = amount / 0.79;
                break;
            default:
                System.out.println("Invalid Source Currency!");
                return;
        }


        switch (target) {
            case 1:
                convertedAmount = amountInUSD;
                break;
            case 2:
                convertedAmount = amountInUSD * 83.0;
                break;
            case 3:
                convertedAmount = amountInUSD * 0.92;
                break;
            case 4:
                convertedAmount = amountInUSD * 0.79;
                break;
            default:
                System.out.println("Invalid Target Currency!");
                return;
        }

        System.out.printf("\nConverted Amount: %.2f%n", convertedAmount);

        sc.close();
    }
}

