package java1.projects;

import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class SuperMarket {
    static ArrayList<String> customerName = new ArrayList<>();
    static ArrayList<Double> customerPrice = new ArrayList<>();

    /**
     * Adds a new customer record to the system.
     *
     * This method takes the customer's name and the associated price, and adds
     * these details to their respective lists: `customerName` and `customerPrice`.
     *
     * @param name  The name of the customer to be added.
     * @param price The price associated with the customer.
     */
    static void addCustomerRecord(String name, double price){
        customerName.add(name);
        customerPrice.add(price);
    }

    /**
     * Displays the current contents of the customer's cart.
     *
     * This method prints out the product names and their corresponding prices
     * in a tabular format. It iterates over the lists `customerName` and
     * `customerPrice` to retrieve and display each product's details.
     */
    static void displaySales(){
        System.out.println("Product Name\t\tProduct Price");
        for(int i = 0; i < customerName.size(); i++){
            System.out.println(customerName.get(i)+ "\t\t\t\t" +currencyFormatter(customerPrice.get(i)));
        }
    }

    /**
     * Finds and returns the index of the customer with the highest price in the cart.
     *
     * This method iterates over the list of customer prices to determine the highest
     * price and returns the index of the customer associated with that price.
     *
     * @return The index of the customer with the highest price in the cart.
     */
    static int getTheIndexOfTheBestCustomer(){
        int indexOfTheHighestPrice = 0;
        double maxPrice = 0;

        // Iterate over customer prices to find the highest price
        for(int i = 0; i < customerPrice.size(); i++){
            // find the maximum price
            if(customerPrice.get(i) > maxPrice)
                maxPrice = customerPrice.get(i);
        }

        // Find the index of the highest price
        indexOfTheHighestPrice = customerPrice.indexOf(maxPrice);

        return indexOfTheHighestPrice;
    }

    /**
     * Formats a given currency value into a string with a specified format.
     *
     * This method takes a double value representing a currency amount and formats it according
     * to the US locale currency format. The resulting string representation of the currency
     * amount will have a "GMD" prefix instead of the default "$" symbol used in the US locale.
     *
     * @param currency The currency amount to be formatted.
     * @return A string representing the formatted currency amount with "GMD" as the prefix.
     */
    static String currencyFormatter(double currency){
        NumberFormat currencyFormatter = NumberFormat.getCurrencyInstance(Locale.US);
        String formattedPrice = currencyFormatter.format((int) currency);
        // Replace "$" with "GMD"
        formattedPrice = formattedPrice.replace("$", "GMD");
        return formattedPrice;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String currentCustomerName;
        double currentItemPrice = 0, currentTotalItemPrice = 0;

        /*
        allow user to keep processing a customer until a sentinel value is entered
        at the end store the customer's name in the customerName and sum all the price and store it
        as a corresponding value in the customerPrice ArrayList
         */

        // keep the main program running for the whole day
        // keep attending a customer as long as they have item on the counter

        boolean isOpen = true;

        while(isOpen){

            // take the name of the customer
            System.out.print("Enter customer's name: ");
            currentCustomerName = in.next();
            // keep processing a customer
            boolean isProcessingCustomer = true;
            while(isProcessingCustomer){
                // handle exception for wrong input, in case the user entered other characters(a-z - @#..)
                try {
                    System.out.print("Enter item price: GMD");
                    currentItemPrice = in.nextDouble();
                    currentTotalItemPrice += currentItemPrice;
                } catch (InputMismatchException e){
                    System.out.println("Wrong input for item price.");
                    in.nextLine(); // clear the invalid input
                }

                System.out.println(currentCustomerName+"'s total purchase: " +currencyFormatter(currentTotalItemPrice));
                System.out.println();


                System.out.println("Dose customer has more item?\nType 'Y' for YES and 'N' for No");
                String stillProcess = in.next();
                // store the current customer's name to customerName
                // store the current customer's price to customerPrice
                if(stillProcess.equalsIgnoreCase("n")) {
                    addCustomerRecord(currentCustomerName, currentTotalItemPrice);
                    isProcessingCustomer = false;
                    currentTotalItemPrice = 0;// reset it to zero
                }
            }


            System.out.println("Is the super market open? \nType 'Y' for YES and 'N' for NO");
            String stillOpen = in.next();
            if(stillOpen.equalsIgnoreCase("n"))
                isOpen = false;
        }

        // display sale at the end of the day
        displaySales();
        System.out.println();
        System.out.println("Best Customer For The Day is: " +customerName.get(getTheIndexOfTheBestCustomer()).toUpperCase());
        System.out.println("His/Her Total Purchase Amount is: " +currencyFormatter(customerPrice.get(getTheIndexOfTheBestCustomer())));
    }

}
