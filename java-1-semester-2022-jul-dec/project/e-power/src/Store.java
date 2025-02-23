import java.util.ArrayList;
import java.util.Random;

public class Store {
   public String[] customer = {
            "Modou Mbye",
            "Fanta Jobe",
            "Haddy Jammeh",
            "Peter Mendy",
            "Yahya Badjie"
    };

   public String[] meter = {
            "092001",
            "092002",
            "092003",
            "092004",
            "092005"
    };

   ArrayList<String> token = new ArrayList<String>();


    public String[] getCustomer() {
        return customer;
    }

    public String[] getMeter() {
        return meter;
    }

    public String generateToken(){
        Random rand = new Random();
        int f1 =  rand.nextInt((9999 - 100) + 1) + 10;
        int f2 =  rand.nextInt((9999 - 100) + 1) + 10;
        int f3 =  rand.nextInt((9999 - 100) + 1) + 10;
        int f4 =  rand.nextInt((9999 - 100) + 1) + 10;
        int f5 =  rand.nextInt((9999 - 100) + 1) + 10;
        final int digits = 4;
        String token = f1+ " " +f2+ " " +f3+ " " +f4+ " " +f5;
        return token;
    }
}
