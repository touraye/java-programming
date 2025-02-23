package java2.classes.oop.theFourPrinciples.inheritance;

import java2.classes.oop.theFourPrinciples.encapsulation.Person;

public class Teacher extends Person {
    private final int yearOfExperience;
    private final double salary;
    public Teacher(String name, int age, int yearOfExperience, double salary) {
        super(name, age);

        this.yearOfExperience = yearOfExperience;
        this.salary = salary;
    }

    // polymorphism
    @Override
    public void info(){
        System.out.println("Teacher information");
    }

    public int getYearOfExperience() {
        return yearOfExperience;
    }

    public double getSalary() {
        return salary;
    }

    public boolean isQualified(){
        return this.yearOfExperience > 2;
    }
}
