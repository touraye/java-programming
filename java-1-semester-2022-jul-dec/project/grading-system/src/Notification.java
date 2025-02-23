import javax.swing.*;

public class Notification {
    public void notify(String type){
        switch (type){
            case "emptyString":
                JOptionPane.showMessageDialog(null,
                        "Oops! field is required", "Empty Field", JOptionPane.ERROR_MESSAGE);
                break;
            case "invalidInput":
                JOptionPane.showMessageDialog(null,
                        "Oops! invalid input", "Wrong Input", JOptionPane.ERROR_MESSAGE);
                break;
        }
    }
}
