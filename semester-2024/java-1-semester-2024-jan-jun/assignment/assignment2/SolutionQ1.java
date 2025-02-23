package java1.assignment.assignment2;

import java.util.Scanner;

public class SolutionQ1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Arithmetic Operation");
        System.out.print("Enter num 1: ");
        int num1 = scan.nextInt();

        System.out.print("Enter num 2: ");
        int num2 = scan.nextInt();

        int addition = num1 + num2;
        int subtraction = num1 - num2;
        int multiplication = num1 * num2;
        int division = num1 / num2;
        int modules = num1 % num2;

        System.out.println(num1+ " + " +num2+ " = " +addition);
    }
}
