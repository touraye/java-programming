package java2.assignment.ass2;

public class Tester {
    public static void main(String[] args) {
        Saving saving1 = new Saving("0045GT", "Lamin Bah");

        System.out.println("Numbers of banks: "+Saving.numberOfBanks);
        saving1.accInfo();
        saving1.deposit(1000);

        System.out.println();
        saving1.accInfo();
        System.out.println();

        System.out.println("----------------");
        Saving saving2 = new Saving("0066GT", "Fatou Njie");
        saving2.accInfo();

        // transfer money from acC1 to acc2
        saving1.transfer(saving2, 1500);
        System.out.println();

        saving1.accInfo();
        System.out.println();
        saving2.accInfo();

        Checking accChecking = new Checking("09585", "Mariama Badjie", 5000);

        System.out.println("Numbers of banks: "+Checking.numberOfBanks);
        System.out.println("Number of saving acc: " +Saving.numberOfSavingAcc);

    }
}
