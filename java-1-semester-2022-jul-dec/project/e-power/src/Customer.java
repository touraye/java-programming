import javax.swing.*;
import java.util.ArrayList;

public class Customer {
    private ArrayList<String> customerNames = new ArrayList<String>();
    private ArrayList<String> meterNumbers = new ArrayList<String>();

    Sales sales = new Sales();

    //Add customers to customer name list
    public void setCustomerName(String name){
        customerNames.add(name);
    }

    // return the customer name list to the caller of this method
    public ArrayList getCustomerNames(){
        return customerNames;
    }

    //Add meter number to meter number list
    public void setMeterNumber(String meterNumber){
        meterNumbers.add(meterNumber);
    }

    // return the meter number list to the caller of this method
    public ArrayList getMeterNumbers(){
        return meterNumbers;
    }


    // vending
    public void vending(String[] customers){
        String currentCustomer;
        boolean flag = true;
        JOptionPane.showMessageDialog(null, "E's Power\nBuy cash power at your comfort");
        while(flag){

            try {
                String selectedCustomer = (String)JOptionPane.showInputDialog(
                        null,
                        "Select a customer:",
                        "Choice Customer",
                        JOptionPane.PLAIN_MESSAGE,
                        null,
                        customers,
                        customers[0]);
                System.out.println(selectedCustomer.length() > 0 ? "Selected "+selectedCustomer : "No selected");
                currentCustomer = selectedCustomer;//set the current customer to the selected customer
                String amount = JOptionPane.showInputDialog(null, "Buying Cash Power for: " +currentCustomer+ "\n" +
                        "Enter Amount: ");
                System.out.println("Amount: " +amount);
                int minimumSale = 50;
                if(amount.isEmpty()){
                    JOptionPane.showMessageDialog(null, "Amount is required" , "Error!",JOptionPane.ERROR_MESSAGE);
                } else if(Double.parseDouble(amount) < minimumSale){
                    JOptionPane.showMessageDialog(null, "Sales start at GMD50 and above" , "Error!",JOptionPane.ERROR_MESSAGE);
                } else {
                    sales.sale(Double.parseDouble(amount), currentCustomer);
                }
            } catch (NullPointerException e){
                int quit = JOptionPane.showConfirmDialog(null, "Do you want to quit?\n" +
                        "Yes to quit\nOther to proceed");

                if(quit == 0){
                    flag = false;
                    System.exit(0);//kill the app!
                } else {
                    JOptionPane.showMessageDialog(null, "Please select a customer" , "Error!",JOptionPane.ERROR_MESSAGE);
                }

            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Wrong input! only number." , "Error!",JOptionPane.ERROR_MESSAGE);
            }

        }
    }
}
