import java.util.Scanner;

public class InputAndOutput {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your first name :");
        String lName = input.next();
        System.out.println("Enter your first name :");
        String fName = input.next();
        System.out.println("Enter your status: ");
        boolean isMarriage = input.nextBoolean();


        System.out.println("First name: " +lName);
        System.out.println("Last name: " +fName);
        System.out.println("Marriage status: " +isMarriage);

    }
}
