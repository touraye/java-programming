package PreBanking;

import java.util.InputMismatchException;
import java.util.Scanner;

public class BankTester {
    public static void main(String[] args) {
        System.out.println("====== Welcome To Banking Service ======");
        Scanner in = new Scanner(System.in);
        //helper
        Helpers helpers = new Helpers();

        System.out.println("Saving Account");
        Saving saving = new Saving("ebrima touray","01501144091100",0,"saving account");
        System.out.println("Account Name: " +saving.getAccName());
        System.out.println("Account Number: " +saving.getAccNumber());
        System.out.println("Current Balance: " +helpers.currencyFormat(saving.getCurrentBalance()));
        System.out.println("Account Type: " +saving.getAccType());
        System.out.println("Depositing GMD30,000........");
        saving.deposit(30000);
        System.out.println("New Current Balance: GMD" +helpers.currencyFormat(saving.getCurrentBalance()));

        do {
            try{
                System.out.print("Enter amount to withdraw: ");
                double amount = in.nextDouble();
                if(amount < 200 || amount > 2000){
                    throw new Exception("Warning! Withdrawal is only within (200 and 2,000). Please try again");
                }
                saving.withdraw(amount);
                System.out.println("You have successfully withdrawn GMD" +helpers.currencyFormat(amount));
                System.out.println("Your Current Balance is GMD" +helpers.currencyFormat(saving.getCurrentBalance()));
            } catch (InputMismatchException e){
                in.nextLine();//remove the leftover garbage from the input buffer
                System.out.println("Error! Amount should be only be digits");
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        } while(true);


    }
}
