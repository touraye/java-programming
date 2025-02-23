package java2.classes.oop.theFourPrinciples.methodOverloading;

class Calculation {
    // create a method called sum of type double and pass
    // two parameters to it(
     double sum(double a, double b){
         return a + b;
     }

     double sum(double a, double b, double c){
         return a + b + c;
     }

     int sum(int a, int b){
         return a + b;
     }
}
public class Main {
    public static void main(String[] args) {
        Calculation cal = new Calculation();


        System.out.println(cal.sum(2, 5));
        System.out.println(cal.sum(30.0, 40.50, 5.7));

    }
}
