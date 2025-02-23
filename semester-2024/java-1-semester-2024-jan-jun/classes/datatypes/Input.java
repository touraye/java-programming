package classes.datatypes;

import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter message");
        String message = input.next();
        System.out.println("Message: "+message);
        System.out.println("Enter age");
        int age = input.nextInt();
        System.out.println("Age: "+age);

    }
}
