public class Tester {
    public static void main(String[] args) {

        //objects
        Students students1 = new Students();
        Students students2 = new Students();
        Students students3 = new Students();
        Helpers helpers = new Helpers();

        students1.setStudentNumber("0942");
        students1.setFirstName("Muhammed");
        students1.setLastName("Sanneh");
        students1.setMinit("");
        students1.setGpa(3.58);

        System.out.println("Student information:");

        System.out.println("Student Number: " +students1.getStudentNumber());
        System.out.println("First Name: " +students1.getFirstName());
        System.out.println("Last Name: " +students1.getLastName());
        System.out.println("Middle Name: " +students1.getMinit());
        System.out.println("Student GPA: " +students1.getGpa());
        System.out.println("Is Student Promoted: " +helpers.isPromoted(students1.getGpa()));

        System.out.println("-----------------------------------------");



        students2.setStudentNumber("0532");
        students2.setFirstName("fatou");
        students2.setLastName("Sarr");
        students2.setMinit("b");
        students2.setGpa(2.02);

        System.out.println("Student Number: " +students2.getStudentNumber());
        System.out.println("First Name: " +students2.getFirstName());
        System.out.println("Last Name: " +students2.getLastName());
        System.out.println("Middle Name: " +students2.getMinit());
        System.out.println("Student GPA: " +students2.getGpa());
        System.out.println("Is Student Promoted: " +helpers.isPromoted(students2.getGpa()));

        System.out.println("-----------------------------------------");

        students3.setStudentNumber("0334");
        students3.setFirstName("buba");
        students3.setLastName("jobe");
        students3.setMinit("");
        students3.setGpa(2.62);

        System.out.println("Student Number: " +students3.getStudentNumber());
        System.out.println("First Name: " +students3.getFirstName());
        System.out.println("Last Name: " +students3.getLastName());
        System.out.println("Middle Name: " +students3.getMinit());
        System.out.println("Student GPA: " +students3.getGpa());
        System.out.println("Is Student Promoted: " +helpers.isPromoted(students3.getGpa()));
    }
}
