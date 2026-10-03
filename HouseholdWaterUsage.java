import java.util.Scanner;

public class HouseholdWaterUsage {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of family members: ");
        int familyMembers = sc.nextInt();

        System.out.print("Enter water consumed in litres: ");
        double waterConsumed = sc.nextDouble();

        System.out.print("Enter house number: ");
        int houseNumber = sc.nextInt();

        System.out.print("Enter water usage status: ");
        char usageStatus = sc.next().charAt(0);

        System.out.println("\nHousehold Details:");
        System.out.println("Number of family members: " + familyMembers);
        System.out.println("Water consumed: " + waterConsumed + " litres");
        System.out.println("House number: " + houseNumber);
        System.out.println("Water usage status: " + usageStatus);

        sc.close();
    }
}