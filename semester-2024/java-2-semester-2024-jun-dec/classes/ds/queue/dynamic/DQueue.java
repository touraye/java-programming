package java2.classes.ds.queue.dynamic;

public class DQueue {
    private int[] data;
    private final int DEFAULT_SIZE = 5;

    protected int front = 0;
    protected int end = 0;
    protected int size = 0;

    public DQueue() {
        data = new int[DEFAULT_SIZE];
    }

    public DQueue(int size) {
        data = new int[size];
    }

    public boolean isFull() {
        return size == data.length;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean insert(int val) {
        if(isFull()){
            throw new IndexOutOfBoundsException("Array is full, cannot insert");
        }

        data[end++] = val;
        size++;
        return true;
    }

    public int remove() {
        if(isEmpty()) {
            throw new IndexOutOfBoundsException("Cannot remove, Array is empty");
        }

        int removedItem = data[front++];
        size--;
        return removedItem;
    }

    public void display() {
        if (isEmpty()){
            throw new IndexOutOfBoundsException("Cannot read from an empty Array");
        }

        System.out.println("FRONT: " +front);
        System.out.println("END: " +end);
        System.out.println("SIZE: " +size);
        for (int i = front; i < end; i++) {
            System.out.print(data[i] + " -> ");
        }
        System.out.println("END");
    }
}
