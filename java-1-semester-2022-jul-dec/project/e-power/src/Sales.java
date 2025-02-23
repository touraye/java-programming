import javax.swing.*;
import java.util.ArrayList;
import java.util.Date;

public class Sales {
    private final double below150 = 3;
    private final double below350 = 6;
    private final double below1000 = 8;
    private final double moreThan1000 = 10;
    double powerMoney = 0;
    double unit;

    Store store = new Store();
    Helper helper = new Helper();

    public void sale(double amount, String currentCustomer){
        String meterNumber = helper.findMeterNumber(currentCustomer);
        String formatDate = helper.formattedDate();

        //make sales base on amount
        if(amount <= 150){
            powerMoney = amount - below150;
            double unit = Double.parseDouble(helper.serviceFee(amount));
            System.out.println("Meter number: " +meterNumber+"'\nService Fee: GMD" +below150+ "\nPower Amount GMD" +(amount - below150)+ "\nUnits: 4.6kwh");
//            System.out.println("Token: " +store.generateToken());
            JOptionPane.showMessageDialog(null,
                    "Meter number: " +meterNumber+"\n" +
                            "Customer Name: " +currentCustomer+ "\n" +
                            "Date: " +formatDate+ "\n" +
                            "Service Fee: GMD" +helper.currencyFormat(below150)+ "\n" +
                            "Power Amount GMD" +helper.currencyFormat(amount - below150)+ "\n" +
                            "Token: " +store.generateToken()+ "\n" +
                            "Units: " +unit+ " kwh");
        } else if(amount <= 350){
            powerMoney = amount - below350;
            double unit = Double.parseDouble(helper.serviceFee(amount));
            JOptionPane.showMessageDialog(null,
                    "Meter number: " +meterNumber+"\n" +
                            "Customer Name: " +currentCustomer+ "\n" +
                            "Date: " +formatDate+ "\n" +
                            "Service Fee: GMD" +helper.currencyFormat(below350)+ "\n" +
                            "Power Amount GMD" +helper.currencyFormat(amount - below350)+ "\n" +
                            "Token: " +store.generateToken()+ "\n" +
                            "Units: " +unit+ " kwh");
        } else if(amount <= 1000){
            powerMoney = amount - below1000;
            double unit = Double.parseDouble(helper.serviceFee(amount));
            JOptionPane.showMessageDialog(null,
                    "Meter number: " +meterNumber+"\n" +
                            "Customer Name: " +currentCustomer+ "\n" +
                            "Date: " +formatDate+ "\n" +
                            "Service Fee: GMD" +helper.currencyFormat(below1000)+ "\n" +
                            "Power Amount: GMD" +helper.currencyFormat(amount - below1000)+ "\n" +
                            "Token: " +store.generateToken()+ "\n" +
                            "Units: " +unit+ " kwh");
        } else {
            powerMoney = amount - moreThan1000;
            double unit = Double.parseDouble(helper.serviceFee(amount));
            JOptionPane.showMessageDialog(null,
                    "Meter number: " +meterNumber+"\n" +
                            "Customer Name: " +currentCustomer+ "\n" +
                            "Date: " +formatDate+ "\n" +
                            "Service Fee: GMD" +helper.currencyFormat(moreThan1000)+ "\n" +
                            "Power Amount GMD" +helper.currencyFormat(amount - moreThan1000)+ "\n" +
                            "Token: " +store.generateToken()+ "\n" +
                            "Units: " +unit+ " kwh");
        }
    }
}
