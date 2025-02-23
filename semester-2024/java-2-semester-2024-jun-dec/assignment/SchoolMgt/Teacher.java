package java2.assignment.SchoolMgt;

public class Teacher extends Employee{
    private String subject;

    public Teacher(String name, int age, String id, double salary, String subject) {
        super(name, age, id, salary);
        this.subject = subject;
    }

    // override superclass greeting method by adding other information only relating to Teacher
    public void display(){
        System.out.println("Name: "+"["+this.name+"] Age: " +"["+this.age+"] ID: ["+this.id+"] Salary: $"+this.salary+" Subject:"+this.subject);
    }

    // this method is related to a teacher
    public void teach(){
        System.out.println(this.name+" is teaching "+this.subject);
    }
}
