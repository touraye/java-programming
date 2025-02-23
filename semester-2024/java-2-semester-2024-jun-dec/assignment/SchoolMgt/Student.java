package java2.assignment.SchoolMgt;

public class Student extends Person{
    private String major;
    public Student(String name, int age, String id, String major) {
        super(name, age, id);
        this.major = major;
    }

    // override superclass display method by adding other information only relating to Student
    @Override
    public void display() {
        System.out.println("Name: "+"["+this.name+"], Age: " +"["+this.age+"], ID: ["+this.id+"], Major: "+this.major);
    }

    // override superclass greeting method by adding other information only relating to Student
    @Override
    public void greeting(){
        System.out.println("Hello, my name is " +this.name+", a student majoring in " +this.major);
    }

    // study method, display student name and .....
    public void study(){
        System.out.println(this.name +" is studying");
    }

    // allow assessing for student major in other class, hence it is private
    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }
}
