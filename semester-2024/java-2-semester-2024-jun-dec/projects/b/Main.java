package java2.projects.b;

public class Main {
    public static void main(String[] args) {
        BankAccount acc = new BankAccount("4558976543", "Lang Faye");

        AccountManager accMgt = new AccountManager();
        accMgt.addAccount(acc);
        accMgt.displayAccountDetails(acc.getAccountNumber());
        accMgt.depositToAccount(acc.getAccountNumber(), 3500);
        accMgt.displayAccountDetails(acc.getAccountNumber());


    }
}
