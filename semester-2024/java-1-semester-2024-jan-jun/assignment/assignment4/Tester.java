package java1.assignment.assignment4;

public class Tester {
    public static void main(String[] args) {
        /*
        10- The project should concist of two java1.classes
         */
        App app = new App();

        try {
            app.promptUser();
            app.calculateTotalCost();
        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}
