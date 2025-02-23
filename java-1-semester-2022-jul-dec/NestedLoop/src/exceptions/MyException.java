package exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MyException {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        boolean flag = true;

        while(flag){

            try {
                System.out.print("Enter your age:  ");
                int age = in.nextInt();
                System.out.println("Your age is " +age);
                if(age > 100){
                    throw new Exception("Age cannot be more than 100");
                }
            } catch (InputMismatchException e){
                in.nextLine();//remove the leftover garbage from the input buffer
                System.out.println("Invalid input. Please try digits only");
            } catch (Exception e) {
                System.out.println("Error: "+ e.getMessage());
            }
        }
    }

    public static int inputAge(String age){
        return 0;
    }
}
