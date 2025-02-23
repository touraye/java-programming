package java2.classes.generics;

import java.util.ArrayList;
import java.util.List;

class General<T, V>{
    /*
    Generic should have a type parameter,
    A type parameter is  a diamond sign
    In this type parameter can pass the parameter<T>
     */
    private T t;
    private V v;

    public General(T t, V v) {
        this.t = t;
        this.v = v;
    }

    public void setT(T t){
        this.t = t;
    }

    public T getT(){
        return this.t;
    }

    public V getV() {
        return v;
    }

    public void setV(V v) {
        this.v = v;
    }
}

class SingleType{
    // create name of type N

    /*
        Create a method of N name setN
     */
}

public class Main{
    public static void main(String[] args) {
        SingleType s = new SingleType();
        // create an object of General class and pass your types to it
        // name of the object is going to be obj1
        General<String, Integer> obj1 = new General<>("Lamin", 50);
        General<Double, Boolean> obj2 = new General<>(50.9, false);
        General<Integer, Integer> obj3 = new General<>(50, 50);
        General<SingleType, Double> obj4 = new General<>(s, 50.0);


        obj1.setT("Name");
        obj1.setV(50);

        System.out.println("Obj1 T: " +obj1.getT());
        System.out.println("Obj1 V: " +obj1.getV());

        System.out.println("--------------------------------");

        obj2.setT(50.90);
        obj2.setV(true);

        System.out.println("Obj2 T: " +obj2.getT());
        System.out.println("Obj2 V: " +obj2.getV());
        System.out.println("-----------------");
        List<String> list1 = new ArrayList<>();
        list1.add("man");
        list1.add("boy");

        List<Integer> list2 = new ArrayList<>();
        list2.add(40);
        list2.add(30);
        List<General> list4 = new ArrayList<>();
        list4.add(obj1);



        System.out.println(returnAny(list1));
        System.out.println(returnAny(list2));

        returnString(list1);
        //returnString(list2);

    }

    static <D> List<D> returnAny(List<D> a){
        return a;
    }

    static List<String> returnString(List<String> n){
        return n;
    }
}
