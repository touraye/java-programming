package java2.classes.ds.queue;


import java.util.Arrays;

class Task {
    private String title;
    private Status status;

    public Task(String title, Status status) {
        this.title = title;
        this.status = status;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Task{" +
                "title='" + title + '\'' +
                '}';
    }
}

class Store {
     protected Task[] data;
    protected static final int DEFAULT_SIZE = 5;
    int pointer = -1;// point to the element at the top of the stack

    Store(){
        this(DEFAULT_SIZE);
    }

    public Store(int size) {
        data = new Task[size];
    }

    public boolean push(Task item){
        // check whether it is full
        if(isFull()){
            System.out.println("Stack is full, cannot add new item");
            return false;
        }
        pointer++; // increment pointer by 1
        data[pointer] = item; // place item at the position of pointer

        return true;
    }

    public Task peep(){
        if(isEmpty()){
            System.out.println("Empty stack");
            return null;
        }

        return data[pointer];
    }

    public boolean pop(){
        if (isEmpty()) return false;

        pointer--;
        return true;
    }

    private boolean isEmpty() {
        return pointer == -1;
    }

    private boolean isFull() {
        return pointer == DEFAULT_SIZE;
    }

    public void reside(){
        Task[] temp = new Task[this.data.length * 2];
        for(int i = 0; i <= data.length - 1; i++){
            temp[i] = data[i];
        }
        data = temp;
        System.out.println("new size: "+temp.length);
    }

    public int getSize(){
        return data.length - pointer - 1;
    }

    void display(){
        System.out.println("Items on the stack:");
        for(int i = 0; i <= pointer; i++){
            System.out.println(data[pointer]);
        }
    }

    public void reserveLookup(){
        System.out.println("Reading item from the stack");
        for(int i = pointer; i >= 0; i--){
            System.out.println(data[i]);
        }
    }
}

public class TaskMgt {
    public static void main(String[] args) {
        Task task1 = new Task("Coding", Status.UNCOMPLETED);
        Task task2 = new Task("Writing", Status.UNCOMPLETED);
        Task task3 = new Task("Clean my room", Status.UNCOMPLETED);
        Task task4 = new Task("Cooking", Status.UNCOMPLETED);
        Task task5 = new Task("Jogging", Status.UNCOMPLETED);

        Store stack = new Store();// runtime polymorphism
        stack.display();
        stack.push(task1);
        stack.push(task2);
        stack.push(task3);
        stack.push(task4);
        stack.push(task5);

        //System.out.println("Popping: "+stack.pop());
        //System.out.println("Popping: "+stack.pop());
        //System.out.println("Popping: "+stack.pop());
        //System.out.println("Popping: "+stack.pop());
        //System.out.println("Popping: "+stack.pop());
        Task topIem = stack.peep();
        System.out.println("Top item: "+topIem);
        //stack.display();
        System.out.println();
        stack.reserveLookup();
        stack.reside();
        System.out.println("Stack size: " +stack.getSize());
    }
}