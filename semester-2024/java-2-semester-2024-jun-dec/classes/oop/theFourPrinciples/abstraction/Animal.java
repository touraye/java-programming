package java2.classes.oop.theFourPrinciples.abstraction;

public abstract class Animal {
    public abstract void sound();
    public abstract void move();
}

class Dob extends Animal{
    @Override
    public void sound() {
        System.out.println("Dog bark!");
    }

    @Override
    public void move() {
        System.out.println("Dob move with her four legs");
    }
}

class Bird extends Animal {
    @Override
    public void sound() {
        System.out.println("Bird Preech");
    }

    @Override
    public void move() {
        System.out.println("Bird move by flying!");
    }
}
