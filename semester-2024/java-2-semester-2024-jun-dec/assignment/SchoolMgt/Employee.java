package java2.assignment.SchoolMgt;

public class Employee extends Person{
    protected  double salary;

    public Employee(String name, int age, String id, double salary) {
        super(name, age, id);
        this.salary = salary;
    }

    // override superclass greeting method by adding other information only relating to Employee
    public void display(){
        System.out.println("Name: "+"["+this.name+"] Age: " +"["+this.age+"] ID: ["+this.id+"] Salary: $"+this.salary);
    }

    // override superclass greeting method by adding other information only relating to Employee
    public void greeting(){
        System.out.println("Hello, my name is " +this.name+", an employee at the school.");
    }
}
