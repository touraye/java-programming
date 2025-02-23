package java2.classes.ds.queue.dynamic;

import java2.classes.ds.queue.circular.CircularQueue;

import java.util.Arrays;

public class DynamicQueue extends CircularQueue {
    private int[] data;
    private final int DEFAULT_SIZE = 5;

    protected int front = 0;
    protected int end = 0;
    protected int size = 0;

    public DynamicQueue() {
        data = new int[DEFAULT_SIZE];
    }

    public DynamicQueue(int size) {
        data = new int[size];
    }

    public boolean isFull() {
        return size == data.length && front == end;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean insert(int val) {
        if (isFull()) {
          resize(val);
          return true;
        }

        data[end++] = val;
        end = end % data.length;
        size++;
        // call the super insert and pass item
        return true;
    }

    public int remove() {
        if (isEmpty()) {
            throw new IndexOutOfBoundsException("Cannot remove from an empty queue");
        }

        int removedVal = data[front++]; // get the first val
        front %= data.length; // reset the front
        size--;
        return removedVal;
    }

    public void display() {
        if (isEmpty()) {
            throw new IndexOutOfBoundsException("Empty queue.");
        }
        System.out.println("FRONT: " + front);
        System.out.println("END: " + end);
        System.out.println("SIZE: " + size);

        int i = front; // start from front
        do {
            System.out.print(data[i] + " -> ");
            i++;
            i %= data.length; //
        } while (i != end); /* until 'i' is equals end */
        System.out.println("END");
    }

    /**
     * In the sense that end is = data.length and front = 0
     * the array needs to be resized. But in the event that
     * end = data.length and front > 0 don't resize because
     * there is an empty slot(s) to insert.
     * @param val
     */
    public void resize(int val){
        System.out.println("Resizing.......");
        // double the array
        int[] temp = new int[data.length * 2];

        int i = front;// start from front
        do {
            temp[i] = data[i];
            i++;
            i %= data.length;
        } while (i != end);

        System.out.println(Arrays.toString(temp));

        data = temp; // set data equals temp(copy it item)
        front = 0; // set front to 0
        end = size; // set end equals size
        System.out.println("END: " +end);
        System.out.println("FRONT: " +end);
        insert(val);
        System.out.println("END: " +end);
    }
}
