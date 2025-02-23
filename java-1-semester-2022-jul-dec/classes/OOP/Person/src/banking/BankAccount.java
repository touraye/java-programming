package banking;

import banking.helpers.currency;
import jdk.swing.interop.SwingInterOpUtils;

import java.util.Scanner;

public class BankAccount {
    private String accountNumber;
    private String accountName;
    private String accountType;
    private double accountBalance;

    //set account number
    public void setAccountNumber(String accountNumber){
        this.accountNumber = accountNumber;
    }

    //get account number
    public String getAccountNumber(){
        return this.accountNumber;
    }

    //set account name
    public void setAccountName(String accountName){
        this.accountName = accountName;
    }

    //get account name
    public String getAccountName(){
        return this.accountName;
    }

    //set account name
    public void setAccountType(String accountType){
        this.accountType = accountType;
    }

    //get account type
    public String getAccountType(){
        return this.accountType;
    }

    //set account name
    public void setAccountBalance(long accountBalance){
        this.accountBalance = accountBalance;
    }

    //get account balance
    public double getAccountBalance(){
        return this.accountBalance;
    }

    //deposit
    public void deposit(double amount){
        // this.accountBalance -= amount
        this.accountBalance = this.accountBalance + amount;
    }

    //withdraw
    public void withdraw(double amount){
        // this.accountBalance -= amount
        this.accountBalance = this.accountBalance - amount;
    }

    //confirm action
    public void confirm(){
        Scanner in = new Scanner(System.in);
        System.out.println("CHOOSE THE WHAT YOU WISH TO CARRY OUT!");
        System.out.println("A - Balance Enquiry \nB - Deposit\nC - Withdrawal");
        String option = in.next();
        switch (option){
            case "a":
                System.out.println("Your current balance " +getAccountBalance());
                break;
            case "b":
                System.out.print("How much do wish to deposit: ");
                double amount = in.nextDouble();
                this.deposit(amount);
                System.out.println("You have successfully deposited: GMD" +String.format("%,.2f", amount));
                System.out.println("Your current balance is GMD" +String.format("%,.2f", this.getAccountBalance()));
                break;
            case "c":
                System.out.print("How much do wish to withdraw: ");
                double withdrawalAmount = in.nextDouble();
                this.withdraw(withdrawalAmount);
                System.out.println("You have successfully withdrawn: GMD" +String.format("%,.2f", withdrawalAmount));
                System.out.println("Your current balance is GMD" +String.format("%,.2f", this.getAccountBalance()));
                break;
        }
    }
}
