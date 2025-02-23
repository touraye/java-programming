package java2.classes.methods;

public class Test {
    // Make it possible for callers to pass in their names
    public static void myInfo(String name, String myCourse, String career){
        System.out.println("My name is "+name);
        System.out.println("I'm here to learn " +myCourse);
        System.out.println("I want to be a "+career);
    }

    public static void main(String[] args) {
        String myName = "Alieu Faal";
        String course = "Medicine";
        String myCareer = "Doctor";
        myInfo(myName, course, myCareer);// Hello World!
        System.out.println();

        myInfo("Ida Badjie", "Business Management", "Entrepreneur");
        System.out.println();
        myInfo("Lamin Jobe", "Football", "Processional Footballer");

    }
}
