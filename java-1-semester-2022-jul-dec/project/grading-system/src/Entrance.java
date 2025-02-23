import javax.swing.*;
import java.util.InputMismatchException;

public class Entrance {
    GradeBook gradeBook = new GradeBook();
    Notification notification = new Notification();

    public void record(){
        int counter = 1;
        int tracker = 5;

        do {
            try {
                String subjectName = JOptionPane.showInputDialog(null,
                        "Processing " +counter+ " Subject\nLeft with " +(tracker - 1)+ "Subject\nEnter subject name:");
                if(subjectName.isEmpty()){
                    notification.notify("emptyString");
                } else {
                    //add subject name to subjectNames[]
                    gradeBook.addSubjectName(subjectName);

                    String subjectMark = JOptionPane.showInputDialog(null,
                            "Enter subject mark:");
                    if(subjectMark.isEmpty()) {
                        notification.notify("emptyString");
                    } else if(Integer.parseInt(subjectMark) < 0 || Integer.parseInt(subjectMark) > 100){
                        notification.notify("invalidInput");
                    } else {
                        //add subject name to subjectNames[]
                        gradeBook.addSubjectMark(Integer.parseInt(subjectMark));
                    }
                }
            } catch (InputMismatchException e){
                notification.notify("invalidInput");
            } catch (NullPointerException e){
                notification.notify("emptyString");
            }
            //update counter
            counter++;
            //update track
            tracker--;
        } while(counter <= 5);

        display();
    }

    public void display(){
        System.out.println("Subject           Mark          Condition");
        int totalMark = 0, maximumMark = 0, minimumMark = 100, average = 0;
        for(int i = 0; i < gradeBook.listOfStudentMark().size(); i++){
            System.out.println(gradeBook.listOfSubjectName().get(i)+ "              "
                    +gradeBook.listOfStudentMark().get(i)+ "              "
                    + ((int) gradeBook.listOfStudentMark().get(i) > 49 ? "pass" : "fail") );
            totalMark += ((int) gradeBook.listOfStudentMark().get(i));
            if(((int) gradeBook.listOfStudentMark().get(i)) > maximumMark){
                maximumMark = ((int) gradeBook.listOfStudentMark().get(i));
            }

            if(((int) gradeBook.listOfStudentMark().get(i)) < minimumMark){
                minimumMark = ((int) gradeBook.listOfStudentMark().get(i));
            }
        }
        average = totalMark / gradeBook.listOfStudentMark().size();
        calculate(totalMark,maximumMark, minimumMark, average);
    }

    public void calculate(int totalMark, int maximumMark, int minimumMark, int average){
        System.out.println("-------------------------------------------------------");
        System.out.print("Maximum mark: " +maximumMark+ "\n" +
                "Minimum mark: " +minimumMark+ "\n" +
                "Average mark: " +average+ "\n" +
                "Total mark: " +totalMark);
    }
}
