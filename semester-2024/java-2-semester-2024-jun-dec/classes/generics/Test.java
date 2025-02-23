package java2.classes.generics;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

class Container<i1, i2>{
    i1 item1;
    i2 item2;

    public Container(i1 item1, i2 item2) {
        this.item1 = item1;
        this.item2 = item2;
    }

    public i1 getItem1() {
        return item1;
    }

    public void setItem1(i1 item1) {
        this.item1 = item1;
    }

    public i2 getItem2() {
        return item2;
    }

    public void setItem2(i2 item2) {
        this.item2 = item2;
    }
}

class Person {
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
public class Test {
    public static void main(String[] args) {
        Container<Integer, String> container = new Container<>(10, "Lamin");
        Person p1 = new Person("Lamin", 30);
        Person p2 = new Person("Binta", 3);
        Person p3 = new Person("Halima", 15);

        Set<Person> pSet1 = new HashSet<>();
        pSet1.add(p1);
        pSet1.add(p2);
        pSet1.add(p3);

        Set<Person> pSet2 = new HashSet<>();
        pSet2.add(p1);
        pSet2.add(p3);

        Set<Person> pSet = con(pSet1, pSet2);
        Iterator<Person> pResultSet = pSet.iterator();
        System.out.println("User define type:");
        while(pResultSet.hasNext()){
            System.out.println(pResultSet.next().name);
        }

        System.out.println();

        // populate con
        Set<String> set1 = new HashSet<>();
        set1.add("one");
        set1.add("two");
        set1.add("three");
        set1.add("four");

        Set<String> set2 = new HashSet<>();
        set1.add("one");
        set1.add("two");
        set1.add("five");
        set1.add("six");

        Set<String> resultset = con(set1, set2);
        System.out.println("String data type:");
        for (String s : resultset) {
            System.out.println(s);
        }

        System.out.println();
        Set<Double> counting1 = new HashSet<>();
        counting1.add(20.9);
        counting1.add(2.9);
        counting1.add(4.9);

        Set<Double> counting2 = new HashSet<>();
        counting1.add(20.9);
        counting1.add(2.9);
        counting1.add(90.4);

        Set<Double> countingSet = con(counting1,counting2);
        Iterator<Double> countItr = countingSet.iterator();
        System.out.println("Double date type:");
        while(countItr.hasNext()){
            System.out.println(countItr.next());
        }

        System.out.println();
        // making triangle
        for(int i = 0; i < 5; i++){
            if(i == 0)
                System.out.println("*");

            for(int j = 0; j <= i; j++){
                System.out.print("*");
            }
            System.out.println("*");
        }
        System.out.println();
        for(int n = 5; n > 0; n--){
            System.out.println("");
            for(int m = 0; m < n; m++){
                System.out.print("*");
            }
        }
    }


    /**
     * Universal method(generic) accept a Set of any Object.
     * Add it to a HashSet of type E
     * @param set1 Set of type E
     * @param set2 Set of type E
     * @return return the union of set1 and set2 of type E
     * @param <E> type parameter
     */
    static <E> Set<E> con(Set<E> set1, Set<E> set2){
        Set<E> result = new HashSet<>(set1);
        result.addAll(set2);
        return result;
    }
}