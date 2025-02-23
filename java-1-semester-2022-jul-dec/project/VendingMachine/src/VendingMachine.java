import java.util.ArrayList;
import java.util.Scanner;

public class VendingMachine {
    private String storeName;
    private ArrayList<String> productNames = new ArrayList<String>();//products in the vending machine
    private ArrayList<String> options = new ArrayList<String>();//options for product
    private ArrayList<Double> productPrices = new ArrayList<Double>();//products price in the vending machine
    private ArrayList<String> productNameCard = new ArrayList<String>();//keeping track of the products' user is buying
    private ArrayList<Double> productPriceCard = new ArrayList<Double>();//keeping track of the price of products' user is buying
    double totalPrice = 0;//total price the user spend
    int itemCount = 0;//number of product the user bought

    //add product to the vending machine
    public void loadProductToTheMachine(){
        System.out.println("Adding products to the vending Machine....");
        productNames.add("water");
        productNames.add("milk");
        productNames.add("drinks");
        productNames.add("ice-cream");
        System.out.println(productNames.size()+ " products were successfully add to the Vending Machine!");
    }

    //display the product on the Product Names Array
    public ArrayList<String> getProductNames() {
        return productNames;
    }

    //add product to the vending machine
    public void loadOptions(){
        options.add("a");
        options.add("b");
        options.add("c");
        options.add("d");
    }

    public ArrayList<String> getOptions() {
        return options;
    }

    //add product prices to the Vending Machine
    public void loadProductPriceToTheMachine(){
        System.out.println("Adding product prices.........");
        productPrices.add(5.0);//water price
        productPrices.add(35.0);//milk price
        productPrices.add(25.0);//drink price
        productPrices.add(15.0);//ice cream price
    }

    //display product prices on the Product Price ArrayList
    public ArrayList<Double> getProductPrices(){
        return productPrices;
    }

    public ArrayList<String> getProductNameCard() {
        return productNameCard;
    }

    //buy product
    public void buy(){
        Scanner in = new Scanner(System.in);
        boolean flag = true;
        do{
            System.out.print("Select from the above options and press 'ENTER' to add to Card or 'q' to QUITE: ");
            String userChoice = in.next();
            if(userChoice.equalsIgnoreCase("q")){
                System.out.println("You have quit!");
                flag = false;
                break;
            }

            //switch different user choice
            switch (userChoice){
                case "a":
                    productNameCard.add("water");
                    totalPrice += 5.0;
                    productPriceCard.add(5.0);
                    System.out.println("water added to card");
                    break;
                case "b":
                    productNameCard.add("milk");
                    totalPrice += 35.0;
                    productPriceCard.add(35.0);
                    System.out.println("milk added to card");
                    break;
                case "c":
                    productNameCard.add("ice-cream");
                    totalPrice += 25.0;
                    productPriceCard.add(25.0);
                    System.out.println("drink added to card");
                    break;
                case "d":
                    productNameCard.add("ice-cream");
                    totalPrice += 15.0;
                    productPriceCard.add(51.0);
                    System.out.println("ice-cream added to card");
                    break;
                default:
                    System.out.println("You haven't select any option! Please select an option to buy");
            }

            System.out.println("Total  " +getTotalPrice());
        } while(flag);
    }

    //total
    public double getTotalPrice(){
        return totalPrice;
    }
}
