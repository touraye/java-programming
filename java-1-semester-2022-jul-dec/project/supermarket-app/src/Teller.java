import javax.swing.*;

public class Teller {
    Store store = new Store();
    double totalPrice = 0;
    double maximumPrice = 0;

    public void teller(){
        //Todo keep taking customer name
        boolean flag = true;
        do {
            String customerName = JOptionPane.showInputDialog(null,
                    "Enter Customer Name");

            //check if the customer is provided
            if(customerName.isEmpty()){
                JOptionPane.showMessageDialog(null, "Oops! Customer name cannot be empty");
            } else {
                store.setCustomerNames(customerName);
                //let take prices
                boolean isMoreItem = true;
                while(isMoreItem){
                    String price = JOptionPane.showInputDialog(null, "Enter item price:");

                    //check if the customer is provided
                    if(price.isEmpty()){
                        JOptionPane.showMessageDialog(null, "Oops! Please item price");
                    } else {
                        try {
                            double currentItemPrice = Double.parseDouble(price);
                            totalPrice = totalPrice + currentItemPrice;
                            System.out.println("Total price " +totalPrice);
                        } catch (NullPointerException e){
                            JOptionPane.showMessageDialog(null, "Cannot be empty");
                        }
                        catch (NumberFormatException e){
                            JOptionPane.showMessageDialog(null, "Wrong input. Only numbers");
                        }

                        int check = JOptionPane.showConfirmDialog(null, "Are you done?\nYes to terminate\n 'No' or 'Cancel' to continue");
                        if(check == 0){
                            isMoreItem = false;
                            store.setPrice(totalPrice);//adding total price to our Store prices ArrayList
                            totalPrice = 0;//reset total price 0
                        }

                    }
                }
            }

            //confirm
            int confirm = JOptionPane.showConfirmDialog(null,"Do you have any more customer\nClick on 'Yes' to proceed\nClick on 'No' or 'Cancel' to stop");
            System.out.println("confirm " +confirm);
            if(confirm == 1 || confirm == 2){
                flag = false;
            }
        } while(flag);

        getBestCustomer();
    }

    private void getBestCustomer(){
        System.out.println("Customer Name               Total Prices" );
        for(int i = 0; i < store.getPrices().size(); i++){
            System.out.println(store.getCustomerNames().get(i)      +"               "+         currencyFormat(store.getPrices().get(i)));

            if(store.getPrices().get(i) > maximumPrice){
                maximumPrice = store.getPrices().get(i);
            }
        }

        System.out.println("Highest price " +maximumPrice);
        int indexOfTheHighestPrice = store.getPrices().indexOf(maximumPrice);
        System.out.println("index of max price " +currencyFormat(indexOfTheHighestPrice));
        String bestCustomerName = store.getCustomerNames().get(indexOfTheHighestPrice);
        System.out.println("best customer " +bestCustomerName);
        displayTheBestCustomer(bestCustomerName, maximumPrice);
    }

    //display the best customer of the day
    public void displayTheBestCustomer(String customerName, double maximumPrice){
        JOptionPane.showMessageDialog(null,
                "******* Congratulation *********\n" +
                        "Dear "+customerName+ ", you are our best customer of the day\n" +
                        "You bought total of GMD" +maximumPrice);
    }

    public String currencyFormat(double amount){
        return String.format("%,.2f", amount);
    }
}
