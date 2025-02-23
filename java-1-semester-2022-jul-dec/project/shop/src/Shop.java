import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Shop {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("========= Welcome Building Material Shop ==========");
        //store
        ArrayList items = new ArrayList();
        ArrayList prices = new ArrayList();
        ArrayList quantities = new ArrayList();
        ArrayList totalUnitSale = new ArrayList();

        //Global Vars
        String item;
        double price;
        int quantity;
        double total = 0;//initial total sales

        //flag
        boolean flag = true;
        try {
        do{
            System.out.print("Enter 'Q - q' to quite or Enter item name:  ");
             item = in.next();
            if(item.equalsIgnoreCase("q")){
                flag = false;
                break;
            }
            System.out.print("Enter item price:  ");
            price = in.nextDouble();
            System.out.print("Enter item quantity:  ");
            quantity = in.nextInt();

            //add current item to [items]
            items.add(item);
            //add current price to [prices]
            prices.add(price);
            //add current quantity to [quantities]
            quantities.add(quantity);

        } while(flag);
        } catch (InputMismatchException ex){
            System.out.println(ex.getMessage());
            System.out.println("Please provide the right input");
        }

        //render conditionally
        if(items.isEmpty()){
            System.out.println("You haven't make any sales!");
        } else {
            //render product, price, quantities from store
            System.out.println("Item            Quantity            Price           Total");

            try{

                for(int i = 0; i < items.size(); i++){
                    double currentItemPrice = (double) prices.get(i);//cast from String to double type
                    int currentItemQuantity = (int) quantities.get(i);//cast from String to double type
                    double currentItemTotalPrice = currentItemPrice * currentItemQuantity;
                    //add current total price to total sale
                    total += currentItemTotalPrice;
                    System.out.println(items.get(i)+ "          " +quantities.get(i)+ "         " +currencyFormat((Double) prices.get(i))+ "         " +currencyFormat(currentItemTotalPrice) );
                }
                System.out.println("------------------------------------------");
                System.out.println("\tTotal                         " +currencyFormat(total));
            }catch (IndexOutOfBoundsException ex){
                System.out.println(ex.getMessage());
                System.out.println("Cannot read from index you provided. Array index out of bounds");
            }
        }

    }

    //current formatter
    public static String currencyFormat(double total){
        String formattedCurrency = String.format("%,.2f", total);
        return formattedCurrency;
    }
}
