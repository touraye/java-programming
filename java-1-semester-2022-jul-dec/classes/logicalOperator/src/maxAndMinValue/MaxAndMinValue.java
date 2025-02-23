package maxAndMinValue;

import javax.swing.*;
import java.util.Scanner;

public class MaxAndMinValue {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("==== Maximum and Minimum Number ======");

        String input1 = JOptionPane.showInputDialog("Enter first value: ");
        int value1 = Integer.parseInt(input1);
        String input2 = JOptionPane.showInputDialog("Enter second value: ");
        int value2 = Integer.parseInt(input2);

        if(value1 == value2){
            System.out.println("Value1 " +value1+ " value2 " +value2+ " are equal");
            JOptionPane.showMessageDialog(null, "Value1: " + value1+ " is equals to value2: " +value2);
        } else if(value1 > value2){
            System.out.println("Value1 " +value1+ " is greater than value2 " +value2);
        } else {
            System.out.println("Value2 " +value2+ " is greater than value1 " +value1);
        }
    }
}
