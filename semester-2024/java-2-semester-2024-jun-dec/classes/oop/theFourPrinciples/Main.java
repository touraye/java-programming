package java2.classes.oop.theFourPrinciples;

class Persons {
    private String name;
    private String dob;
    private char gender;
    private String department;

    void register(){
        System.out.println("Person registration...");
    }
}

class Student extends Persons {
    private String program;
     double computeGPA(){
        return 0.0;
    }

    @Override // annotation
    void register(){
        System.out.println("Student registration...");
    }

}

class Lecturer extends Persons{
    private String course;
    private String department;

    @Override // annotation
    void register(){
        System.out.println("Lecturer is registration...");
        // compile time(writing syntax)
        // runtime(execution phase run your code)
    }
}
public class Main {
    public static void main(String[] args) {
        Persons persons = new Persons();
        persons.register();
        Student student = new Student();
        student.register();
        Lecturer lecturer = new Lecturer();
        lecturer.register();

        System.out.println("New: ");
        Persons p = new Student();
        p.register();
        Persons l = new Lecturer();
        l.register();

    }
}
