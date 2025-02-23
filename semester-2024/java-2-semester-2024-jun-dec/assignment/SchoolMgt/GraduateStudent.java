package java2.assignment.SchoolMgt;

public class GraduateStudent extends Student{
    private String researchTopic;

    public GraduateStudent(String name, int age, String id, String major, String researchTopic) {
        super(name, age, id, major);
        this.researchTopic = researchTopic;
    }

    // override superclass greeting method by adding other information only relating to graduate Student
    public void display(){
        System.out.println("Name: "+"["+this.name+"], Age: " +"["+this.age+"], ID: ["+this.id+"], Major: ["+this.getMajor()+ "] Research Topic:: [" +this.researchTopic+"]");
    }

    // this method is only specific to a graduation Student
    public void conductResearch(){
        System.out.println(this.name+" is conducting research on "+this.researchTopic);
    }
}
