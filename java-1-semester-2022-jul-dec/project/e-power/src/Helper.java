import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Date;

public class Helper {
    double kwh = 0.1;
    double fee = 0;
    double unit = 0;
    DecimalFormat decimalFormat = new DecimalFormat("0.00");
    public String serviceFee(double amount ){
        if ( amount <= 150 ) {
            fee = amount - 3;
            unit = fee * kwh;
            return decimalFormat.format(unit);
        }
        if ( amount <= 350 ) {
            fee = amount - 6;
            unit = fee * kwh;
            return decimalFormat.format(unit);
        }
        if ( amount <= 1000 ) {
            fee = amount - 8;
            unit = fee * kwh;
            return decimalFormat.format(unit);
        }
        if (amount > 1000) {
            fee = amount - 10;
            unit = fee * kwh;
            return decimalFormat.format(unit);
        }
        return null;
    }

    public String currencyFormat(double amount){
        return String.format("%,.2f", amount);
    }

    public String findMeterNumber(String customerName){
        Store store = new Store();
        ArrayList<String> filledCustomers = new ArrayList<String>();
        ArrayList<String> filledMeterNumbers = new ArrayList<String>();
        for(String item : store.getCustomer()){
            filledCustomers.add(item);
        }
        int indexOfCurrentCustomer = filledCustomers.indexOf(customerName);
        System.out.println("Index of current customer: " +indexOfCurrentCustomer);
        for(String meter : store.getMeter()){
            filledMeterNumbers.add(meter);
        }
        String meterNumber = filledMeterNumbers.get(indexOfCurrentCustomer);
        return meterNumber;
    }

    public String formattedDate(){
        Date date = new Date();
        return   (date.getMonth() + 1)+ "/" +date.getDate()+ "/" + date.getYear()+ " " +date.getHours()+ ":" +date.getMinutes()+ ":" +date.getSeconds();
    }
}
