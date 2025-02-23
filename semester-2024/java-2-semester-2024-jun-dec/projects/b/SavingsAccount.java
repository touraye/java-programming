package java2.projects.b;


import java2.projects.b.utils.Setting;

public class SavingsAccount extends BankAccount {
    private double interestRate;

    public SavingsAccount(String accountNumber, String accountHolderName) {
        super(accountNumber, accountHolderName);
        this.interestRate = new Setting().getSAVING_ACCOUNT_INTEREST_RATE();
    }
    public SavingsAccount(String accountNumber, String accountHolderName, double initialBalance) {
        super(accountNumber, accountHolderName, initialBalance);
        this.interestRate = new Setting().getSAVING_ACCOUNT_INTEREST_RATE();
    }

    public void applyInterest() {
        double interest = balance * interestRate / 100;
        deposit(interest);
        System.out.println("Interest applied: " + interest);
    }
}

