package java2.classes.oop.theFourPrinciples.inheritance;

import java2.classes.oop.theFourPrinciples.encapsulation.Person;

public class Student extends Person {
    private final String department;
    private final String program;
    private final float gpa;
    public Student(String name, int age, String department, String program, float gpa) {
        super(name, age);

        this.department = department;
        this.program = program;
        this.gpa = gpa;
    }

    @Override
    public void info(){
        System.out.println("Student information");
    }

    public String getDepartment() {
        return department;
    }

    public String getProgram() {
        return program;
    }

    public float getGpa() {
        return gpa;
    }

    public boolean isPromoted(){
        return this.gpa > 2.0;
    }
}
