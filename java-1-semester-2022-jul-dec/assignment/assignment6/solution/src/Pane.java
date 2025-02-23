import javax.swing.*;

public class Pane {
    public static void main(String[] args) {
        String num = JOptionPane.showInputDialog("Enter number from 0 - 10: ");
        int n = Integer.parseInt(num);
        if(n < 1){
            int input = JOptionPane.showConfirmDialog(null, "Are you sure!");
            //0 = yes 1 = no 2 = cancel
            if(input == 0){
                JOptionPane.showMessageDialog(null, num);
            }
            if(input == 1){
                JOptionPane.showMessageDialog(null, "You said no");
            }
            if(input == 2){
                System.exit(0);
            }
        }


    }
}
