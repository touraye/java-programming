package java2.classes.ds.queue.circular;

public class CircularQueue {
    private int[] data;
    private final int DEFAULT_SIZE = 5;

    protected int front = 0;
    protected int end = 0;
    protected int size = 0;

    public CircularQueue() {
        data = new int[DEFAULT_SIZE];
    }

    public CircularQueue(int size) {
        data = new int[size];
    }

    /**
     * isFull method will check whether the array is full or not,
     * but how? Note! A circular array is unlike a none circular
     * array. For a none circular we can relay on size == data.length
     * for it be full but, we cannot do that for a circular array
     * due to its circular nature. So, what do we do? Hence, when
     * the last item got inserted `end` (end %= data.length) will
     * set `end` back to zero. Meaning the next insertion will happen
     * at zeroth position, that will be an override. To answer the
     * question, we have to use a dynamic array to suffice our problem.
     * But I believe there is only one condition for using a dynamic array.
     * And, it is when front equals end, but only when size is more than zero.
     * Because for the first time front equals end. As a circular array, we cannot
     * tell exactly at which position hence using modulus front and
     * end will always be going front 0 till the end of the array
     * and reset back to zero again.
     * @return ture if the size is more than 0 and the same time front is equal to end
     */
    public boolean isFull() {
        // when size == length of the array:
        // front == end
        return size == data.length && front == end;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean insert(int val) {
        if (isFull()) {
            throw new IndexOutOfBoundsException("Queue is full cannot add item.");
        }

        data[end++] = val;
        end = end % data.length;
        size++;
        System.out.println("END: " +end);
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

    public int getEnd() {
        if (isEmpty()) {
            throw new IndexOutOfBoundsException("Empty queue");
        }
        System.out.println("END: " +this.end);
        return data[this.end];
    }

    public void display() {
        if (isEmpty()) {
            throw new IndexOutOfBoundsException("Empty queue.");
        }
        System.out.println("SIZE: " + size);

        int i = front; // start from front
        do {
            System.out.print(data[i] + " -> ");
            i++;
            i %= data.length; //
        } while (i != end); /* until 'i' is equals end */
        System.out.println("END");
    }
}
