# Week 6

Topics to covered:

* Algorithm
* Unary operator
* Rule of precedence
* Error in Java
* Relational and Comparison Operator
* Logical Operator

[TOC]

## Algorithm

Any computing problem can be solved by executing a series of actions in a specific order. A procedure for solving a problem in terms of 

1. the actions to execute and 

2. the order in which these actions execute 

   is called an algorithm. The following example demonstrates that correctly specifying the order in which the actions execute is important.

```java
//let consider building a Java program to ditermine a user age by taking user born year from the keyboard and printing out thier age to the console
/*
step 1: create a Java project
step 2: create a Java class
step 3: create a main method
step 4: create a Scanner object
step 5: create a variable and store the current year
step 6: create a variable that will hold user born year
step 7: create a variable that will hold user age
step 8: compute user age and store the obtained value into age variable
step 9: print a message in the console telling the user his/her born year and age
*/
```



## Unary Operator:

These type of operator that acts on only one operands they are unlike binary operators which acts upon two operands. Unary operator are used to perform various operations:

*incrementing or decrementing a value by one*

```java
double num = 2;
++num; //increment by 1 (prev increment)
// 3
num++; //increment by 1 (post increment)
// 4
--num; //decrement by 1 (prev decrement)
// 3
num--; //decrement by 1 (post decrement)
// 2
```

*negating and expression*

```java
int a = 10;
int b = 10;
System.out.println(a++ + ++a); // 10+12
// 22
System.out.println(b++ + b++); // 10+11
// 21
```

*inverting the boolean value*

```java
boolean flag = false;
!flag;
// ture
```



## Rules of Precedence

In programming is not always the case that all Arithmetic expressions have evaluate together, some to have wait for others to evaluate first because arithmetic operators have different level of rules of precedence. 

* Multiplication, reminder, and division have the higher level of precedence than addition and subtraction
* If an expression contain (*, /, %) it start from left to right hence they have the same level of precedence
* If an expression contain (+, -) it also start from left to right hence they have the same level of precedence
* Assignment operator has the lowest level  precedence

Programmer can also change these rules of precedence by putting expression in a parentheses `()`. Which follows the BODMAS principles. 

```java
Algebra:
Java: m = (a + b + c + d + e) / 5;
Algebra:
Java: y = m * x + b;
 y = (a * x * x) + (b * x) + c;
   
// Assignment operator has a low rules of precedence
int a = 2 * 3; 
// The arithmetic expression of 2 * 3 has to execute first then followed by expression that will assign value to a variable

int z =  p * r % q + w / x - y;
// 
```



## Error in Java

Error are inevitable in program, in fact  the better you become with coding the more error or bug you have in your code. 

Error are illegal operations perform by the programmer that cause the program to behave abnormally. In Java we have three types of errors namely `syntax error`, `runtime error`, and `logical error`

### Syntax Error

These errors are cause by the programmer due to writing a wrong syntax which is not support by the Java. 

* The compiler detect these type of error and prevent the program from executing.
* These type of error are called compile-time error 
* These error output a clear error-message in the console
* These kind of error will prevent the program from compiling(creating a `.class` file)

```java
// missing bracket
public class Error{
    public static main(String[] args){
            
}
   
// missing semicolon
int number = 3
   
// misspelled keyword
string name = "Yabou";
    
// missing double-quote in String
String message = 'something went wrong!';
    
// improper variable, class or method name
```

### Run-time Error

These kind of error occurs when the program has successfully compiled without giving any errors and creating a `.class ` file. However the program does not execute properly. These kind of errors are detect at runtime.

* The Java compiler did not detect these kind of error rather is the JVM
* These kind of errors are called exceptions 
* Exception are errors thrown at runtime... more about exceptions later in the course

```java
// runtime error
int a = 10, b 0;
a / b;
```



## Relational and Comparison Operator  

 Relational and comparison operator are use to compare number values(int, double, float, long, byte), they act on number values and evaluate to a boolean value. When you use a relational or comparison operator on number value you will always get a boolean out of the expression.

Below is a table showing 5 relational or comparison operator and their description:

| Operator | Name                      | Description                                                  |
| -------- | ------------------------- | ------------------------------------------------------------ |
| >        | Greater than              | will compare left operand against the right, return `true` if  it greater than otherwise  `false` |
| <        | Less than                 | will compare left operand against the right, return `true` if  it less than otherwise  `false` |
| >=       | Greater than or equals to | will compare left operand against the right, return `true` if it is greater than or equals to otherwise  `false` |
| <=       | Less than or equals to    | will compare left operand against the right, return `true` if it is less than or equals to otherwise  `false` |
| ==       | Equals to                 | will compare left operand against the right, return `true` if they are equals to otherwise  `false` |
| !=       | Not equals                | will compare left operand against the right, return `true` if they are not equals to otherwise  `false` |



```java
/*
-----------------------------------------------------
Operator		 |	Examples	 |  Return value			
>				|	1 > 2		|  false
<				|	1 < 2		|  true
>=				|	2 >= 2		|  true
<=				|	3 <= 2		|  false
==				|	1 == 2		|  false
!=				|	1 != 2		|  true
*/
double a = 100.0;
double b = 110.0;
System.out.println(a > b)
System.out.println(a < b)
System.out.println(a >= b)
System.out.println(a <= b)
System.out.println(a == b)
System.out.println(a != b)
```

## Logical Operator

Logical operators is also regarded as `boolean` operators because they act on boolean values, and therefor they return or evaluate to a `boolean` value as well. They are AND, OR, and NOT

Let's try to see them:

| Name | Symbol | Description                                                  |
| ---- | ------ | ------------------------------------------------------------ |
| AND  | &&     | These check the right-hand operand against the left-hand operand, and return `true` if both are values are `true` otherwise `false` |
| OR   | \|\|   | These check the right-hand operand against the left-hand operand, and return `true` if one of the value is `true` or both are `true` otherwise `false` |
| NOT  | !      | These operator is use to negate `boolean` values. It will `true` when it is `false` and return `false` when it is `true` |

