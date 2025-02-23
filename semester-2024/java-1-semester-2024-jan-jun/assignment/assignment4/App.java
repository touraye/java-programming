package java1.assignment.assignment4;

import java.text.NumberFormat;
import java.util.Scanner;

public class App {
    private double bookCost;
    private double laptopCost;
    private int numDays;
    private String[] schoolDays;
    private int courseDuration;
    private int numSemesters;
    private double transportCost;
    private double lunchCost;

    public void promptUser() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter estimated book cost: $");
        bookCost = scanner.nextDouble();

        System.out.print("Enter laptop cost: $");
        laptopCost = scanner.nextDouble();

        System.out.print("Enter number of days you go to school: ");
        numDays = scanner.nextInt();

        schoolDays = new String[numDays];
        scanner.nextLine(); // Clear the newline character

        for (int i = 0; i < numDays; i++) {
            System.out.print("Enter the name of day " + (i + 1) + ": ");
            schoolDays[i] = scanner.nextLine();
        }

        System.out.print("Enter course duration in days: ");
        courseDuration = scanner.nextInt();

        System.out.print("Enter number of semesters included: ");
        numSemesters = scanner.nextInt();

        System.out.print("Enter daily estimated transport cost: $");
        transportCost = scanner.nextDouble();

        System.out.print("Enter daily estimated lunch cost: $");
        lunchCost = scanner.nextDouble();
    }

    private double calculateWeeklyTransportCost() {
        return numDays * transportCost;
    }

    private double calculateMonthlyTransportCost() {
        return calculateWeeklyTransportCost() * 4; // Assuming 4 weeks in a month
    }

    private double calculateSemesterTransportCost() {
        return calculateMonthlyTransportCost() * (courseDuration / (30.0 * numSemesters));
    }

    private double calculateWeeklyLunchCost() {
        return numDays * lunchCost;
    }

    private double calculateMonthlyLunchCost() {
        return calculateWeeklyLunchCost() * 4; // Assuming 4 weeks in a month
    }

    private double calculateSemesterLunchCost() {
        return calculateMonthlyLunchCost() * (courseDuration / (30.0 * numSemesters));
    }

    public void calculateTotalCost() {
        double totalCost = bookCost + laptopCost + calculateSemesterTransportCost() + calculateSemesterLunchCost();

        NumberFormat currencyFormatter = NumberFormat.getCurrencyInstance();
        String formattedTotalCost = currencyFormatter.format(totalCost);

        System.out.println("Total estimated cost for the program duration: " + formattedTotalCost);
    }
}
