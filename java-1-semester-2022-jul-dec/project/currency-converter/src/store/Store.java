package store;

import java.util.ArrayList;

public class Store {
    private ArrayList<String> customerNames = new ArrayList<String>();
    private ArrayList<Double> prices = new ArrayList<Double>();

    public ArrayList<String> getCustomerNames() {
        return customerNames;
    }

    public void setCustomerName(String customerNames) {
        this.customerNames.add(customerNames);
    }

    public ArrayList<Double> getPrices() {
        return prices;
    }

    public void setPrices(double prices) {
        this.prices.add(prices);
    }
}
