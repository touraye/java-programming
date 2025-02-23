import java.util.Scanner;

public class SwitchStatement {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter 1 for Buying Qpower\n" +
                "Enter 2 for Checking balance\n" +
                "Enter 3 for registering meter number: ");
        int mark = in.nextInt();
        switch (mark){
            case 1:
                System.out.println("Buying Q-Power");
                break;
            case 2:
                System.out.println("Checking Balance");
                break;
            case 3:
                System.out.println("Registering meter number");
                break;
            default:
                System.out.println("No operation listed!");
        }
    }
}
