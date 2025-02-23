package utgq;

import javax.swing.*;

public class MaxAndMin {
    public static double getMaxValue(double value1, double value2){
        double max = Math.max(value1, value2);
        return max;
    }

    public static double getMinValue(double value1, double value2){
        double min = Math.min(value1, value2);
        return min;
    }

    public static void main(String[] args) {
        String value1 = JOptionPane.showInputDialog(null,
                "Enter First value:");
        String value2 = JOptionPane.showInputDialog(null,
                "Enter Second value:");
        double max = getMaxValue(Double.parseDouble(value1), Double.parseDouble(value2));
        double min = getMinValue(Double.parseDouble(value1), Double.parseDouble(value2));
        JOptionPane.showMessageDialog(null,
                "The Max value is: " +max+ "\n" +
                        "The Min value is: " +min);
    }
}
