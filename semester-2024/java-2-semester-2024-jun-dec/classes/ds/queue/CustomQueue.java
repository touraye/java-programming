package java2.classes.ds.queue;

public class CustomQueue {
    int[] data; // internal Array
    int end = 0; //
    final int DEFAULT_SIZE = 5;

    public CustomQueue(){
        data = new int[DEFAULT_SIZE];
    }


    public CustomQueue(int size){
        data = new int[size];
    }


    /**
     * this method will check will whether the queue full
     * @return true if the queue is full otherwise false
     */
    public boolean isFull(){
        return end == data.length;
    }

    /**
     * this method will check will whether the queue full
     * @return true, if the queue is empty otherwise false
     */
    public boolean isEmpty(){
        return end == 0;
    }

    /**
     * Insertion happens at the back 0f the Queue
     * Item is inserted the end position
     * end is incremented after the operation
     * The method will do an early return when Queue is full
     * Otherwise is will proceed with the insertion
     * @param value to be inserted to the queue
     */
    public void enqueue(int value){
        if (isFull()) {
            System.out.println("Queue is full");
            return;
        }


        data[end] = value; // place at the end position
        end++; // increment end by 1
    }

    /**
     * Remover item from the front of the queue. In reality, when
     * an item is removed, we only change the position of end but
     * the internal array still has the item. What will happen to the
     * item is that it is going to be overridden when we add a new item
     * @return the removed item
     */
    public int dequeue(){
        if (isEmpty()){
            System.out.println("Cannot remove, queue is empty");
            return -1;
        }

        int removedItem = data[0]; // grab the first element on the queue
        // shift the element to the left
        for (int i = 1; i < end; i++) {
            data[i - 1] = data[i]; // place the item at 1 to 0th position...
        }

        end--;// decrement end by 1
        return removedItem;
    }

    /**
     * Display item iterate over the data array and print
     * It start print item from 0 till end position.
     * It first checks whether the data array is empty or not
     * It will throw an exception when the data array is empty
     */
    public void display(){
        if (isEmpty()){
            throw new IndexOutOfBoundsException("Cannot read from an empty array");
        }

        for (int i = 0; i < end; i++) {
            System.out.print(data[i]+ " -> ");
        }
        System.out.println("END");
    }
}
