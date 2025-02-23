public class Tester {
    public static void main(String[] args) {
        //create Person object
        Person person1 = new Person("Lamin", 30, 'm');
        Person person2 = new Person("Fatou", 20, 'f');
        Person person3 = new Person("Buba", 3, 'm');

        //displaying person object info
        person1.display();
        System.out.println("----------------------------");
        person2.display();
    }
}
