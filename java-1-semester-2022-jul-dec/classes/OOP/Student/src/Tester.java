import helpers.GpaChecker;

public class Tester {
    public static void main(String[] args) {
        Student student1 = new Student("09546","Awa","","Sowe", 3.0);
        GpaChecker gpaChecker = new GpaChecker();

        System.out.println("Student info");
        System.out.println(student1.getStudentNumber());
        System.out.println(student1.getFirstName());
        System.out.println(student1.getMiddleName());
        System.out.println(student1.getLastName());
        System.out.println(student1.getGpa());
        System.out.println("Has pass: " +gpaChecker.check(student1.getGpa()));




        System.out.println("-----------------------------");

        Student student2 = new Student("09673","Lamin","","Sanneh", 1.8);
        System.out.println(student2.getStudentNumber());
        System.out.println(student2.getFirstName());
        System.out.println(student2.getMiddleName());
        System.out.println(student2.getLastName());
        System.out.println(student2.getGpa());
        System.out.println("Has pass: " +gpaChecker.check(student2.getGpa()));

    }
}
