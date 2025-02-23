package utg.input;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter firs number :");
        int firstNumber = in.nextInt();

        System.out.print("Enter firs number :");
        int secondNumber = in.nextInt();

        computeSum(firstNumber, secondNumber);
        computeDifference(firstNumber, secondNumber);
        computeProduct(firstNumber, secondNumber);
        computeAverage(firstNumber, secondNumber);
        computeDistance(firstNumber, secondNumber);
        computeMaxAndMin(firstNumber, secondNumber);


    }

    public static void  computeSum(int val1, int val2){
        int sum = val1 + val2;
        System.out.println("The sum of " +val1+ " and " +val2+ " is " +sum);

    }

    public static void  computeDifference(int val1, int val2){
        int difference = val1 - val2;
        System.out.println("The difference of " +val1+ " and " +val2+ " is " +difference);

    }

    public static void  computeProduct(int val1, int val2){
        int product = val1 * val2;
        System.out.println("The product of " +val1+ " and " +val2+ " is " +product);
    }

    public static void  computeAverage(int val1, int val2){
        int average = (val1 + val2) / 2;
        System.out.println("The average of " +val1+ " and " +val2+ " is " +average);
    }

    public static void  computeDistance(int val1, int val2){
        double distance = Math.sqrt(((val1 - val2) * (val1 - val2) + (val1 - val2) * (val1 - val2)));
        System.out.println("The distance of " +val1+ " and " +val2+ " is " +distance);
    }

    public static void  computeMaxAndMin(int val1, int val2){
        System.out.println("The maximum value of " +val1+ " and " +val2+ " is " +Math.max(val1, val2));
        System.out.println("The minimum value of " +val1+ " and " +val2+ " is " +Math.min(val1, val2));
    }

    public static void getMin(int val1, int val2){
        int min = 0;
        if(min < val1){
            
        }
    }
}
