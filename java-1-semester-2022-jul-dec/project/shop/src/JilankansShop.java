import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class JilankansShop {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        //Store
        ArrayList<String> items = new ArrayList<String>();
        ArrayList prices = new ArrayList();
        ArrayList quantities = new ArrayList();
        ArrayList unitTotal = new ArrayList();

        //Global variables
        String item;
        double price;
        int quantity;
        double total = 0;//transaction total

        //flag - sentinel value
        boolean flag = true;
        //loop - iteration
        try{
            do{
                System.out.print("Enter 'Q - q' to terminate or Enter item name:  ");
                item = in.next();
                //check for 'Q - q' to end program
                if(item.equalsIgnoreCase("Q")){
                    flag = false;
                    break;
                }
                System.out.print("Enter item price:  ");
                price = in.nextDouble();
                System.out.print("Enter item quantity:  ");
                quantity = in.nextInt();

                //add item to [items]
                items.add(item);
                //add price to [prices]
                prices.add(price);
                //add quantity to [quantities]
                quantities.add(quantity);

                //calculate the unit total
                double uTotal = quantity * price;
                unitTotal.add(uTotal);

                //update the total sales
                total += uTotal;//total = total + uTotal

            } while(flag);
        } catch (InputMismatchException ex){
            System.out.println(ex.getMessage());
            System.out.println("Please may sure tha you entered a right detail");
        }



        //check for items Array size
        if(items.isEmpty()){
            System.out.println("You haven't made any sales!");
        } else {
            //Print transactions receipt
            System.out.println("Item Name           Item Quantity           Item Price          Unit Total");
            //iteration
            for(int i = 0; i < items.size(); i++){
                System.out.println(items.get(i)+ "                 " +quantities.get(i)+ "           GMD" +currencyFormat((Double) prices.get(i))+ "           GMD" +currencyFormat((Double) unitTotal.get(i)));

            }
            System.out.println("-------------------------------------------");
            System.out.println("Total Sales GMD" +currencyFormat(total));
        }
    }

    //currency formatter
    public static String currencyFormat(double total){
        String formatCurrency = String.format("%,.2f", total);
        return formatCurrency;
    }
}
