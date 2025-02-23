package java2.classes.oop;

class Person {
    String name;
    int age;
    String skinColor;

    public Person(String _name, int _age, String _skillColor){
        this.name = _name;
        this.age = _age;
        this.skinColor = _skillColor;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", skinColor='" + skinColor + '\'' +
                '}';
    }

    // behaviors
    // sleep
    public boolean canSleep(String sleep){
        if(sleep == "no"){
            return false;
        }

        return true;
    }

    public boolean canEat(String eat){
        if(eat == "no"){
            return false;
        }

        return true;
    }

    public boolean canWalk(String walk){
        if(walk == "no"){
            return false;
        }

        return true;
    }
}
public class Tester {
    public static void main(String[] args) {
        Person person1 = new Person("Pabe", 12, "Black");
        Person person2 = new Person("Fatou", 19, "Brown");

        System.out.println("Person 1 object:");
        System.out.println(person1.toString());
        // invoke the method using person1 object
        person1.canSleep("yes");
        System.out.println("Sleep: "+(((person1.canSleep("yes"))) ? "person can sleep" : "person cannot sleep"));
        System.out.println("Sleep: "+(((person1.canEat("yes"))) ? "person can eat" : "person cannot eat"));
        System.out.println("Sleep: "+(((person1.canWalk("no"))) ? "person can walk" : "person cannot walk"));
        System.out.println();// line
        System.out.println("Person 2 object:");
        System.out.println(person2.toString());
        // challenge yourself to invoke methods on a person2 object


        // create person3 object and invoke the methods as well
    }
}
