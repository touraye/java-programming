public class Person {
    private String name;
    private int age;
    private char gender;

    //constructor
    public Person(String _name, int _age, char _gender){
        this.name = _name;
        this.age = _age;
        this.gender = _gender;
    }

    //display
    public void display(){
        System.out.println("Name: " +this.name);
        System.out.println("Age: " +this.age);
        System.out.println("Gender: " +this.gender);
    }
}
