package banking;

import java.util.Scanner;

public class BankAccount {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String deposit = "a";
        String withdrawal = "b";
        double balance = 4000;
        System.out.println("==== Welcome to GT Bank ====");
        System.out.println("Which service would you like carry out?");
        System.out.println("Press A to deposit: ");
        System.out.println("Press B to withdraw: ");
        String data = input.next();
        if(deposit.equalsIgnoreCase(data)){
            double newBalance = balance + 3000;
            balance = newBalance;
            System.out.println("Deposit Successful! your new balance is GMD" +balance);
        } else if (withdrawal.equalsIgnoreCase(data)){
            double newBalance = balance - 3000;
            balance = newBalance;
            System.out.println("Withdrawal Successful! your new balance is GMD" +balance);
        } else {
            System.out.println("You do not select the right option:");
            System.out.println("Press A to deposit");
            System.out.println("Press B to withdraw");
            System.out.println("Please try it again!");
        }

    }
}
