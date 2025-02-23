package java1.projects;

import java.text.NumberFormat;
import java.util.*;

public class SupermarketCheckout {
        private ArrayList<String> customerNames;
        private ArrayList<Double> customerTotalPurchase;
        private Scanner scanner;

        public SupermarketCheckout() {
            customerNames = new ArrayList<>();
            customerTotalPurchase = new ArrayList<>();
            scanner = new Scanner(System.in);
        }

        public void addCustomerToRecord(String name, double purchaseAmount) {
            customerNames.add(name);
            customerTotalPurchase.add(purchaseAmount);
        }

        public void displaySales() {
            System.out.println("Sales Summary:");
            System.out.println("--------------------------------------------------");
            System.out.printf("%-20s | %15s\n", "Customer Name", "Total Purchase");
            System.out.println("--------------------------------------------------");
            for (int i = 0; i < customerNames.size(); i++) {
                String name = customerNames.get(i);
                double purchase = customerTotalPurchase.get(i);
                System.out.printf("%-20s | %s\n", name, currencyFormatter(purchase));
            }
            System.out.println("--------------------------------------------------");
        }

        public int getIndexOfTheBestCustomer() {
            if (customerTotalPurchase.isEmpty()) {
                return -1; // No customers yet
            }

            double maxPurchase = customerTotalPurchase.get(0);
            int indexOfBestCustomer = 0;

            for (int i = 1; i < customerTotalPurchase.size(); i++) {
                if (customerTotalPurchase.get(i) > maxPurchase) {
                    maxPurchase = customerTotalPurchase.get(i);
                    indexOfBestCustomer = i;
                }
            }

            return indexOfBestCustomer;
        }



        public String currencyFormatter(double amount) {
            NumberFormat gmdFormat = NumberFormat.getCurrencyInstance(Locale.US);
            gmdFormat.setCurrency(Currency.getInstance("GMD"));
            return gmdFormat.format(amount);
        }


        public static void main(String[] args) {
            SupermarketCheckout supermarket = new SupermarketCheckout();
            supermarket.runCheckout();
        }


        public void runCheckout() {
            System.out.println("Welcome to the Supermarket Checkout System!");

            boolean continueShopping = true;

            while (continueShopping) {
                try {
                    System.out.print("Enter customer name: ");
                    String name = scanner.nextLine();

                    double totalPurchase = 0.0;
                    boolean moreItems = true;

                    while (moreItems) {
                        System.out.print("Enter item price (0 to stop): ");
                        double price = scanner.nextDouble();
                        scanner.nextLine(); // Consume newline left by nextDouble()

                        if (price == 0.0) {
                            moreItems = false;
                        } else if (price < 0) {
                            System.out.println("Invalid price. Please enter a positive value.");
                        } else {
                            totalPurchase += price;
                        }
                    }

                    addCustomerToRecord(name, totalPurchase);

                    System.out.print("Continue with next customer? (yes/no): ");
                    String continueChoice = scanner.nextLine().toLowerCase();

                    if (!continueChoice.equals("yes")) {
                        continueShopping = false;
                    }
                } catch (InputMismatchException e) {
                    System.out.println("Invalid input. Please enter a valid number.");
                    scanner.nextLine(); // Clear scanner buffer
                }
            }


            displaySales();
            int bestCustomerIndex = getIndexOfTheBestCustomer();
            if (bestCustomerIndex != -1) {
                System.out.println("Best Customer of the Day: " + customerNames.get(bestCustomerIndex) +
                        " with total purchase " + currencyFormatter(customerTotalPurchase.get(bestCustomerIndex)));
            }
        }
}

