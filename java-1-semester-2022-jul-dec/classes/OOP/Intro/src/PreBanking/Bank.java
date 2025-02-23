package PreBanking;

import java.util.InputMismatchException;

public class Bank {
    private String accName;
    private String accNumber;
    private double currentBalance;

    public Bank(String _accName, String _accNumber, double _currentBalance){
        this.accName = _accName;
        this.accNumber = _accNumber;
        this.currentBalance = _currentBalance;
    }

    public String getAccName(){
        return this.accName;
    }

    public String getAccNumber(){
        return this.accNumber;
    }

    public double getCurrentBalance(){
        return this.currentBalance;
    }

    //deposit method
    public void deposit(double amount){
        double newBalance = this.currentBalance + amount;
        this.currentBalance = newBalance;
    }

    //withdrawal method
    public void withdraw(double amount){
        double newBalance = this.currentBalance - amount;
        this.currentBalance = newBalance;
    }
}
