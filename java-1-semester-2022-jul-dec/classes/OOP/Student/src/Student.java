public class Student {
    String studentNumber;
    String firstName;
    String middleName;
    String lastName;
    double gpa;

    public Student(String _studentNumber, String _firstName, String _middleName, String _lastName, double _gpa){
        this.studentNumber = _studentNumber;
        this.firstName = _firstName;
        this.middleName = _middleName;
        this.lastName = _lastName;
        this.gpa = _gpa;
    }

    //get student number
    public String getStudentNumber(){
        return this.studentNumber;
    }

    public String getFirstName(){
        return firstName;
    }

    public String getMiddleName(){
        return middleName;
    }

    public String getLastName(){
        return lastName;
    }

    public double getGpa(){
        return gpa;
    }
}
