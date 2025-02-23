import javax.swing.*;
import java.util.Calendar;
import java.util.Date;

public class Iteration {
    public static void main(String[] args) {
        //for loop
        //int i = 0;
        //i < 40;
        //i++ | i + 1
        String[] months = {
                "Jan",
                "Fed",
                "Mar",
                "Apl",
                "May",
                "Jun",
                "Jul",
                "Aug",
                "Spt",
                "Oct",
                "Nov",
                "Dec"
        };
        Date date = new Date();
        System.out.println("Month: "+(date.getMonth() + 1));
        System.out.println("Day: " +date.getDay());
        System.out.println("Year: " +date.getYear());
        int year = Calendar.getInstance().get(Calendar.YEAR);
        int month = Calendar.getInstance().get(Calendar.MONTH);
        int day = Calendar.getInstance().get(Calendar.DAY_OF_MONTH);

        System.out.println("Calender: " +year);
        System.out.println("Calender Month: "+(month + 1));
        System.out.println("Calender Day: " +day);

        for(int i = 0; i < months.length; i++){
            //catch current month
            System.out.println(i);
            if(i == month){
            JOptionPane.showMessageDialog(null,
                    "WE ARE IN "+months[i]);
            } else {
            JOptionPane.showMessageDialog(null,
                    "Month is "+months[i]);
            }
        }
    }

}
