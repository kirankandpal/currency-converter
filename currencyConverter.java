
import java.util.Scanner;

public class currencyConverter {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to Currency Converter!");
        System.out.println("1. USD to Rupee");
        System.out.println("2. Rupee to USD");
        System.out.println("3. Won to Rupee");
        System.out.println("4. Rupee to Won");
        System.out.print("Enter your choice (1 or 2 or 3 or 4): ");
        int choice = scanner.nextInt();


        if (choice == 1) {
            System.out.print("Enter the amount in USD: ");
            double USD = scanner.nextDouble();
            double Rupee = usdToRupee(USD);
            System.out.println("Converted amount in Rupee: " + Rupee);
        } else if (choice == 2) {
            System.out.print("Enter the amount in Rupee: ");
            double Rupee = scanner.nextDouble();
            double USD = RupeeToUsd(Rupee);
            System.out.println("Converted amount in USD: " + USD);
        } else if (choice == 3) {
            System.out.print("Enter the amount in Won: ");
            double Won = scanner.nextDouble();
            double Rupee = WonToRupee(Won);
            System.out.println("Converted amount in Rupee: " + Rupee);
        } else if (choice == 4) {
            System.out.print("Enter the amount in Rupee: ");
            double Rupee = scanner.nextDouble();
            double Won = RupeeToWon(Rupee);
            System.out.println("Converted amount in Won: " + Won);
        } else {
            System.out.println("Invalid choice. Please select 1 or 2 or 3 or 4.");
        }

        scanner.close();
    }

    public static double usdToRupee(double USD) {
        return USD * 83.47;
    }

    public static double RupeeToUsd(double Rupee) {
        return Rupee * 0.0119804;
    }

    public static double WonToRupee(double Won) {return Won * 0.060;
    }

    public static double RupeeToWon(double Rupee) {
        return Rupee * 16.565;
    }
}




