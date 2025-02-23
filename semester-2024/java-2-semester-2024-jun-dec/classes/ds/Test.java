package java2.classes.ds;

import java.util.ArrayList;
import java.util.Arrays;

class Animal {
    String name;

    public Animal(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                '}';
    }
}
class Cat extends Animal{
    public Cat(String name) {
        super(name);
    }
}
class Dog extends Animal{
    public Dog(String name) {
        super(name);
    }
}

public class Test {
    public static void main(String[] args) {
        ArrayList<Animal> animal = new ArrayList<>();
        Animal parent = new Animal("Animal");
        Cat cat = new Cat("Cat");
        Dog dog = new Dog("Dog");
        animal.add(parent);
        animal.add(cat);
        animal.add(dog);

        Object obj = new String("Everything is an object");
        Object obj2 = 6;
        Object obj3 = 69.98;
        Object obj4 = true;
        Object obj5 = 'm';
        Object obj6 = animal;

        ArrayList<Object> grandDaddy = new ArrayList<>();
        grandDaddy.add(parent);
        grandDaddy.add(cat);
        grandDaddy.add(dog);
        grandDaddy.add(300);
        grandDaddy.add("Object takes everything");
        grandDaddy.add(true);

        System.out.println(Arrays.toString(grandDaddy.toArray()));


        String[] words = {
            "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"
        };
        String[] symbols = {
                "@", "8", "(", "|)", "3", "#", "6", "[-]", "|", "_|", "1", "[]\\/[]", "[]\\[]", "0", "|D", "(,)", "|Z", "$", "']['", "|_|", "\\/", "\\/\\/", "}{", "`/", "2"
        };

        // All your base are belong to us.

    }
}
