package java2.classes.interfaces;

public class Bank{
    private String accName;
    private String accNumber;
    private double currentBalance;

    public Bank(String accName, String accNumber) {
        this.accName = accName;
        this.accNumber = accNumber;
        this.currentBalance = 0;
    }

    public String getAccName() {
        return accName;
    }

    public void setAccName(String accName) {
        this.accName = accName;
    }

    public String getAccNumber() {
        return accNumber;
    }

    public void setAccNumber(String accNumber) {
        this.accNumber = accNumber;
    }

    public double getCurrentBalance() {
        return currentBalance;
    }

    public void setCurrentBalance(double currentBalance) {
        this.currentBalance = currentBalance;
    }
}
