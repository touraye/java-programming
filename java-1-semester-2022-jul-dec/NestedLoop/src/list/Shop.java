package list;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Shop {
    public static void main(String[] args) {
        ArrayList items = new ArrayList();
        ArrayList quantities = new ArrayList();
        ArrayList prices = new ArrayList();
        ArrayList<Double> totalPrice = new ArrayList<Double>();

        String item;//single item will be added to items ArrayList
        double price;//single price will be added to price(s) ArrayList
        int quantity = 0;//single quantity for every single it that will be added to items ArrayList
        double total = 0;//the total amount of the entire sales

        Scanner in = new Scanner(System.in);

        System.out.println("====== Welcome to Ams Building Materials ======");
        System.out.println("Enter the product name and their prices");

        boolean flag = false;
        try{
            do {
                System.out.println("Type 'Q' to QUITE, Enter item name and price to continue");
                System.out.print("Enter item name: ");
                item = in.next();
                if(item.equalsIgnoreCase("q")){
                    flag = true;
                    break;
                }
                System.out.print("Enter item price: ");
                price = in.nextDouble();
                System.out.print("Enter quantity: ");
                quantity = in.nextInt();
                //add items and price to the Arrays
                items.add(item);
                prices.add(price);
                quantities.add(quantity);
            } while(!flag);
        } catch (InputMismatchException e){
            System.out.println(e.getMessage()+ " You have entered wrong input!");
        }

        //print the items and their prices
        System.out.println(invoiceStatement());
        //conditionally render list
        if(items.isEmpty()){
            System.out.println("\tYou haven't made any sales!");
        } else {
            System.out.println("\tItem         Quantity        Unit-Price           Total-Price");
            for (int i = 0; i < items.size(); i++){
                double currentPrice = (double) prices.get(i);
                int currentQuantity = (int) quantities.get(i);
                double currentTotalPrice = currentPrice * currentQuantity;
                totalPrice.add(currentTotalPrice);
                total += totalPrice.get(i);
                System.out.println("\t" +items.get(i)+ "          " +quantities.get(i)+ "             " +currencyFormatter((Double) prices.get(i))+ "             " +currencyFormatter(totalPrice.get(i)));
            }
            System.out.println("------------------------------------------");
            System.out.println("\tTotal amount      |       " +currencyFormatter(total));
            System.out.println("\tThank for the sales");
        }
    }

    public static String invoiceStatement(){
        String format = "******************************************* \n" +
                "\tWelcome to Ams Building Materials";
        return format;
    }

    public static String currencyFormatter(double amount){
        //Todo do something
        String formatted = String.format("%,.2f", amount);
        return formatted;
    }
}
