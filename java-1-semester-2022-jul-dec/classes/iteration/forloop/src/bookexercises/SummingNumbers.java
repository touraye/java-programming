package bookexercises;

import java.util.Scanner;

public class SummingNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double total = 0;
        System.out.print("Enter integer value: ");
        while (input.hasNextDouble()){
            System.out.print("Enter integer value: ");
            double num = input.nextDouble();
            total += num;
        }
        System.out.println("Total: " +total);
    }
}
