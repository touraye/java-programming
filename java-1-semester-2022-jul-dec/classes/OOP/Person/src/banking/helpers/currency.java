package banking.helpers;

public class currency {
    public String decimalFormat(String amount){
        System.out.println("amount " +amount);
        String format = String.format("%,.2f", amount);
        return format;
    }
}
