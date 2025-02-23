package ifElse;

import java.util.Scanner;

public class Condition {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a value: ");
        int value = input.nextInt();

        if(value > 5){
            System.out.println("Your value is greater than 5 " +value);
        } else if(value == 5) {
            System.out.println("Your value is 5");
        } else {
            System.out.println("Not greater than 5 or equals to 5!");
        }
    }
}
