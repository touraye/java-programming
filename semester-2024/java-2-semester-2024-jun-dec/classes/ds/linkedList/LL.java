package java2.classes.ds.linkedList;

public class LL {
    /*
    LinkedList class has at least three things; head, tail and a Node class
    and an optional size to keep track of the number of Nodes on the list.
    Head and Tail are type Node(Node class) and they are reference variables
    pointing to each Node(object) in the heap memory. Size is just int.
    The Node class consists of two things; value and next(pointer).
    The value is the actual store on the Node object and the next pointer
    points to the next Node.

    LinkedList has three types; Singly, Doubly, and Circular LinkedList
    In all these LinkedList there are pointers.
    In Singly LinkedList, there is only one pointer as the name says.
    Head is the first Node, and it has value and pointer which points to
    the next Node on the list so thus every Node on the list. The last Node
    on the list is called Tail, hence it doesn't have an immediate Node it
    next pointer points to null.

    `[4]->[3]->[12]->[20]`

     */
    private Node head;
    private Node tail;

    int size;// optional

    public LL(){
        this.size = 0;
    }

    // insert new node in

    /**
     * Insert a node at the head. When tail is none point
     * tail to head. For the first time you insert a node
     * head points to null otherwise head points to
     * @param value of the new node
     */
    public void insertFirst(int value) {
        Node node = new Node(value);
        node.next = head; // set the next of the newly created node to head
        head = node; // change the structure of the linked list and make the new node the head

        // before pointing tail to head, check whether it is null
        if(tail == null){
            tail = head;
        }

        size++;
    }

    /**
     * Insert node to the end of the linked list
     * @param value
     */
    public void insertLast(int value){
        // when tail is null first at the first position
        if(tail == null){
            insertFirst(value);
            return;
        }

        Node node = new Node(value);
        tail.next = node; // point the current tail to the newly created node
        tail = node; // make the newly created node as tail

        size++;

    }


    /**
     * To insert any nth position first, you need to check whether
     * the input index is 0 (call insertFirst) or input equals size
     * (call insertLast). An exception will be thrown when input
     * index is below 0 and more than size.
     * First, create a temporary Node to avoid changing the structure of
     * the LinkedList. Iterate front start (1 pos) till less than the input index
     * for each node assign the current Node next to temp.
     * Create a new Node by passing the value and temp.next to the constructor
     * A new Node will be created, make the current node.next point to the newly created
     * node
     * @param value
     * @param index
     */
    public void insert(int value, int index){
        // insert first position
        if(index == 0){
            insertFirst(value);
            return;
        }

        // insert last position
        if(index == size) {
            insertLast(value);
            return;
        }

        // the index is less than 0 or more than the size
        if(index < 0 || index > size){
            throw new NullPointerException("Provided index in of bound. "+size+ " of " +index);
        }

        // insert at a specific position
        Node temp = head; // temporarily variable
        for (int i = 1; i < index; i++) { // iterate from 1 up to the index
            temp = temp.next; // change the position of temp.next to match with index
            // 3
        }

        // create a new Node
        Node node = new Node(value, temp.next);
        temp.next = node; // point temp.next to the newly created node

        size++;
    }

    public int removeFirst() {
        if (head == null) {
            throw new NullPointerException("Head is null");
        }

        int removeNode = head.value;
        head = head.next;
        // suppose there is only one item
        if (head.next == null) {
            tail = null;
        }

        size--; // decrement size
        return removeNode;
    }
    public Node get(int index) {
        Node node = head;
        for (int i = 0; i < index; i++) {
            node = node.next;
        }

        return node;
    }

    public int removeLast() {
        if (size <= 1) {
            return removeFirst();
        }

        Node secondItem = get(size - 2);
        int removerVal = tail.value;
        tail = secondItem;
        tail.next = null;

        return removerVal;
    }

    public int remove(int index) {
        if (index == 1) {
            return removeFirst();
        }

        if (index == size - 1) {
            return removeLast();
        }

        if (index < 0 || index > size) {
            throw new NullPointerException("Provided index points to no node!");
        }

        // get the previous node of the node to be removed
        Node prev = get(index - 1);
        // the remove val is prev node's next node value
        int removeVal = prev.next.value;
        // break the chain between prev node and its immediate node
        // the prev node should point to second after it, hence it immediate node is going to be removed
        prev.next = prev.next.next;

        size--;
        return removeVal;
    }

    public void display() {
        System.out.println("SIZE: " +size);
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.value+ " -> ");
            temp = temp.next;
        }
// The lone wolf knows well about the long-yards
// Warriors are not made overnight rather many nights made them
        System.out.println("END");
    }

    private class Node {
        int value;
        Node next;
    public Node(int value){
        this.value = value; // set the value of the newly created node
    }

    public Node(int value, Node next){
        this.value = value; // create a new node
        this.next = next; // set the current node next to the newly created node
        // break the chain between the prev and the next
        // after create a new Node set its next the current Node next
    }

    }
}
