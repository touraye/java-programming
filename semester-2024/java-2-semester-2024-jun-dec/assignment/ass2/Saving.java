package java2.assignment.ass2;

public class Saving extends Bank{
    static int numberOfSavingAcc;
    Saving(String accNumber, String accName){
         super(accNumber, accName, 0);

         numberOfSavingAcc += 1;
    }

    // print acc info
    void accInfo(){
        System.out.println("SAVING ACC INFO");
        System.out.println("ACC Number: " +this.getAccNumber());
        System.out.println("ACC Name: " +this.getAccName());
        System.out.println("Current Balance GMD: " +this.getBalance());
        System.out.println();
    }

    @Override
    double checkBalance() {
        return this.getBalance();
    }

    @Override
    void deposit(double amount) {
        // check for minimum amount
        if(amount < 200){
            System.out.println("Cannot proceed with deposit");
        } else {
            this.setBalance(amount);
        }
    }

    @Override
    boolean withdrawal(double amount) {
        // balance cannot be 0 or negative
        if(this.getBalance() - amount < 0) {
            System.out.println("Cannot proceed with withdrawal");
            return false;
        }

        double newBalance = this.getBalance() - amount;
        this.setBalance(newBalance);
        System.out.println("Account update successfully, your new balance is GMD" +this.getBalance());
        return true;
    }

    @Override
    boolean transfer(Bank receiver, double amount) {
        /*
        To be able to transfer:
        a sender id is needed as well as the recipient id
        For our case, all we need is sender's and receivers obj
         */
        if(!this.withdrawal(amount)){
            System.out.println("Cannot proceed with transfer");
            return false;
        }

        receiver.deposit(amount);
        return true;
         //return !this.withdrawal(amount) ? receiver.deposit(amount) : false;
    }
}
