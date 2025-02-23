public class Bank {
    public static void main(String[] args) {
        double currentBalance = 5000;
        double interest = 15;
        int numberOfYear = 10;
        System.out.println("You Banking App!");
        System.out.println("Your current balance GMD"
                +currentBalance);
        double interestRate = currentBalance / 100 * interest;
        System.out.println("Your interest rate is "
                +interestRate);
        double currentBalanceAfterOneYear = currentBalance + interestRate ;
        double currentBalanceAfterTwoYear = currentBalance + (interestRate * 2);
        double currentBalanceFourYear = currentBalance + (interestRate * numberOfYear);
        System.out.println("Your current balance after one year is GMD" +currentBalanceAfterOneYear);
        System.out.println("Your current balance after two year is GMD" +currentBalanceAfterTwoYear);
        System.out.println("Your current balance after four year is GMD" +currentBalanceFourYear);
    }
}
