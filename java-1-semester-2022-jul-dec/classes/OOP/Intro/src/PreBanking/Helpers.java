package PreBanking;

public class Helpers {
    //current format
    public String currencyFormat(double amount){
        String format = String.format("%,.2f", amount);
        return format;
    }
}
