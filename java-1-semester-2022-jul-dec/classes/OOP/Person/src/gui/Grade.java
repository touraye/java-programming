package gui;

import javax.swing.*;

public class Grade {
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, "Welcome To Grade Book");
        String mark = JOptionPane.showInputDialog(null, "Enter your mark:");
        int confirm = JOptionPane.showConfirmDialog(null, "Are you sure this your mark " +mark);
        int convertMark = Integer.parseInt(mark);
        //check for confirm
        if(confirm == 2){
            JOptionPane.showMessageDialog(null, "You canceled. Please rerun again and Enter a correct mark");
        }
        if(confirm == 1){
            JOptionPane.showMessageDialog(null, "Sorry, No");
        }
        if(confirm == 0){
            //check for marks
            if(convertMark >= 90 && convertMark <= 100){
                JOptionPane.showMessageDialog(null, "You are an A student " +mark);
            } else if(convertMark >= 75 && convertMark <= 89){
                JOptionPane.showMessageDialog(null, "You are a B student " +mark);
            } else if(convertMark >= 65 && convertMark <= 74){
                JOptionPane.showMessageDialog(null, "You are a C student " +mark);
            } else if(convertMark >= 55 && convertMark <= 64){
                JOptionPane.showMessageDialog(null, "You are a D student " +mark);
            } else if(convertMark >= 45 && convertMark <= 54){
                JOptionPane.showMessageDialog(null, "You are a E student " +mark);
            } else {
                JOptionPane.showMessageDialog(null, "You are F student " +mark, "Fail", JOptionPane.ERROR_MESSAGE);
            }

        }

    }
}
