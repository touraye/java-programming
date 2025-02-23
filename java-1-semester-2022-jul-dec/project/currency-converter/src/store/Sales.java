package store;

import javax.swing.*;

public class Sales {
    Store store = new Store();//store object
    double totalPrice = 0;//sum total price for each customer
    double maxPrice = 0;//the maximum price for entire sell

    public void teller(){
        boolean flag = true;
        do {
        String name =  JOptionPane.showInputDialog(null, "Enter customer's name");
            store.setCustomerName(name);
            // keep taking customer prices
            boolean keepEnteringPrice = true;
            while(keepEnteringPrice){
                try {
                    String price =  JOptionPane.showInputDialog(null, "Enter customer's item price");
                    totalPrice += Double.parseDouble(price);

                    int n = JOptionPane.showConfirmDialog(null, "Any more item?\nYes to proceed No or Cancel for next customer");
                    //Yes = 0, No = 1, Cancel = 2
                    if(n == 1 || n == 2){
                        keepEnteringPrice = false;
                        store.setPrices(totalPrice);
                        totalPrice = 0;//reset total price
                    }
                } catch (NullPointerException e){
                    JOptionPane.showMessageDialog(null, "Please input something", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }

            //any more customers
            int moreCustomer = JOptionPane.showConfirmDialog(null, "Do you anymore customer?");
            if(moreCustomer == 1 || moreCustomer == 2){
                flag = false;
            }
        } while (flag);
        getBestCustomer();

    }

    public void getBestCustomer(){
        System.out.println("Customer Name    Price");
        for(int i = 0; i <  store.getCustomerNames().size(); i++){
            System.out.println(store.getCustomerNames().get(i)+ "         " +store.getPrices().get(i));

            //check for max price
            if(store.getPrices().get(i) > maxPrice){
                maxPrice = store.getPrices().get(i);
            }
        }
        //get the position of max price from prices ArrayList
        int indexOfMaxPrice = store.getPrices().indexOf(maxPrice);
        System.out.println("index of max price: " +indexOfMaxPrice);
        System.out.println("Customer name: " +store.getCustomerNames().get(indexOfMaxPrice));
        //pass the name of the customer with and highest price and the price itself
        displayBestCustomer(store.getCustomerNames().get(indexOfMaxPrice), maxPrice);
    }

    public void displayBestCustomer(String customerName, double price){
        JOptionPane.showMessageDialog(null, "****** Congratulation ******\n"+customerName+", you are our best customer\nYou bought total item of GMD"+String.format("%,.2f", price));
    }
}
