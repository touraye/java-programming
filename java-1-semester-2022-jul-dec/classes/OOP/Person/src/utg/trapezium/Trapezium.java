package utg.trapezium;

public class Trapezium {
    double a = 10, b = 7, h = 4;

    public void computeArea(){
        double area = 0.5 * (a + b) * h;
        System.out.println("Area of a Trapezium " +area);
    }

    public void computePerimeter(){
        double perimeter = a + b + h;
        System.out.println("Perimeter of a Trapezium " +perimeter);
    }
}
