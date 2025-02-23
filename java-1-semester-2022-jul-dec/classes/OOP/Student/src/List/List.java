package List;

import java.util.Scanner;

public class List {
    public static void main(String[] args) {
        double total = 0;
        double average = 0;
        int minValue = 0;
        int maxValue = 0;
        int[] num = {1,2,4,6};
        int[] prices = {10, 10, 15, 20, 25, 8};


        for(int i = 0; i < num.length; i++){
            System.out.println(num[i]);
//            total += num[i];
            total = total + num[i];
            //check for max and min value
            if(num[i] > maxValue){
                maxValue = num[i];
            } else {
                minValue = num[i];
            }

        }

        System.out.println("Total is " +total);
        System.out.println("Average: " +(average = total / num.length));
        System.out.println("Max value: " +maxValue);
        System.out.println("Min value: " +minValue);
    }
}
