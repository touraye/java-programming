package java2.classes.oop.Rivision;

// Student class
class Student {
   String name;
   double gpa;

   public boolean isPromoted(){
       return this.gpa < 2.0;
   }

   // set name
    public void setName(String name){
       this.name = name;
    }

    // get name
    public String getName(){
       return this.name;
    }

    // set gpa
    public void setGpa(double gpa){
        this.gpa = gpa;
    }

    // get gpa
    public double getGpa(){
        return this.gpa;
    }
}
public class Main {
    public static void main(String[] args) {
        // instantiate Student class
        Student student1 = new Student();
        student1.setName("Hawa");
        student1.setGpa(4.0);

        // another student
        Student student2 = new Student();
        student2.setName("Aja");
        student2.setGpa(1.4);

        // print the student's info
        System.out.println("Student Name: "+student1.getName());
        System.out.println("Student GPA: "+student1.getGpa());
        boolean promote = student1.isPromoted();
        System.out.println(promote ? "Student promoted" : "Student is not promoted");

        System.out.println();

        System.out.println("Student Name: "+student2.getName());
        System.out.println("Student GPA: "+student2.getGpa());
        System.out.println(student2.isPromoted() ? "Student promoted" : "Student is not promoted");
    }
}
