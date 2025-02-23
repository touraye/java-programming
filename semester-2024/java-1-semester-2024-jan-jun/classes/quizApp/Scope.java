package java1.classes.quizApp;

public class Scope {
    public static void main(String[] args) {
        // global scope
        int correct = 0; // global variable
        int wrong = 0; // global variable

        if (wrong > 4){
            // local scope
            int point = 0; // local variable
            System.out.println(correct);
            System.out.println(point);
        }

        System.out.println(correct);
        System.out.println(wrong);
    }
}
