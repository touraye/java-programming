package java2.assignment.ass2;

public class Checking extends Bank{
    public Checking(String accNumber, String accName, double balance) {
        super(accNumber, accName, balance);
    }

    @Override
    double checkBalance() {
        return 0;
    }

    @Override
    void deposit(double amount) {

    }

    @Override
    boolean withdrawal(double amount) {
        return false;
    }

    @Override
    boolean transfer(Bank receiver, double amount) {
        return false;
    }
}
