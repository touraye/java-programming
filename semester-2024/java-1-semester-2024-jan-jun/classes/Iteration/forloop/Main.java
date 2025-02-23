package java1.classes.Iteration.forloop;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String username = "username101";
        String password = "1234";
        int count = 1;

        // compare username stored against what is type
        Scanner obj = new Scanner(System.in);

        //
        for(int i = 1; i <= 3; i++){
            System.out.print("Enter username: ");
            String uName = obj.next();
            System.out.print("Enter password: ");
            String uPass = obj.next();


            if(uName.equals(username) && uPass.equals(password)){
                System.out.println("Welcome, " +username);
                break;
            } else {
                System.out.println("Wrong credential");

                // print count
                System.out.println("You have " +(3 - count)+ " more chance before your account is block!");
                count = count + 1;
            } // end if
        } // end for

//        if(count >= 3){
//            System.out.println("Your card is block!");
//        }

        // ternary operator condition something or do something
        System.out.println(count >= 3 ? "Your card is block!" : "Proceed transaction");




    } // end main
}
