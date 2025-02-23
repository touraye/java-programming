package banking;

import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {
        BankAccount mrSanneh = new BankAccount();
        mrSanneh.setAccountNumber("01400087328440");
        mrSanneh.setAccountName("MR. Sanneh");
        mrSanneh.setAccountType("saving");
        mrSanneh.setAccountBalance(0);

        System.out.println("Account Number: " +mrSanneh.getAccountNumber());
        System.out.println("Account Name: " +mrSanneh.getAccountName());
        System.out.println("Account Type: " +mrSanneh.getAccountType());
        System.out.println("Account Balance: GMD" +String.format("%,.2f", mrSanneh.getAccountBalance()));

        Scanner in = new Scanner(System.in);
        boolean flag = true;

        do {
            System.out.print("Type q to Quite or any character to continue using the App:...");
            String check = in.next();
            if(check.equalsIgnoreCase("q")){
                System.out.println("Thank for using our service!");
                flag = false;
                break;
            }
            mrSanneh.confirm();
        } while(flag);

    }
}
