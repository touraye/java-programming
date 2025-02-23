package java2.classes.oop.inheritance;
class Vehicle {
    private String name;
    private String model;
    private int year;

    public Vehicle(String name, String model, int year){
        this.name = name;
        this.model = model;
        this.year = year;
    }

    public void startEngine(){
        System.out.println("Vehicle engine can start!");
    }

     void canMove(){
        System.out.println("Vehicle can move");
    }


}
class Car extends Vehicle {
    public Car(String name, String model, int year) {
        super(name, model, year);
    }



}
class Truck extends Vehicle {
    public Truck(String name, String model, int year) {
        super(name, model, year);
    }
}
public class Tester {
    public static void main(String[] args) {
        // create a Car object
        Car car1 = new Car("Mercedes Benz", "C Class", 2009);
        Car car2 = new Car("Lexus", "NX 300", 2021);
        car1.startEngine();

        // create a Truck object
        Truck truck1 = new Truck("Man", "Buffalo", 2010);
        
    }


}
