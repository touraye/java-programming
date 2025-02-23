package java1.classes.ifAndElse;

import java.util.Scanner;

public class Login {
    public static void main(String[] args) {
        String username = "username101";
        String password = "1234";
        int counter = 0;

        // compare username stored against what is type
        Scanner obj = new Scanner(System.in);

        while(counter < 3){ // give user 3 trials
            System.out.print("Enter username: ");
            String uName = obj.next();
            System.out.print("Enter password: ");
            String uPass = obj.next();

            if(uName.equals(username) && uPass.equals(password)){
                System.out.println("Welcome, " +username);
                break;
            }

            System.out.println();// line
            System.out.println("Wrong credentials!");
            counter++; // update counter
            // inform the user how many rounds left for the user
            System.out.println("You have " +(3 - counter)+ " more trails");
            System.out.println();// line
        } // end while

        System.out.println( counter == 3 ? "Account block.... Try it after 1 minute" : "");
    }
}
