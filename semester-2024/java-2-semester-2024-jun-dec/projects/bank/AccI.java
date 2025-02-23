package java2.projects.bank;

public interface AccI {
    boolean openingAcc();
    boolean closingAcc();
    void checking();
    boolean deposit(double amount);
    boolean withdrawal(double amount);
//    boolean transfer(BankAcc beneficial, double amount);
}
