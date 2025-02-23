package java2.assignment.ass1;

import java.text.DecimalFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Random;
import java.util.Scanner;

public class CashPowerApp {
    public static String tokenGenerator(){
        Random random = new Random();

        int random4Digits1 = random.nextInt(9000) + 1000;
        int random4Digits2 = random.nextInt(9000) + 1000;
        int random4Digits3 = random.nextInt(9000) + 1000;
        int random4Digits4 = random.nextInt(9000) + 1000;
        int random4Digits5 = random.nextInt(9000) + 1000;

        return random4Digits1+ " " +random4Digits2+ " " +random4Digits3+ " " +random4Digits4+ " " +random4Digits5;
    }

    public static String unitFormatter(double unit){
        DecimalFormat decimalFormat = new DecimalFormat("0.00");
        return decimalFormat.format(unit);
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        LocalDateTime currentDate = LocalDateTime.now();
        DateTimeFormatter dateFormatPattern = DateTimeFormatter.ofPattern("MM-dd-yyyy HH:mm:ss");
        DecimalFormat decimalFormat = new DecimalFormat("0.00");

        String formattedDate = currentDate.format(dateFormatPattern);
        String recieptNumber = "202303EIN005386482";
        String meterNumber = "0948842284921";
        String customer = "Lamin Njie";
        String tellerID = "0123";
        final double KWH = 0.1;
        double serviceFee = 1;
        double powerAmount;
        double totalUnits;

        double dailySale = 0;// track daily sales
        boolean flag = true;

        while (flag) {

            System.out.print("Enter Amount: ");
            double amount = input.nextDouble();

            //check for the amount
            if (amount >= 30) {
                powerAmount = amount - serviceFee;
                totalUnits = powerAmount * KWH;

                System.out.println("************** NAWEC **************");
                System.out.println(formattedDate);
                System.out.println("Receipt Number: " + recieptNumber);
                System.out.println("Meter Number: " + meterNumber);
                System.out.println("Customer Name: " + customer.toUpperCase());
                System.out.println("Paid Amount: GMD" + String.format("%,.2f", amount));
                System.out.println("Power Amount: GMD" + String.format("%,.2f", powerAmount));
                System.out.println("Service Fee: GMD" + serviceFee);
                System.out.println("Total Units: " + decimalFormat.format(totalUnits) + "KWH");
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
                System.out.println("Total daily sales GMD" +String.format("%,.2f", dailySale));
                System.out.println("Transaction Date: " +formattedDate);
                System.out.println("Thanks You");
                flag = false;
            }
        }
    }
}