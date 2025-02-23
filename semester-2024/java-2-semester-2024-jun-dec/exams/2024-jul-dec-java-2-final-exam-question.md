# Java 2 Final Exam Questions

1. The granddaddy of everything in Java is said to be.

   1. Class
   2. Main method
   3. Node
   4. An Object

2. Which class defined `toString()` function which can be overridden by every sub-class.

   1. Object class
   2. String class
   3. ArrayList class
   4. Student class

3. The ArrayList<> can store any type including user-defined types. This is because the ArrayList class defined a type parameter. All this is possible because of__

   1. Object Oriented Programming
   2. Functional Programming
   3. Generic Programming
   4. None of the above

4. Enums are used to define__ types for variables.

   1. Dynamic 
   2. Predefine
   3. Static
   4. Node of the above

5. Study the code snippets below to answer the following questions(5, 6, and 7).

   ```java
   class Car {
       String name;
       String engine;
       int seats;
       int wheels;
   }
   ```

   With Object-Oriented Programming, we can define our type by creating a class that represents a real-world entity. For example, the `Car` class refers to what types?

   1. User define type
   2. String data type
   3. Object
   4. Constructor

6. The four variables defined at the class level are also called__ variable.

   1. Car
   2. Class
   3. Object
   4. Instance

7. The `Car` class does not explicitly define a constructor, but when creating a car object, Java will create a default construct under the hook. What is this constructor called?

   1. No-args constructor
   2. Super constructor
   3. Class constructor
   4. Object constructor

8. A function/sub-routine is a species of code that executes whenever called or invoked.

   1. true
   2. false

9. A stack data structure that stores items in a__ order.

   1. last in last out
   2. last in first out
   3. first in first out
   4. first in last out

10. What data structure does the stack utilize to store items internally?

    1. object
    2. list
    3. array
    4. trees

11. A data structure that stores items/elements using an index base is called.

    1. an array
    2. linked list
    3. trees
    4. all of the above

12. Which operation in LinkedList does not require changing its structure.

    1. insertion
    2. deletion
    3. displaying
    4. none of the above

13. Study the algorithm below and figure out its time and space complexity(questions; 13 and 14).

    ```java
    int[] temp = new int[this.data.length * 2];
    for (int i = 0; i < data.length - 1; i++) {
                temp[i] = data[i];
          }
    ```

    The above code doubles an Array. What is the space complexity of the algorithm?

    1. O(1)
    2. O(n)
    3. both a and b
    4. none of the above

14. What is the time complexity of traversing through the data array?

    1. constant time O(1)
    2. The time is relative to the number of items in the data array, O(N)
    3. time-complexity not applicable 
    4. none of the above

15. The below snippet is a `Node` class it has a value of type `int` and a next pointer pointing to a next Node.

    ```java
    private class Node {
            int value;
            Node next;
    }
    ```

    What type of a LinkedList?

    1. singly 

    2. doubly 

    3. circular 

    4. a and b

16. All the rest are principles of Object Oriented Programming except.

    1. implements

    2. abstraction

    3. encapsulation

    4. polymorphism

17. A recursive function is a function that calls itself, repetitively until a base case is reached.

    1. true

    2. false

    3. both a and b

    4. none the above

18. A data structure where insertion happens at the end and removal happens at the front.

    1. Set

    2. HashMap

    3. Stack

    4. Queue

19. In a LinkedList, the next pointer(s) are referential variables stored in the stack memory that point to an actual object stored in the heap memory.

    1. false
    2. true

20. Suppose `end = 3;` `val` will be inserted at which index.

    `data[end++] = val;` 

    1. at index 2
    2. at index 3
    3. at index 4
    4. none of the above

21. Study the code below.

    ```java
    static int sum(int a, int b){
            return a + b;
        }
    
    static double sum(double a, int b){
        return a + b;
    }
    ```

    What programming technique allows you to write two or more functions/methods with the same but different method signatures?

    1. method overridden
    2. method overloading
    3. recursion 
    4. generic programming

22. Study the code below and choose the right option.

    ```java
    public void insert(int val) {
            if (isFull()) {
                throw new IndexOutOfBoundsException("Queue is full cannot add item.");
            }
    
            data[end++] = val;
            end = end % data.length;
            size++;
        }
    ```

    What will happen when the condition evaluates to true?

    1. runtime error
    2. compile time error
    3. both a and b
    4. none of the above

23. If a class extends a class it becomes__

    1. super class
    2. sub class
    3. an object
    4. a constructor

24. Objects are stored in the heap memory while their references are stored in__ memory.

    1. virtual
    2. stack
    3. array
    4. static

25. Below is a `CircularQueue` with two constructors. One is a `no-args` constructor and the other defines an argument. When creating a circular queue object it will be mandatory to pass an argument as the size of the internal data array.

    ```java
    public class CircularQueue {
        /*
        ....
        */
        
        public CircularQueue() {
            data = new int[DEFAULT_SIZE];
        }
    
        public CircularQueue(int size) {
            data = new int[size];
        }
    }
    ```

    1. yes
    2. no

26. When working with data structures and performing certain operations will result in a change in the structure of the data structure. A `peek` operation on a Stack will result in a change in its structure.

    ```java
    public Task peek(){
            if (isEmpty()) {
                System.out.println("Cannot peek from an empty stack!");
                return null;
            }
    
            return data[pointer];
    }
    ```

    1. yes
    2. no

27. When a variable is defined within the body of a function is said to be in a__ scope.

    1. global
    2. local
    3. function
    4. internal

28. A data structure that stores items in a key-value pair in Java is said to be__

    1. Set
    2. Queue
    3. Map
    4. ArrayList

29. All the following are linear data structures except.

    1. Tree
    2. ArrayList
    3. Stack
    4. LinkedList

30. Iterating through a linear data structure, the time complexity of an algorithm depends on its size.

    1. true
    2. false

Section B:

Answer only two questions from this section. All questions carry equal marks.

1. The algorithms below create an array twice the size of the `data` array called `temp` and fill it with all the items from the `data` array. Suppose the `data` array consists of the following items; `[12, 4, 10, 19, 3]`.

   ```java
   int[] temp = new int[this.data.length * 2];
   for (int i = 0; i < this.data.length; i++){
        temp[i] = data[i];
   }
   data = temp; // data is reassigned with temp
   ```

   1. Explain why the temp array will be twice the size of the data array. (2 marks)
   2. Explain how the items from the `data` array will copied to the `temp` array. (2 marks)
   3. Finally, output the content of the data array. (1 marks)

2. List all the three interfaces defined by the Collection Framework. (1 marks)

   1. Discuss the difference between any two. (2 marks)
   2. Use the one mentioned above and perform two operations(add and remove). (2 marks)

3. List the three iterative mechanisms discussed so far.

   ```java
   String[][] studentGrade = {
                               {"ahmed dicko", "4.0"}, 
                               {"binta jallow", "3.35"},
                               {"yuspha jarju", "2.75"},
                               {"jainaba njie", "3.75"},
                                };
   ```

   1. Explain why such a data structure(nested array) is the best suite for storing student grades. (2 marks)
   2. Java Collection provided a Data structure that suffices the need for handling such. Use the data structure to store the student grades. (2 marks)
   3. Which iterative mechanism will you use to traverse/iterate through the `studentGrades`? (1 marks)

4. You are tasked with storing information about students such as `id`, `name`,` age`, `gpa`, and `major` into a single type. Object-oriented programming allows us to create one single type(user-defined type) with many properties and can also define behaviors. A Student will have the above properties and a promote behavior.

   Consider this template:

   ```java
   public class Student {
       
   }
   ```

   1. Using; `id, name, age, gpa, major`; Create field types. (1 marks)
   2. Create a constructor to initialize the instance variables. (1 marks)
   3. As for behavior, create a function that will define how a student should be promoted. Hint: Students whose GPA is more than 1.9 are only eligible to be promoted. (1 marks)
   4. An `ArrayList<Student> studentList` can be store students. After creating at least three students(object), make sure one student's `gpa` is less than 1.9, and add them to `studentList`.  (1 marks)
   5. Using a `for (Student in studentList)` to traverse the list, print only the student whose `gpa` is above 1.9. (1 marks)

5. A LinkedList data structure consists of at least a head, tail, and a Node class.

   ```java
   public class LL {
       Node head;
       Node tail;
       
       private class Node {}
   }
   ```

   1. What is head and tail? (1 mark)
   2. Where do the head and tail both point to when one node is created?(1 mark)
   3. For a Doubly LinkedList, what are the properties of a Node class? (1 mark)
   4. Draw Doubly LinkedList and Consider the following as the values; `20, 45, 12, 66, 98`. (2 marks)