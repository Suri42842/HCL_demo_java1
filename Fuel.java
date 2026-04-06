import java.util.Scanner;

public class Fuel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        System.out.print("Enter distance (in km): ");
        double distance = sc.nextDouble();

        System.out.print("Enter mileage (km per liter): ");
        double mileage = sc.nextDouble();

        System.out.print("Enter fuel price per liter: ");
        double price = sc.nextDouble();

        double fuelNeeded = distance / mileage;
        double totalCost = fuelNeeded * price;

       
        System.out.println("Total fuel cost = " + totalCost);

        sc.close();
    }
}