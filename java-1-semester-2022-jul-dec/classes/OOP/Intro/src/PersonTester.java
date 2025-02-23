public class PersonTester {
    public static void main(String[] args) {
        Person person = new Person();
        //first person created
        person.setName("Lamin");//first person's name
        person.setAge(20);//first person's age
        System.out.println("First Person's Information");
        System.out.println("Name: " +person.getName());
        System.out.println("Age: " +person.getAge());
        System.out.println(person.canWalk(false) ? "Person can walk" : "Person cannot walk");
        System.out.println("-------------");
        //second person created
        System.out.println("Second Person's Information");
        person.setName("Fatima");
        System.out.println("Name: " +person.getName());
        person.setAge(30);
        System.out.println("Age: " +person.getAge());
        System.out.print("What language can you speak? ");
        person.canTalk();
        System.out.println(person.canWalk(true) ? "Person can walk" : "Person cannot walk");
    }
}
