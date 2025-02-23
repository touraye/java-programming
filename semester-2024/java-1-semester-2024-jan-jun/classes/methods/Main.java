package java1.classes.methods;

import java.util.Scanner;

public class Main {
    public static int add(int val1, int val2){
        int ans = val1 + val2;
        return  ans;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        /*
            switch statement with different cases for different operations
            such as addition, subtraction, multiplication, division, and modules
            called or invoke respective method into appropriate case, pass into
            your values to be computed. At the end the return value from the invoked
            method should be printed in the console. You have a print statement should be

         */
        System.out.println("*********** Java calculator ***********");
        System.out.println("Type:\n" +
                "+ for addition\n" +
                "- for subtraction\n" +
                "* for multiplication\n" +
                "/ for division\n" +
                "% for modules");
        String option = in.next();
        System.out.print("Enter first value: ");
        int val1 = in.nextInt(); // take first value and store in val1
        System.out.print("Enter second value: ");
        int val2 = in.nextInt(); // take first value and store in val2
        System.out.println();
        switch (option){
            case "+":
                System.out.println("Operation: Addition");
                System.out.println("Values: " +val1+ " + " +val2);
                System.out.println("Ans: " +add(val1, val2));
                break;
            case "-":
                System.out.println("Subtraction");
                break;
            case "*":
                System.out.println("Multiplication");
                break;
            case "/":
                System.out.println("Division");
                break;
            case "%":
                System.out.println("Modules");
                break;
            default:
                System.out.println("Syntax Error");
        }
    }
}
