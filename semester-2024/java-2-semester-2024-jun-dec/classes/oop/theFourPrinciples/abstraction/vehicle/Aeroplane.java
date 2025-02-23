package java2.classes.oop.theFourPrinciples.abstraction.vehicle;

public class Aeroplane extends Vehicle {

    @Override
    void start() {
        System.out.println("An Aeroplane starts by button press");
    }

    @Override
    void movement() {
        System.out.println("An Aeroplane moves by flying");
    }
}
