package java2.classes.ds.queue;

public class Tester {
    public static void main(String[] args) {
        CustomQueue queue = new CustomQueue();
        queue.display();

        queue.enqueue(20);
        queue.enqueue(10);
        queue.enqueue(3);
        queue.enqueue(2);
        queue.enqueue(4);


        queue.display();

        System.out.println("Removed item: " +queue.dequeue());
        System.out.println("Removed item: " +queue.dequeue());
        System.out.println("Removed item: " +queue.dequeue());
        System.out.println("Removed item: " +queue.dequeue());
        System.out.println("Removed item: " +queue.dequeue());
        System.out.println("Removed item: " +queue.dequeue());

        queue.display();
        queue.enqueue(230);
        queue.enqueue(22);
        queue.enqueue(240);
        System.out.println();
        queue.display();

    }
}
