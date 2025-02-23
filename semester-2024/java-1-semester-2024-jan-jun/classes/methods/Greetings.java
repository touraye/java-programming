package java1.classes.methods;

public class Greetings {
    public static void greeting(String name){
        System.out.println("Hello World!, " +name);
    }

    public static void main(String[] args) {
        String name = "Ahdem Dicko";
        greeting(name);
    }
}
