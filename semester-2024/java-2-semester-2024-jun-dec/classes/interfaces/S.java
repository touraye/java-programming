package java2.classes.interfaces;

public class S extends Bank implements Custom{

    public S(String accName, String accNumber) {
        super(accName, accNumber);
    }


    @Override
    public double deposit(double amount) {
        return 0;
    }

    @Override
    public boolean withdrawal(double total) {
        return false;
    }
}
