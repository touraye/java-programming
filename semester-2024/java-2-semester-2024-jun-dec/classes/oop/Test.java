package java2.classes.oop;
class Student {
    String firstName;
    String lastName;
    double gpa;

    public Student(String _firstName, String _lastName, double _gpa){
        this.firstName = _firstName;
        this.lastName = _lastName;
        this.gpa = _gpa;
    }

    @Override
    public String toString() {
        return "Student{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", gpa=" + gpa +
                '}';
    }

    //    public void setFirstName(String firstName){
//        this.firstName = firstName;
//    }
//
//    public String getFirstName(){
//        return this.firstName;
//    }
//
//    public void setLastName(String lastName){
//        this.lastName = lastName;
//    }
//
//    public String getLastName(){
//        return this.lastName;
//    }
//
//    public void setGpa(double gpa){
//        this.gpa = gpa;
//    }
//
//    public double getGpa(){
//        return this.gpa;
//    }
}
public class Test {
    public static void main(String[] args) {
        Student student1 = new Student("Ahmed", "Dicko", 4.0);

        // reading the properties of student1
        System.out.println("Student 1");
        System.out.println(student1.toString());
    }
}
