import helpers.Helpers;

public class Tester {
    public static void main(String[] args) {
        VendingMachine vendingMachine = new VendingMachine();
        vendingMachine.loadProductToTheMachine();
        vendingMachine.loadProductPriceToTheMachine();
        vendingMachine.loadOptions();
        Helpers currencyFormat = new Helpers();
        System.out.println("------------------------------------------------");

        //iterate over the products with their prices on th vending machine
        System.out.println("Option      |       Product Name        |       Product Price");
        for(int i = 0; i < vendingMachine.getProductNames().size(); i++){
            System.out.println(vendingMachine.getOptions().get(i)+"                   "+vendingMachine.getProductNames().get(i)+ "                      " +currencyFormat.decimalFormat(vendingMachine.getProductPrices().get(i)));
        }

        //Let buy some product from our vending machine
        vendingMachine.buy();
        vendingMachine.loadOptions();

        //display the product on the card
        System.out.println("products on the card \n" +vendingMachine.getProductNameCard());
        System.out.println("You have spend GMD" +currencyFormat.decimalFormat(vendingMachine.getTotalPrice()));
//        for(int j = 0; j < vendingMachine.getProductNameCard().size(); j++){
//
//        }
    }
}
