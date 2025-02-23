package java2.assignment.SchoolMgt;

public class UndergraduateStudent extends Student{
    private int year;


    public UndergraduateStudent(String name, int age, String id, String major, int year) {
        super(name, age, id, major);
        this.year = year;
    }

    // override superclass display method by adding other information only relating to undergraduate Student
    @Override
    public void display() {
        System.out.println("Name: "+"["+this.name+"], Age: " +"["+this.age+"], ID: ["+this.id+"], Major: ["+this.getMajor()+ "] Year: [" +this.year+"]");
    }

    // this method it is only specific undergraduate student
    public void attendLecture(){
        System.out.println(this.name+ " is attending an undergraduate lecture.");
    }
}
