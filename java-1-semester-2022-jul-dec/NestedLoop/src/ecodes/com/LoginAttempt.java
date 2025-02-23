package ecodes.com;

import java.util.Scanner;

public class LoginAttempt {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("=== Welcome | Login or Register ");
        String username = "sula";
        String password = "123";

        int counter = 0;
        do {
            System.out.println("Enter username ");
            username = in.nextLine();
            System.out.println("Enter password ");
            password = in.nextLine();
            counter++;
            if (username.contains("sula") && password.contains("123")) {
                System.out.println("Hey, " + username);
                break;
            } else {
                System.out.println("Wrong credentials");
                System.out.println("you are left with " + counter + " out of 3 attempt");
            }
        } while(counter < 3);

    }
}
