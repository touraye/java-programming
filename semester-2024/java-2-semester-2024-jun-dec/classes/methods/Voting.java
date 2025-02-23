package java2.classes.methods;

import java.util.Scanner;

public class Voting {
    // Take from users
    // Check the age whether they are eligible to vote or not
    // tell the user the error
    // continues with voting
    public static boolean canVote(int age){
        if(age < 18){
            // you are not eligible to vote
            return false;
        } else {
            // you are eligible to vote
            return true;
        }
    }

    public static void print(boolean vote){
        System.out.println(vote ? "yes you can vote" : "no you cannot vote");
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Welcome to our voting app!");
        System.out.print("Enter your age: ");
        int age = in.nextInt();
        print(canVote(age));
        // call the method and pass in the value(argument)



        /*
         a()
         b()

         a(b())
         */

    }
}
