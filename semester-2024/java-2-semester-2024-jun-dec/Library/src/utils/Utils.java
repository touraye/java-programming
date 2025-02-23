package java2.Library.src.utils;

import java.util.Random;

public class Utils {
    /**
     * Create unique id for books
     * @return a unique id for each Boo obj with a prefix 'mlb'
     */
    public String bookUuid(){
        Random random = new Random();
        String uniqueId = String.valueOf(random.nextInt((9999 - 100) + 10) + 10);
        return "mlb-" +uniqueId;
    }

    /**
     * Create unique id for each person
     * @return a randomly generated id with a prefix 'mpl'
     */
    public String personUuid(){
        Random random = new Random();
        String uniqueId = String.valueOf(random.nextInt((9999 - 100) + 10) + 10);
        return "mlp-" +uniqueId;
    }
}
