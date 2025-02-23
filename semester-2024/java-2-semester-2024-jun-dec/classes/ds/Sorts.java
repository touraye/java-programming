package java2.classes.ds;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
class Emp implements Comparable<Emp>{
    String name;
    int age;
    double salary;

    public Emp(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    @Override
    public int compareTo(Emp o) {
        if(this.age < o.age){
            return 1;
        } else if (this.age > o.age){
            return -1;
        }
        return 0;
    }

    @Override
    public String toString() {
        return "Emp{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                '}';
    }
}
public class Sorts {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(50);
        list.add(40);
        list.add(5);
        list.add(30);
        List<String> str = new ArrayList<>();
        str.add("Binta");
        str.add("Amie");
        str.add("Yama");

        List<Integer> l1 = new ArrayList<Integer>(list);
        Collections.sort(list);
        Collections.sort(str);

        System.out.println(l1);
        System.out.println(list);
        System.out.println(str);


         List<Emp> empList = new ArrayList<>();
         empList.add(new Emp("Lamin", 19, 23400));
         empList.add(new Emp("Awa", 29, 33400));
         empList.add(new Emp("Ebou", 22, 53400));
         Collections.sort(empList);
         System.out.println(empList);
    }
}