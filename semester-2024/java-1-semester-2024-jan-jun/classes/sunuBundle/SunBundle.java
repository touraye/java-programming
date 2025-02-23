package java1.classes.sunuBundle;

import java.util.Scanner;

public class SunBundle {
    public static void main(String[] args) {
        System.out.println("********** WELCOME TO SUNU BUNDLE **********");

        Scanner in = new Scanner(System.in);

        System.out.print("Enter your choice: ");
        String choice = in.next();

        switch (choice){
            case "1":
                System.out.println("Buy Mega Byte");
                break;
            case "2":
                System.out.println("Buy for others");
                break;
            case "3":
                System.out.println("Pay as you go!");
                break;
            case "4":
                System.out.println("Reactivate Sunu Bundle");
                break;
            case "5":
                System.out.println("Check Balance");
                break;
            case "0":
                System.out.println("Exit!");
            default:
                System.out.println("Invalid MMI Code!");
        }
    }
}
