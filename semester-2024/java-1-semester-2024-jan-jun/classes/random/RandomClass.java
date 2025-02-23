package classes.random;

import java.util.Random;
import java.util.Scanner;

public class RandomClass {
    public static void main(String[] args) {
        Random ran = new Random();
        Scanner in = new Scanner(System.in);

        while(true){
            System.out.println("Enter 'Y' to print and 'N' to kill");

            String op = in.next();
            if(op.equalsIgnoreCase("y"))
                break;

            // Generate five random four-digit numbers
            int f1 = ran.nextInt(9000) + 1000; // Generates a number between 1000 and 9999
            int f2 = ran.nextInt(9000) + 1000;
            int f3 = ran.nextInt(9000) + 1000;
            int f4 = ran.nextInt(9000) + 1000;
            int f5 = ran.nextInt(9000) + 1000;

            // Concatenate the numbers into a single string
            String token = f1 + " " + f2 + " " + f3 + " " + f4 + " " + f5;

            // Print the token
            System.out.println(token);
        }
    }
}
