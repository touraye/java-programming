package java2.classes.ds.stack;

import java.util.Arrays;

class Stack {
    int size;
    int[] arr;
    int front, rear;

    Stack(int capacity){
        arr = new int[capacity];
        front = 0;
        rear = 0;
    }

    boolean isEmpty(){
        return front == rear;
    }

    boolean isFull(){
        return front == arr.length;
    }

    void push(int item){
        if(isFull()){
            System.out.println("Stack is full");
        } else if(size == 0) {
            arr[front] = item;
            front += 1; // increment front by 1
        } else {
            arr[front] = item;
            front += 1;
        }
    }

    void pop(){
        if(isEmpty()){
            System.out.println("Cannot pop empty stack.");
        } else {
            arr[--front] = 0;
        }
    }

    int peep(){
        if(isEmpty()){
            return -1;
        }

        return arr[front-1];
    }

    void display(){
        System.out.println("Front: " +this.front);
        System.out.println("Rear: " +this.rear);
        System.out.println("Front ele: " +peep());
        System.out.println(Arrays.toString(arr));
    }
}
public class Main {

    public static void main(String[] args) {
        Stack stack = new Stack(5);
        stack.push(2);
        stack.push(3);
        stack.push(1);
        stack.push(33);
        stack.push(30);
        stack.push(31);

        System.out.println("Is empty: "+stack.isEmpty());
        System.out.println("Is full: "+stack.isFull());
        stack.display();
        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();
        stack.display();

        System.out.println("Is empty: "+stack.isEmpty());
        System.out.println("Is full: "+stack.isFull());
        stack.push(50);
        stack.push(5);
        stack.push(9);
        stack.push(88);
        stack.push(89);
        stack.pop();
        //stack.push(889);
        stack.display();
    }
}
