package java2.assignment.SchoolMgt;

public class Person implements Comparable<Person>{
    String name;
    int age;
    String id;

    public Person(String name, int age, String id) {
        this.name = name;
        this.age = age;
        this.id = id;
    }

    // display method for the superclass Person
    public void display(){
        System.out.println("Name: "+"["+this.name+"] Age: " +"["+this.age+"] ID: ["+this.id+"]");
    }

    // greeting method for the superclass Person
    public void greeting(){
        System.out.println("Hello, my name is [" +this.name+"]");
    }

    /*
        Sort person age in ascending order
     */
    @Override
    public int compareTo(Person o) {
        if(this.age > o.age){
            return 1;
        } else if(this.age < o.age){
            return -1;
        }
        return 0;
    }
}
