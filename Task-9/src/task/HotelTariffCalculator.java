package task;
import java.util.Scanner;

public class HotelTariffCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input
        System.out.println("Enter the month (1-12):");
        int month = scanner.nextInt();
        
        System.out.println("Enter the room rent per day:");
        double roomRent = scanner.nextDouble();
        
        System.out.println("Enter the number of days stayed:");
        int daysStayed = scanner.nextInt();
        
        scanner.close();

        // Calculate tariff
        double totalTariff;
        switch (month) {
            case 4:
            case 5:
            case 6:
            case 11:
            case 12:
                // Room rent is 20% higher during peak seasons
                totalTariff = roomRent * daysStayed * 1.2;
                break;
            default:
                totalTariff = roomRent * daysStayed;
                break;
        }

        // Output
        System.out.printf("Hotel Tariff: %.2f", totalTariff);
    }
}
