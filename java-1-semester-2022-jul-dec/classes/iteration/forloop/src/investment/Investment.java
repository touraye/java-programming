package investment;

public class Investment {
    public static void main(String[] args) {
        double currentBalance = 10000;
        double expectedBalance = 20000;
        int interestRate = 5;
        int countYear = 0;
        System.out.println("Initial balance is GMD" +currentBalance);
        System.out.println("Let's keep calculating interest of 5% and adding it to the current" +
                "balance every year");
        while(currentBalance <= expectedBalance){
            double interestPerYear = (currentBalance / 100) * interestRate;
            currentBalance += interestPerYear;
            countYear++;
        }
        System.out.println(" It takes " +countYear+ " years for bank acc with GMD10,000 to earn GMD" +expectedBalance+ " with interest rate of " +interestRate+ "%");
    }
}
