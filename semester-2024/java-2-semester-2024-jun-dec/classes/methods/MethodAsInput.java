package java2.classes.methods;

public class MethodAsInput {
    public static void a(int yearOfBirth){
        System.out.println("You are " +b(yearOfBirth)+ " year old.");
    }

    public static int b(int yearOfBirth){
        int currentYear = 2024;
        return currentYear - yearOfBirth; // compute person's age and return the value
    }

    public static void main(String[] args) {
        int myBirthYear = 2006;
        a(myBirthYear);
    }
}
