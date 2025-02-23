package java2.classes.ds.queue.CQueue;

import java.util.Arrays;

public class CQueue {
    int[] data; // internal data array
    int end = 0;
    int front = 0;
    final int  DEFAULT_SIZE = 5;

    int size = 0;

    public CQueue() {
        data = new int[DEFAULT_SIZE];
    }

    public CQueue(int capacity) {
        data = new int[capacity];
    }

    public boolean isFull() {
        return size == data.length;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void add(int val) {
        if (isFull()) {
            throw new IndexOutOfBoundsException("Cannot add");
        }

        data[end++] = val;
        size++;
    }

    public int remove() {
        if (isEmpty()) {
            throw new IndexOutOfBoundsException("Queue is empty");
        }

        int removedVal = data[front++];
        size--;
        return removedVal;
    }

    public void display() {
//        if (isEmpty()) {
//            throw new IndexOutOfBoundsException("Queue is empty");
//        }
        // stats
        System.out.println("END: " +end);
        System.out.println("FRONT: " +front);
        System.out.println("SIZE: " +size);
        System.out.println();
        System.out.println("Original Array: "+Arrays.toString(data));

        for (int i = front; i < end; i++){
            System.out.print(data[i] +" -> ");
        }
        System.out.println("END");
    }
}
