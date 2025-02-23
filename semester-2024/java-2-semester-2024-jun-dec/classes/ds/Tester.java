package java2.classes.ds;

import java2.classes.ds.queue.Main;

import java.util.ArrayList;
import java.util.List;

class Animals {
    String name;

    @Override
    public String toString() {
        return "Animals{" +
                "name='" + name + '\'' +
                '}';
    }

    void walk(){
        System.out.println("Animals walks....");
    }
}

class Dogs extends Animals {
    @Override
    void walk(){
        System.out.println("Dog walks with its four legs");
    }
}
class Cats extends Animals {
    @Override
    void walk() {
        super.walk();
    }
}

public class Tester {

    public static void main(String[] args) {
        List<Object> grandDaddy = new ArrayList<>();
        List<Animals> list = new ArrayList<>();
        Animals animals1 = new Animals();
        Dogs dog = new Dogs();
        Cats cats = new Cats();
        list.add(animals1);
        list.add(dog);
        list.add(cats);

        grandDaddy.add(animals1);
        grandDaddy.add(dog);
        grandDaddy.add(cats);
        grandDaddy.add(1233);
        grandDaddy.add("String are also Object");
        grandDaddy.add(true);




    }
}
