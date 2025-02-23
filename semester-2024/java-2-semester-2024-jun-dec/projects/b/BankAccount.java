package java2.projects.b;

import java2.projects.b.utils.InputValidator;

public class BankAccount {
    private String accountNumber;
    private String accountHolderName;
    protected double balance;

    public BankAccount(String accountNumber, String accountHolderName) {
        if (!InputValidator.isValidAccountNumber(accountNumber) || !InputValidator.isValidName(accountHolderName)) {
            throw new IllegalArgumentException("Invalid account number or account holder name.");
        }

        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = 0;
    }
    public BankAccount(String accountNumber, String accountHolderName, double initialBalance) {
        if (!InputValidator.isValidAccountNumber(accountNumber) || !InputValidator.isValidName(accountHolderName)) {
            throw new IllegalArgumentException("Invalid account number or account holder name.");
        }

        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = InputValidator.isPositive(initialBalance) ? initialBalance : 0;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        if (InputValidator.isPositive(amount)) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }

    public void withdraw(double amount) {
        if (InputValidator.isPositive(amount) && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrew: " + amount);
        } else {
            System.out.println("Insufficient balance or invalid amount.");
        }
    }
}

