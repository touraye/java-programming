package java2.classes.ds.linkedList;

public class Tester {
    public static void main(String[] args) {
//        LL list = new LL();
        DLL list = new DLL();


        list.insertFirst(50);
        list.insertFirst(5);
//        list.insertFirst(30);
//        list.insertFirst(10);
//        list.insertFirst(40);
//        list.insertLast(1);
//        list.insert(44, 2);
//        list.insert(34, 7);
//
//        list.display();
//
//        System.out.println("Remove first: " +list.removeFirst());
//        System.out.println("Remove last: " +list.removeLast());
//        list.display();
//        list.remove(1);
//        System.out.println("Remove at position 1 : " +list.remove(1));
        //list.display();
        list.insertLast(30);
        list.display();
    }
}
