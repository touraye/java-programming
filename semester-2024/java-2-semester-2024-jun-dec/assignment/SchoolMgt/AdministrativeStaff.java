package java2.assignment.SchoolMgt;

public class AdministrativeStaff extends Employee{
    private String role;

    public AdministrativeStaff(String name, int age, String id, double salary, String role) {
        super(name, age, id, salary);
        this.role = role;
    }

    // override superclass greeting method by adding other information only relating to Administrative Staff
    public void display(){
        System.out.println("Name: "+"["+this.name+"] Age: " +"["+this.age+"] ID: ["+this.id+"] Salary: $"+this.salary+" Role: ["+this.role+"]");
    }

    // Administrative employee specific
    public void performDuties(){
        System.out.println(this.name+" is performing administrative duties as a "+this.role);
    }

}
