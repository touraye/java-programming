import java.util.ArrayList;

public class Store {
    //store
    ArrayList<String> customerNames = new ArrayList<String>();
    ArrayList<Double> prices = new ArrayList<Double>();

    public void setCustomerNames(String name){
        customerNames.add(name);
    }

    public ArrayList<String> getCustomerNames() {
        return customerNames;
    }

    public void setPrice(double amount){
        prices.add(amount);
    }

    public ArrayList<Double> getPrices() {
        return prices;
    }
}
