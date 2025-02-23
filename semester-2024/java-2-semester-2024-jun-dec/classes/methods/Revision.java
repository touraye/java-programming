package java2.classes.methods;

public class Revision {
    public static void display(String myName, int age){
        System.out.println("Hello world this is, "+myName+" and his/her age is "+age);
        // Hello world this is, Lamin and his/her age is 24
    }

    public static void main(String[] args) {
        display("Lamin", 24);
        display("Fatou", 2);
        display("Jatou", 12);
        //DRY- Don't Repeat Yourself
    }
}
