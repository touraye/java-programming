package java2.projects.b;

import java2.projects.b.utils.InputValidator;
import java2.projects.b.utils.Setting;

public class CheckingAccount extends BankAccount {
    private double overdraftLimit;

    public CheckingAccount(String accountNumber, String accountHolderName) {
        super(accountNumber, accountHolderName);
        this.overdraftLimit = new Setting().getOVER_DRAFT_LIMIT();
    }

    public CheckingAccount(String accountNumber, String accountHolderName, double initialBalance) {
        super(accountNumber, accountHolderName, initialBalance);
        this.overdraftLimit = new Setting().getOVER_DRAFT_LIMIT();
    }

    @Override
    public void withdraw(double amount) {
        if (InputValidator.isPositive(amount) && (balance + overdraftLimit) >= amount) {
            balance -= amount;
            System.out.println("Withdrew: " + amount);
        } else {
            System.out.println("Exceeds overdraft limit or invalid amount.");
        }
    }
}

