package java2.assignment.ass2;

abstract public class Bank {
    private String accNumber;
    private String accName;
    private double balance;
    static int numberOfBanks = 0;

    public Bank(String accNumber, String accName, double balance) {
        this.accNumber = accNumber;
        this.accName = accName;
        this.balance = balance;

        numberOfBanks += 1;
    }

    public String getAccNumber() {
        return accNumber;
    }

    public String getAccName() {
        return accName;
    }

    public double getBalance() {
        return this.balance;
    }

    public  void setBalance(double amount){
        this.balance = amount;
    }

    abstract double checkBalance();
    abstract void deposit(double amount);
    abstract boolean withdrawal(double amount);
    abstract boolean transfer(Bank receiver, double amount);
}
