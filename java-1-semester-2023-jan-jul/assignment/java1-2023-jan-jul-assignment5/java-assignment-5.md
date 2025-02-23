# Java Assignment 5

Reflection Topic:

Your work code and the code-explanation should be Microsoft word document file right next to each other. 

This assignment consist of a code snippets which you can use a template to answer the questions below:

```java
public static void main(String[] args) {
    String[] courses = {"pld", "java", "db", "web"};

    // Iterate over the above Array and print all the elements in a new line
    for (int i = 1; i <= courses.length;){
        System.out.println(courses[i]);
        i++;
    }
}


//output:
java
db
web
    
Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 4 out of bounds for length 4  
```

*Create a Java class class **JavaAssignment5** copy and paste the main method into your class, run your code:*

As expected the `for loop` should iterate over the array and print all its elements, but the first element is omitted, and `for loop` iterates more than the length of the array which causes a Runtime Error.

## Task

1. Find a way how to print all the elements in the array. Explain type the error that causes the first element not be printed
2. Fix the Runtime Error by implementing a try catch block. Copy the error message and paste it into your browser checkout `stackoverflow.com` solution preferably.
3. Create a two dimensional array of type String. The outer array should consist 4 elements, the sub arrays should consist 5 elements each , use any values to populate the 5 sub arrays. Use a for loop to print all the elements. Explain your process in a best possible way.



Your work should be unique, zero tolerance to plagiarism.

Happy coding!