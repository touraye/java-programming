package java2.classes.ds.queue;

import java2.classes.ds.queue.circular.CircularQueue;
import java2.classes.ds.queue.dynamic.DynamicQueue;

import java.util.Arrays;

class SingularQueue{
    /*
    Queue is an ordered collection of items from which items
    are removed or deleted from one point(front) and inserted
    into one point(rear).
     */
    int[] data; // internal Array
    final int DEFAULT_SIZE = 5; // the default size
    int end = 0;

    SingularQueue(int capacity){
        data = new int[capacity];
    }

    public SingularQueue(){
        data = new int[DEFAULT_SIZE];
    }


    public boolean insert(int item){
        if(isFull()){
            System.out.println("Resizing Queue...");
            resize(item);
            return false;
        }

        data[end++] = item;
        return true;
    }

    public int removeFirst(){
        if(isEmpty()){
            return -1;
        }

        int removed = data[0]; // remove from the front

        // shift the item to left
        for(int i = 1; i < end; i++){
            data[i - 1] = data[i]; // place the second item in place of the first, vice-vasa
        }

        end--; // decrement end by 1 at the end

        return removed; // return removed item
    }

    public boolean isFull() {
        return end == data.length;
    }

    public boolean isEmpty(){
        return end == 0;
    }



    void display(){
        if(isEmpty()){
            System.out.println("Queue is empty!");
            return;
        }

        System.out.println("Size: " +( end));
        for (int i = 0; i < end; i++) {
            System.out.print(data[i]+ " <- ");
        }
        System.out.println("END");
    }

    public void resize(int item){
        int[] temp = new int[this.data.length * 2];
        System.out.println("New queue size: " +temp.length);

        for (int i = 0; i < data.length - 1; i++) {
            temp[i] = data[i];
        }

        data = temp;
        insert(item);
    }
}
public class Main {
    public static void main(String[] args) {
        CircularQueue queue = new CircularQueue();
        //DynamicQueue queue = new DynamicQueue();
//        SingularQueue queue = new SingularQueue();
        //queue.display();
        queue.insert(5);
        queue.insert(10);
        queue.insert(51);
        queue.insert(45);
        queue.insert(60);
        queue.insert(30);
        queue.display();
//        queue.insert(7);
//        queue.insert(70);
//        queue.insert(8);
//        queue.insert(79);
//        queue.insert(44);
//        queue.insert(42);

//        System.out.println("Remove item: "+queue.remove());
//        System.out.println("Remove item: "+queue.remove());
//        System.out.println("Remove item: "+queue.remove());
//        System.out.println("Remove item: "+queue.remove());
//        queue.insert(100);
//        queue.insert(10);
//        System.out.println("Remove item: "+queue.remove());
        queue.display();


    }
}
