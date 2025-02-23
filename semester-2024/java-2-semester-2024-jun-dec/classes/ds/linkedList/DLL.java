package java2.classes.ds.linkedList;

public class DLL {
    /*
    A doubly LinkedList is a two-dimensional LinkedList
    it has two pointers a next pointing to the next Node and prev
    and prev pointing to the previous Node.
     */
    Node head;
    int size;

    /**
     * Insert node at the first position of the LL. The function takes an integer
     * and create a box(new node). Hence, creating the first Node it points the
     * next of it to the head, points its prev to null, only point the next of head
     * when head is not null, and finally make the node as head.
     *
     * @param val value of the new node, it should be of type init
     */
    public void insertFirst(int val) {
        Node node = new Node(val);
        node.next = head;
        node.prev = null;

        if(head != null) {
            head.prev = node;
        }

        head = node;
        size++;
    }

    /**
     * This function takes a node value and creates a new node by passing the input
     * value to the constructor.
     * @param val value for the new node and it should have type integer
     */
    public void insertLast(int val) {
        Node node = new Node(val);
        // assign head to temp
        Node last = head;
        node.next = null;

        if (head == null) {
            node.prev = null;
            head = node;
            return;
        }

        last = get(size); // get the last node
        // connect node:
        last.next = node; // the next of last to cur node
        node.prev = last; // the prev of cur to last node
    }

    public void insert(int val, int index){

    }

    public Node get(int index){
        Node temp = head;
        while (temp.next != null){
            temp = temp.next;
        }

        return temp;
    }

    /**
     * Display function prints the value of all the nodes,
     * Hence LL is not a continuous memory location it can't be traversed from zeroth index to...
     * Instead, keep going until the next of the current node is null
     */
    public void display(){
        Node last = null;
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.val+ " -> ");
            last = temp;
            temp = temp.next; // move the next pointer
        }

        System.out.println("END");
        System.out.println("PRINTING REVERSE");
        while (last != null) {
            System.out.print(last.val+ " -> ");
            last = last.prev;
        }
        System.out.println("START");
    }
    private class Node {
        int val;
        Node prev;
        Node next;

        Node(int val) {
            this.val = val;
        }

        Node(int val, Node next, Node prev) {
            this.val = val; // create a new Node(assign a value)
            this.next = next; // the next of the newly created Node
            this.prev = prev; // the prev of the newly created Node
        }
    }
}
