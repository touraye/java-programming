package investment;

import java.util.Scanner;

public class TestWithdrawal {
    public static void main(String[] args) {
        //global vars
        Scanner input = new Scanner(System.in);
        double currentBalance = 10000;
        double limit = 300;
        double withdrawal;
        String continueWithdrawal;
        boolean flag = true;
        System.out.println("======= Welcome ATM Service ========");
        System.out.print("Enter you PIN NUMBER: ");
        if(input.next().equalsIgnoreCase("123")){
            System.out.println("Your current balance is GMD" +currentBalance);
            System.out.print("Enter amount: ");
            withdrawal = input.nextDouble();
            double newCurrentBalance = currentBalance - withdrawal;
            if(newCurrentBalance > limit){
                currentBalance = newCurrentBalance;//update the current balance
                System.out.println("Your current balance is GMD" +currentBalance);
                //TODO! let keep asking customer whether they wish to "withdraw again" as long as their "current balance is > limit(300)"
                System.out.println("Press Y if your want to withdraw again and N to cancel");
                if(input.next().equalsIgnoreCase("y")){
                    //continue with withdrawal
                    System.out.print("Enter amount: ");
                    double newBalance = currentBalance - (withdrawal = input.nextDouble());
                    if(newBalance <= limit) {
                        System.out.println("Sorry, your withdrawal is not successful \nYou have exceeded your limit of GMD" +limit);
                        System.out.println("After attempted withdrawal of GMD" +withdrawal+"," +
                                " your current balance is going to be GMD"+(newCurrentBalance));
                    } else {
                        currentBalance = newBalance;//update the current balance
                        System.out.println("Your current balance is GMD" +currentBalance);

                        while(currentBalance > limit){
                            System.out.println("Press Y if your want to withdraw again and N to cancel");
                            if(input.next().equalsIgnoreCase("y")){
                                System.out.print("Enter amount: ");
                                double balance = currentBalance - (withdrawal = input.nextDouble());
                                 currentBalance = balance;// updating current balance
                                System.out.println("Your current balance is GMD" +currentBalance);

                            } else {
                                System.out.println("Thanks for using our service");
                                break;
                            }
                        }
                    }
                } else {
                    //cancel withdrawal
                    System.out.println("Thanks for using our service!");
                }
            } else {
                System.out.println("Sorry, your withdrawal is not successful \nYou have exceeded your limit of GMD" +limit);
                System.out.println("After attempted withdrawal of GMD" +withdrawal+"," +
                        " your current balance is going to be GMD"+(newCurrentBalance));
            }
        } else {
            System.out.println("Invalid PIN NUMBER!");
        }
    }
}
