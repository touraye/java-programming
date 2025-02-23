package classes.lab.lab2;

import java.util.Scanner;

public class Correction {
    public static void main(String[] args) {
        // Create a `scanner` object
        Scanner in = new Scanner(System.in);

        System.out.print("Enter value 1: ");
        int value1 = in.nextInt();
        System.out.print("Enter value 2: ");
        int value2 = in.nextInt();

        // condition
        if(value1 > value2) {
            System.out.println("value1 is greater than value2");
        } else {
            System.out.println("value2 is greater than value1");
        }
    } // end main
}
