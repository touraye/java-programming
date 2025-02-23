package java2.assignment.SchoolMgt;

public class TechnicalStaff extends Employee{
    private String expertise;

    public TechnicalStaff(String name, int age, String id, double salary, String expertise) {
        super(name, age, id, salary);
        this.expertise = expertise;
    }

    // Technical staff specific method
    public void maintainEquipment(){
        System.out.println(this.name+" is maintaining equipment related to "+this.expertise);
    }
}
