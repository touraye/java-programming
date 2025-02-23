package java1.classes.arraylist;

import java.text.NumberFormat;
import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double amount = 30000.0;
        Locale usLocale = new Locale("en", "US");
        NumberFormat usCurrencyFormatter = NumberFormat.getCurrencyInstance(usLocale);
        String usFormattedAmount = usCurrencyFormatter.format(amount);
        System.out.println("Formatted amount (US): " + usFormattedAmount);

        System.out.printf("%,2f", amount);

    }
}
