package java1.classes.revision;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exceptions {
    public static void main(String[] args) {
        /*
            Errors:
            1. Compile time error: Syntax
            2. Runtime error
         */

        String name = "Alieu";
        Scanner in = new Scanner(System.in);
        //System.out.print("Enter your age: ");
        //String data = in.next();


        try {
            String[] cars = new String[3];
            cars[0] = "BMW";
            cars[1] = "Benz";
            cars[2] = "Toyota";
            //cars[3] = "Mazda";
            //int value = in.nextInt();
            //System.out.println("What was entered: " +data);
            //System.out.println("What was entered: " +value);
            System.out.println("Car 1: " +cars[0]);
            System.out.println("Car 2: " +cars[1]);
            System.out.println("Car 3: " +cars[2]);
            System.out.println("Car 4: " +cars[3]);

        } catch (InputMismatchException e){
            System.out.println("Wrong input. Only number values(eg. 1)");
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Accessing element at wrong index!");
        }

    }
}
