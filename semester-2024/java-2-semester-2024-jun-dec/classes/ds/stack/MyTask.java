package java2.classes.ds.stack;

import java.util.Stack;

class Task {
    private String title;
    private Status status;

    public Task(String title, Status status) {
        this.title = title;
        this.status = status;
    }

    @Override
    public String toString() {
        return "Task{" +
                "title='" + title + '\'' +
                '}';
    }
}
class CustomStack{
    // declare a new Array of type Task
    Task[] data; // Internally, a stack has an Array were it stores collection of item
    int DEFAULT_SIZE = 5; // The default size of your stack. You can always change it
    int pointer = - 1; // Initially, the pointer is - 1

    public CustomStack(){ // invoking this constructor will make your stack take your default value
        data = new Task[DEFAULT_SIZE]; // Allocate an actual size(DEFAULT_SIZE) for your array
    }

    public CustomStack(int size){ // Invoking this constructor will make you pass a custom size for your stack
        data = new Task[size]; // Allocate an actual size(size) for your array
    }

    boolean isFull(){
        if(pointer == data.length - 1) return true;

        return false;
        //return this.pointer == this.data.length - 1;
    }

    private boolean isEmpty() {
        if(pointer == -1) return true;

        return false;
    }



    /*
    Implement a method called size. This method will
    compute and return the available spot/space on the stack
     */


    void push(Task task){
        if(isFull()){
            // resize the internal stack array
            resize(task);// this method will only execute when the stack is full
            return; // return from this condition will stop the execution
        }


        this.pointer++; // increment the pointer by 1
        this.data[pointer] = task; // add a task to pointer location
        //return true; // return true after a successful operation
    }

    Task peek(){
        if(isEmpty()){
            System.out.println("Cannot peek an empty stack!");
            return null;
        }

        return data[pointer];
    }

    Task pop(){
        if(isEmpty()){ // check whether stack is empty
            System.out.println("Cannot pop from an empty stack!");
            return null; // return null when the stack is empty
        }

        Task removeTask = data[pointer]; // get the task at the top of the stack
        pointer--; //decrement pointer by 1
        return removeTask; // return the removed task
    }


    // print the item of the stack start from the top to the bottom
    void reverseLookup(){
        System.out.println("Item on the stack:");
        for(int i = pointer; i >= 0; i--){
            System.out.println(this.data[i]);
        }
    }

    // resize the stack
    public void resize(Task task){
        Task[] temp = new Task[this.data.length * 2];// temp is twice the size of the data array

        // copy the content of the current task to temp
        for (int i = 0; i < this.data.length; i++){
            temp[i] = this.data[i];
        }

        // reassign data with temp values
        this.data = temp;

        /*
        At this stage, the internal data array is double its original size
        and fill in with all its initial contents
         */
        push(task);// call push method and pass in the input task
    }
}

public class MyTask {
    public static void main(String[] args) {
        // Instantiate my CustomStack class to create a new customStack object
        CustomStack customStack = new CustomStack();

        // Instantiate Tack class to create a new task objects,
        // namely task1, task2, task3
        Task task1 = new Task("Coding", Status.UNCOMPLETED);
        Task task2 = new Task("Walking", Status.UNCOMPLETED);
        Task task3 = new Task("Writing", Status.UNCOMPLETED);
        customStack.push(task1);
        customStack.push(task2);
        customStack.push(new Task("Cleaning", Status.UNCOMPLETED)); // a task can also be added on top of the stack like this
        customStack.push(new Task("Assignment", Status.UNCOMPLETED)); // a task can also be added on top of the stack like this
        customStack.push(new Task("Riding", Status.UNCOMPLETED)); // a task can also be added on top of the stack like this
        customStack.push(new Task("Hiking", Status.UNCOMPLETED)); // a task can also be added on top of the stack like this
        customStack.push(new Task("Going", Status.UNCOMPLETED)); // a task can also be added on top of the stack like this
        customStack.reverseLookup();
        // print the top task on the stack,
        // remove the item from the task and print it


        Stack<Task> stack = new Stack<>();
        stack.push(task1);
        stack.push(task2);
        stack.push(task3);

//        Task removedTask = stack.pop();
//        System.out.println("Removed Task 1: " +removedTask);
//        System.out.println("Removed Task 2: " +stack.pop());
//        System.out.println("Removed Task 3: " +stack.pop());
//
//        //System.out.println("Top of stack: "+stack.peek());

    }
}


