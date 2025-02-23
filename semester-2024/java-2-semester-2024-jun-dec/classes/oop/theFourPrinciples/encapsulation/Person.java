package java2.classes.oop.theFourPrinciples.encapsulation;

// we define a superclass for our system which is Person
// all the people with our system are person so therefore
// we all their common attribute and behavior into a single
// call class and protect their internal state and providing
// an interface for other classes to interact

// Teacher class

public class Person {
    private String name;
    private int age;

    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }

    // define a method which all the subclasses have to override
    public void info(){
        System.out.println("Person information");
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
