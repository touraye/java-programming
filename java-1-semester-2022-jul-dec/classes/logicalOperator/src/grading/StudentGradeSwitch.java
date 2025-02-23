package grading;

public class StudentGradeSwitch {
    public static void main(String[] args) {
        double mark = 90;

        switch ((int) mark){
            case 90:
                System.out.println("A Student");
                break;
            case 80:
                System.out.println("B Student");
                break;
            default:
                System.out.println("None above");
        }
    }
}
