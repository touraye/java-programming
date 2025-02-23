package helpers;

public class GpaChecker {
    public boolean check(double gpa){
        //gpa passmark 2.0
        //3.0 >= 2.0
        if(gpa >= 2.0){
            return true;
        }
        return false;
    }
}
