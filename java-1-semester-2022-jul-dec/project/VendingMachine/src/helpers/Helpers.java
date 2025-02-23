package helpers;

public class Helpers {
    public String decimalFormat(double price){
        String formatted = String.format("%,.2f", price);
        return formatted;
    }
}
