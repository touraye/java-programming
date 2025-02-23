package java2.classes.ds.queue.dynamic;

import java.util.ArrayList;
import java.util.Arrays;

public class DynamicQueue1 {
    int[] data; // internal data array
    int end = 0;
    int front = 0;
    final int  DEFAULT_SIZE = 5;

    int size = 0;

    public DynamicQueue1() {
        data = new int[DEFAULT_SIZE];
    }

    public DynamicQueue1(int capacity) {
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
            resize(val);
            return;
        }

        data[end++] = val;
        // 5 % 10
        end %= data.length; // 0
        size++;
    }

    public int remove() {
        if (isEmpty()) {
            throw new IndexOutOfBoundsException("Queue is empty");
        }

        int removedVal = data[front++];
        front %= data.length;
        size--;

        return removedVal;
    }

    public void resize(int val) {
        int[] temp = new int[data.length * 2];

        int i = front;
        do {
            temp[i] = data[i];
            i++;
            i %= data.length;
        } while (i != end);

        data = temp;
        front = 0;
        end = size;
        add(val);
    }

    public void display() {
        System.out.println("FRONT: " +front);
        System.out.println("END: " +end);
        System.out.println("SIZE: " +size);
        int i = front;
        do {
            System.out.print(data[i] + " -> ");
            i++;
            i %= data.length;
        } while (i != end);
        System.out.println("END");

        System.out.println("DATA: " + Arrays.toString(data));
    }
}
