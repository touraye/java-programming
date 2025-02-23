import javax.swing.*;

public class Grades {
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, "Welcome Grade Book");
        String mark = JOptionPane.showInputDialog(null, "Enter your mark:");
        int convertMark = Integer.parseInt(mark);
        int confirm = JOptionPane.showConfirmDialog(null, "Are you sure this your mark " +convertMark+ " is your true mark");

        if(confirm == 2){
            JOptionPane.showMessageDialog(null, "Program terminated!");
        }
        if(confirm == 1){
            JOptionPane.showMessageDialog(null, "" +convertMark+ " is not your mark, Rerun the program and enter a your correct mark");
        }
        if (confirm == 0){
            if(convertMark >= 90 && convertMark <= 100){
                JOptionPane.showMessageDialog(null, "You score " +convertMark+ " you are a A student");
            } else if(convertMark >= 75 && convertMark <= 89){
                JOptionPane.showMessageDialog(null, "You score " +convertMark+ " you are a B student");
            } else if(convertMark >= 60 && convertMark <= 74){
                JOptionPane.showMessageDialog(null, "You score " +convertMark+ " you are a C student");
            } else if(convertMark >= 49 && convertMark <= 59){
                JOptionPane.showMessageDialog(null, "You score " +convertMark+ " you are a D student");
            } else if(convertMark >= 40 && convertMark <= 48){
                JOptionPane.showMessageDialog(null, "You score " +convertMark+ " you are a E student");
            } else {
                JOptionPane.showMessageDialog(null, "You score " +convertMark+ " you are a F student", "Fail", JOptionPane.ERROR_MESSAGE);
                System.exit(0);
            }
        }
    }
}
