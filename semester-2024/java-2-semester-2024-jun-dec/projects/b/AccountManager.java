package java2.projects.b;

import java2.projects.b.utils.InputValidator;

import java.util.HashMap;
import java.util.Map;

public class AccountManager {
    private Map<String, BankAccount> accounts = new HashMap<>();

    public void addAccount(BankAccount account) {
        accounts.put(account.getAccountNumber(), account);
    }

    public void depositToAccount(String accountNumber, double amount) {
        BankAccount account = accounts.get(accountNumber);
        if (account != null) {
            account.deposit(amount);
        } else {
            System.out.println("Account not found.");
        }
    }

    public void withdrawFromAccount(String accountNumber, double amount) {
        BankAccount account = accounts.get(accountNumber);
        if (account != null) {
            account.withdraw(amount);
        } else {
            System.out.println("Account not found.");
        }
    }

    public void transferFunds(String fromAccount, String toAccount, double amount) {
        BankAccount sourceAccount = accounts.get(fromAccount);
        BankAccount destinationAccount = accounts.get(toAccount);

        if (sourceAccount != null && destinationAccount != null) {
            if (InputValidator.isPositive(amount) && sourceAccount.getBalance() >= amount) {
                sourceAccount.withdraw(amount);
                destinationAccount.deposit(amount);
                System.out.println("Transferred " + amount + " from " + fromAccount + " to " + toAccount);
            } else {
                System.out.println("Insufficient funds for transfer.");
            }
        } else {
            System.out.println("One or both accounts not found.");
        }
    }

    public void displayAccountDetails(String accountNumber) {
        BankAccount account = accounts.get(accountNumber);
        if (account != null) {
            System.out.println("Account Number: " + account.getAccountNumber());
            System.out.println("Account Holder: " + account.getAccountHolderName());
            System.out.println("Balance: " + account.getBalance());
        } else {
            System.out.println("Account not found.");
        }
    }
}

