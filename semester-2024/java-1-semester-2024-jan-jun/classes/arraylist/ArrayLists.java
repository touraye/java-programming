package java1.classes.arraylist;

import java.util.ArrayList;

public class ArrayLists {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        ArrayList<Integer> nums = new ArrayList<>();
        // methods
        System.out.println("Before adding");
        System.out.println("Size: " +names.size());
        System.out.println("Is Empty: " +names.isEmpty());

        printList(names);
        //printList(nums);

        // adding elements to ArrayList
        names.add("Fatou");
        names.add("Lamin");
        names.add("Halima");
        names.add("Hadi");
        names.add("Jianaba");
        names.add("Tida");


        System.out.println();
        System.out.println("After adding");
        System.out.println("Size: " +names.size());
        System.out.println("Is Empty: " +names.isEmpty());

        System.out.println();
        printList(names);
        // clear
        names.clear();

        System.out.println();
        System.out.println("After clearing");
        System.out.println("Size: " +names.size());
        System.out.println("Is Empty: " +names.isEmpty());

        printList(names);
    }

    static  void printList(ArrayList<String> list){
        System.out.println("Print names: ");
           for(int i = 0; i < list.size(); i++){
               System.out.println(list.get(i));
           }
    }
}
