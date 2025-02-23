import java.util.Scanner;

public class whileLoop {
    public static void main(String[] args) {
        double currentBalance = 25000;
        double limitBalance = currentBalance / 100 * 2;
        System.out.println("You cannot exceed below GMD" +limitBalance);
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your PIN Number: ");
        String pin = input.next();
        if(pin.contains("1234")){
            System.out.println("Welcome To ATM");
                System.out.print("Enter amount");
                double withdrawal = input.nextDouble();
                currentBalance -= withdrawal;
                System.out.println("Withdrawal is successful. \n Have withdrawn GMD" + withdrawal + "\n Your current balance GMD" + currentBalance);
            System.out.println("Enter Y if you want to withdraw again? \nN to cancel");
            if(input.next().equalsIgnoreCase("y")){
                while(currentBalance > limitBalance){
                    System.out.print("Enter amount: ");
                    double secondWithdrawal = input.nextDouble();
                    System.out.println("Your current balance is GMD");
                    currentBalance -= secondWithdrawal;
//                    System.out.println(currentBalance -= secondWithdrawal);
                    //check whether the current balance is not less than 500
                    if(currentBalance <= limitBalance){
                        System.out.println("you cannot proceed with withdrawal");
                        System.out.println("Your current balance is GMD" +currentBalance);
                        break;
                    }
                }
            } else {
                System.out.println("Thanks for Service!");
            }
        } else  {
            System.out.println("Oops! invalid pin");
        }
    }
}
