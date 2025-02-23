package investment;

import java.util.Scanner;

public class Accounting {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("===== Welcome to Standard Chartered Bank ATM Service =====");
        boolean exceeded = false;
        double currentBalance = 10000;
        double limit = 300;
        System.out.println("Your current balance is GMD" +currentBalance);
        while(!exceeded){
            System.out.print("Enter amount: ");
            double amount = in.nextDouble();

            double newBalance = currentBalance - amount;
            if(newBalance <= limit) {
                exceeded = true;
                System.out.println("You have exceed your limit!");
                System.out.println("You cannot have a balance of < 300. You're trying to withdraw GMD" +amount+
                        "\n" +amount+ " - your balance of GMD" +currentBalance+ " will be GMD" +(currentBalance - amount)  );
            } else {
                currentBalance = currentBalance - amount;
                System.out.println("Withdrawal successful. You have withdrawn GMD" +amount);
            }
            System.out.println("Your current balance is GMD" +currentBalance);
        }
    }

    public double calculateLimit(double limit){
        return 0;
    }
}