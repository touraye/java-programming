package java2.projects;

import java.text.DecimalFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Random;
import java.util.Scanner;

public class CashPowerApp {
    /**
     *
     * @return
     */
    public static String tokenGenerator(){
        Random random = new Random();

        int random4Digits1 = random.nextInt(9000) + 1000;
        int random4Digits2 = random.nextInt(9000) + 1000;
        int random4Digits3 = random.nextInt(9000) + 1000;
        int random4Digits4 = random.nextInt(9000) + 1000;
        int random4Digits5 = random.nextInt(9000) + 1000;

        return random4Digits1+ " " +random4Digits2+ " " +random4Digits3+ " " +random4Digits4+ " " +random4Digits5;
    }

    /**
     *
     * @param unit
     * @return
     */
    public static String unitFormatter(double unit){
        DecimalFormat decimalFormat = new DecimalFormat("0.00");
        return decimalFormat.format(unit);
    }

    /***
     *
     * @param amount
     * @return
     */
    public static String currencyFormatter(double amount){
        return String.format("%,.2f", amount);
    }

    /***
     *
     * @param amount
     * @param kilowatt
     * @param serviceFee
     * @return
     */
    public static double calculatePowerUnit(double amount, double kilowatt, double serviceFee){
        return (amount - serviceFee) * kilowatt;
    }

    /***
     * 
     * @return
     */
    public static String dateFormatter(){
        LocalDateTime currentDate = LocalDateTime.now();
        DateTimeFormatter dateFormatPattern = DateTimeFormatter.ofPattern("MM-dd-yyyy HH:mm:ss");
        return currentDate.format(dateFormatPattern);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        LocalDateTime currentDate = LocalDateTime.now();
        DateTimeFormatter dateFormatPattern = DateTimeFormatter.ofPattern("MM-dd-yyyy HH:mm:ss");

        String recieptNumber = "202303EIN005386482";
        String meterNumber = "0948842284921";
        String customer = "Lamin Njie";
        String tellerID = "0123";
        final double KWH = 0.1;
        double serviceFee = 1;

        double dailySale = 0;
        boolean flag = true;

        while (flag) {

            System.out.print("Enter Amount: ");
            double amount = input.nextDouble();

            //check for the amount
            if (amount >= 30) {

                System.out.println("************** NAWEC **************");
                System.out.println(dateFormatter());
                System.out.println("Receipt Number: " + recieptNumber);
                System.out.println("Meter Number: " + meterNumber);
                System.out.println("Customer Name: " + customer.toUpperCase());
                System.out.println("Paid Amount: GMD" + currencyFormatter(amount));
                System.out.println("Power Amount: GMD" + currencyFormatter(amount));
                System.out.println("Service Fee: GMD" + serviceFee);
                System.out.println("Total Units: " + unitFormatter(calculatePowerUnit(amount, KWH, serviceFee)) + "KWH");
                System.out.println("----------------------------------");
                System.out.println("\t\tToken Number \n \t" + tokenGenerator());
                System.out.println("---------------------------------");
                System.out.println("Teller ID: " + tellerID);
                System.out.println("Teller: LAMIN DIBBA");
            } else {
                System.out.println("The minimum amount to purchase cash power is GMD30.00");
            }

            dailySale += amount;// updating the dailySale with every amount entered by the user
            System.out.println();
            System.out.println("It is end of the Day? \nType 'y' for Yes to terminate the App\nType 'n' for No to continue Selling cash power");
            String endOfTheDay = input.next();

            if(endOfTheDay.equals("y")){
                System.out.println("Total daily sales GMD" +currencyFormatter(dailySale));
                System.out.println("Transaction Date: " +dateFormatter());
                System.out.println("Thanks You");
                flag = false;
            }
        }
    }
}
