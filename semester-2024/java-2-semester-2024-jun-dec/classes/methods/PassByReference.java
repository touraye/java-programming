package java2.classes.methods;

class Person {
    String name;

    Person(String name){
        this.name = name;
    }
}

public class PassByReference {
    public static void main(String[] args) {
        Person person = new Person("Ahmed");
        System.out.println("Before modifying: " +person.name);
        modifyMe(person);
        System.out.println("After modifying: " +person.name);
    }

    public static void modifyMe(Person person){
        person.name = "Ahmed Dicko";
    }
}
