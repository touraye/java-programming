package java2.classes.ds.arrayList;

import java.util.ArrayList;

class CustomArrayList {
    int[] data;
    final int DEFAULT_CAPACITY = 10;
    private int size;

    public CustomArrayList(){
        data = new int[DEFAULT_CAPACITY];
    }

    public CustomArrayList(int size) {
        data = new int[size];
    }

    public int size(){
        return size;
    }

    public boolean isEmpty(){
        return size == 0;
    }

    public boolean isFull(){
        return data.length == size;
    }

    // add item
    public boolean add(int obj){
        if(isFull()){
            System.out.println("Resizing Array...");
            resize(obj);
            return false;
        }

        // add an object to your data
        data[size++] = obj;
        return true;
    }

    private void resize(int obj) {
        // Create a temp array with size twice the size of data
        int[] temp = new int[data.length * 2];
        for (int i = 0; i <= data.length - 1; i++) {
            temp[i] = data[i]; // copy each item from data to temp
        }

        data = temp;

        add(obj); // after resizing the array add obj
        System.out.println("Array is sized \nNew size: " +data.length);
    }

    // remove item
    public int removeFirst(){
        if(isEmpty()){
            return -1;
        }

         int removedFirstEle = data[0];
        // shift the elements to the left
        for (int i = 1; i < size; i++) {
            data[i - 1] = data[i];
        }

        size--; // decrement size
        return removedFirstEle;
    }

    public int removeLast(){
        if(isEmpty()){
            return -1;
        }

        int removedLastItem = data[size];

        size--; // decrement size
        return removedLastItem;
    }

    public int removeEle(int index){
        if(isEmpty()){
            return -1;
        }

        if(index >= size) {
            throw new ArrayIndexOutOfBoundsException("Cannot access item at index "+index+" while Array size is " +data.length);
        }

        // if removing the first item
        if(index == 0){
            return removeFirst();
        }

        // if removing the last item
        if(index == size - 1){
            return removeLast();
        }

        //remove from any other than first and last
        // the array needed to be shifted to the left
        int removedItem = -1;
        for (int i = 0; i < data.length - 1; i++) {
            if(data[i] == data[index]){
                removedItem = data[i];
                break;
            }
        }

        if (removedItem > 0){
            System.out.println("Item found!");
        } else {
            System.out.println("Item not found");
        }

        // shift the array from where item is removed
        for (int i = index + 1; i < size; i++) {
            data[i - 1] = data[i];
        }

        size--; // decrement size
        System.out.println("Remove at index " +removedItem);
        return removedItem;
    }

    // display item on the array
    public void display(){
        // traverse the array starting from the 0th index all the way the last index
        System.out.print("[");
        for (int i = 0; i < size; i++) {
            System.out.print(data[i]+ (size - i > 1 ? ", " : ""));
        } // end for
        System.out.println("]");
    }
}

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> d;
        CustomArrayList arrayList = new CustomArrayList();
        arrayList.display();
        arrayList.add(50);
        arrayList.add(30);
        arrayList.add(66);
        arrayList.add(44);
        arrayList.add(44);
        arrayList.display();
        System.out.println(arrayList.size());


        System.out.println("Removed first item: " +arrayList.removeFirst());

        arrayList.display();
        System.out.println("CURRENT SIZE: " +arrayList.size());

        System.out.println("Removed last item: " +arrayList.removeLast());

        arrayList.display();
        System.out.println("CURRENT SIZE: " +arrayList.size());
        System.out.println();

        System.out.println("Removed last item: " +arrayList.removeLast());

        arrayList.display();
        System.out.println("CURRENT SIZE: " +arrayList.size());


        System.out.println();

        System.out.println("Removed last item: " +arrayList.removeLast());

        arrayList.display();
        System.out.println("CURRENT SIZE: " +arrayList.size());

        arrayList.add(440);
        arrayList.add(240);
        arrayList.add(70);
        arrayList.add(2);
        arrayList.add(12);
        arrayList.add(52);
        arrayList.add(55);
        arrayList.add(56);
        arrayList.add(569);
        arrayList.add(5693);
        arrayList.add(52);
        arrayList.display();
        System.out.println("CURRENT SIZE: " +arrayList.size());
        System.out.println("Get item at: " +arrayList.removeEle(100));
        arrayList.display();
        System.out.println("CURRENT SIZE: " +arrayList.size());

    }
}
