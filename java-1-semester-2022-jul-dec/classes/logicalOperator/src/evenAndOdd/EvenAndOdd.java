package evenAndOdd;

import java.util.Scanner;

public class EvenAndOdd {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
//        int value1, value2;
        System.out.println("Enter first value ");
        int value1 = input.nextInt();
        System.out.println("Enter second value ");
        int value2 = input.nextInt();

        /*
            Even numbers are any number which when divided by 2 remainder is 0
            Odd numbers are any number which when divided by 2 remainder is more than 0
         */
        if(value1 % 2 <= 0){
            System.out.println(value1+ " is Even number");
        }
        if(value2 % 2 > 0) {
            System.out.println(value2+ " is an Odd number");
        }
    }
}
