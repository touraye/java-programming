package java1.projects;

import java.text.NumberFormat;
import java.util.*;

public class ShopTrackerProgram {
    /**
     * Prints the list of products along with their prices.
     *
     * This method takes two arrays: one containing product names and the other containing
     * corresponding product prices. It prints out a tabular representation of the product
     * key, product name, and product price.
     *
     * @param product An array of product names.
     * @param price   An array of product prices.
     */
    static void printProduct(String[] product, double[] price) {
        // Print table header
        System.out.println("Product Key \t Product Name \t Product Price");

        // Loop through each product and its corresponding price
        for (int i = 0; i < product.length; i++) {
            // Print product key, product name, and product price
            System.out.println(i + "\t\t\t\t\t" + product[i] + "\t\t\t" + currencyFormatter(price[i]));
        }
    }

    /**
     * Prints the details of the shopping cart.
     *
     * This method takes two ArrayLists: one containing product names and the other containing
     * corresponding product prices, along with the total amount of the cart. It prints out a
     * tabular representation of the product name and price, as well as the total number of items
     * bought and the total item cost.
     *
     * @param productName  An ArrayList of product names.
     * @param productPrice An ArrayList of product prices.
     * @param totalAmount  The total cost of the items in the cart.
     */
    static void printCartDetail(ArrayList<String> productName, ArrayList<Double> productPrice, double totalAmount) {
        System.out.println(); // create line
        System.out.println("Product Name \t Product Price");

        // Loop through each product and its corresponding price
        for (int i = 0; i < productName.size(); i++) {
            // Print product name and product price
            System.out.println(productName.get(i) + "\t\t\t\t" + currencyFormatter(productPrice.get(i)));
        }

        System.out.println(); // create line
        System.out.println("----------------------------------");
        System.out.println("Number of items bought: " + productName.size());
        System.out.println("Total item cost: " + currencyFormatter(totalAmount));
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
        System.out.println("************* Shop Tracker Program *************");

        // Scanner object
        Scanner in = new Scanner(System.in);

        // global variable
        String[] productList = {"banana", "bread", "milk", "sugar", "apple", "carrot"};
        double[] productPrice = {50, 10, 75, 17, 15, 15};
        ArrayList<String> cartProductName = new ArrayList<>();
        ArrayList<Double> cartProductPrice = new ArrayList<>();
        /*
        0: Banana: 50;
        1: Bread: 10;
        2: Milk: 75
        3: Sugar: 17
        4: Apple: 15
        5: Egg: 15
         */
        //String[] cart = new String[productList.length]; // declare an Array size as the size of the productList Array
        int totalNumberOfItemSold = 0;
        double totalAmount = 0;


        // while loop
        while(true){
            printProduct(productList, productPrice); // print product list to the user

            System.out.println(); // create empty line

            try {
                System.out.print("Enter product key: "); // enter input - product key
                int index = in.nextInt();// store product key into index
                // print product name and price
                System.out.println("You are buying '" +productList[index] + "' it cost for : 'GMD" + productPrice[index]+"'");
                totalAmount += productPrice[index];

                cartProductName.add(productList[index]);
                cartProductPrice.add(productPrice[index]);
                System.out.println("Items on the cart: " +cartProductName.size());
                System.out.println("Total price: " +currencyFormatter(totalAmount));
                System.out.println();

                System.out.print("Type Q to quit or any to continue:");
                String exit = in.next();

                if(exit.equalsIgnoreCase("Q")) // break the program when user type q or Q
                    break;

            }  catch (ArrayIndexOutOfBoundsException e){
                System.out.println("Product not found! Check the key you typed.");
            } catch (InputMismatchException e){
                System.out.println("Wrong input");
                in.nextLine(); // clear the invalid input
                // in.nextLine() inside the catch block consumes the invalid input and clears the scanner's buffer.
            }

            System.out.println("The number of items sold: " +totalNumberOfItemSold);

        } // end while

        System.out.println();// create a line
        // print cart details
        printCartDetail(cartProductName, cartProductPrice, totalAmount);
    }
}
