package java1.classes.Exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exceptions {
    public static void main(String[] args) {
        //
        Scanner in = new Scanner(System.in);

        try {
            System.out.println("Enter your age: ");
            //String name = in.next();
            int age = in.nextInt();
            System.out.println("Age: " +age);

        } catch (InputMismatchException e){
            System.out.println("Wrong data type");
        }
    }
}
