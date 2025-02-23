# Week 3
Topics:

* Understanding Statement
* Operator in programming
* What are operator
* What is an operand

## Statement In Programming
Think of a statement as writing a text message to your friend, telling him/her something that he/she can comprehend.
In programming, we give commands or instructions to computer to perform a specific task in a sequence that we want. Each time you write a command or instruction to a computer you are writing a statement.

In Java, a statement is an executable instruction that tells a compiler what to do. In a form of a complete command to be executed and includes one or more expressions. In Java, we have three types of statement.
* Expression Statements
* Declaration Statements
* Control Statements

#### Expression Statement
In Java program expressions plays a very important role. We use expression to generate new values, assign value to a variable. An expression comprises `values`, `variables`, `operators`, and `methods calls`

**Expressions Statement are divided in three categories:**

```java
//Expression that produce a value
2 * 4
8 + (3 * 3)   

//Expression that assign a value        
String name = "Yabou";
int count = 1;
int a = 3, b = 5;

//Expression that neither produce any value nor assign a value
count++;
count--;
int sum = a + b;
```

#### Declaration Statement
In your Java program you might want to create a variable which is going to be used later in your program, but it doesn't have an initial value. Declarations statement helps us with that, declaring a variable or a constant by specifying it data type and name only:
```java
double sum;
boolean flag;
String message;
```

#### Control Statement
As the name says, control statement control the order of program execution. In Java, These order start from top to bottom. Using a control flow statement can interrupt a particular section of a program based on certain condition. 

**Control Statement are further divided in three:**

Conditional or Selection Statement
```java
    //if statement
    if(){
        
    }
    
    //if-else statement
    if(){
        
    } else{
        
    }
    
    //if-else-if statement
    if(){
        
    } else if(){
        
    } else{
        
    }
    
    //switch statement
    switch(){
        case: 1:
	        'buy some cake'
        break;
        case: 2
    	    'drink tea'
        break;
        default:
            'you don t anything'
    }
```

Loop or Iterative Statement
```java
//for loop
for(int i = 0; i < 10; i++){
    System.out.println(i);
}

//while loop
while(true){
    'keep doing something'
}

//do while loop
do{
    'something'
}while(true);

//for-each loop
for(String name : names){
    System.out.println(name);
        }
```

Flow Control or Jump Statements
```java
//return statement
//continue statement
//break statement
```


### Roles of Java Statements
* In Java not all statement most end with a semicolon(;)
* Expression, and Declaration statements most ended with a semicolon(;)
* Control statements do not end with a semicolon instead they have curly brace `{}`

## Operator 
In programming, we have special symbols that we use in our program to carry out some operations. These symbols are driven from Mathematics, but some are called differently and have different use cases in programming. An Operator act on operands, by these a new value is produce,  a new value can be assigned to a variable or a new value can be reassigned to variable.

**Types of Operators in Java**
* Assignment Operator
* Arithmetic Operator
* Comparison or Relational Operator
* Logical Operator
* Ternary Operator

#### Assignment Operator

In programming, we create variables and store value to those variables. Assignment operator make it possible to store a value into a variable. The Assignment operator in programming is equal sign `=` which take the value in the righthand side and assign it to the variable in the left-hand side.

```java
String course = "java";
```



#### Arithmetic Operator
In Java, we use Arithmetic operator do some Mathematical operations like `addition`, `subtraction`, `division`, `multiplication`, and `modules`. The arithmetic operator are binary because the act on two operands:
```java
int a = 10, b = 4;
int sum = a + b;
int product = a * b;
int sub = a - b;
int div = a / b;
int mud = a % b;
// +, *, -, /, % are arithmetic operators
// expression a + b contains the binary operator(+) and the two operans(a and b)
```