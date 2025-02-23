# Week 7

Topics to cover:

* If statement
* if and else statement
* if, else if and else
* switch statement

## If Statement

An if statement is part of the control statements that takes a single boolean or multiples boolean values in it's body and execute what is in the body when the condition meet.

Let's see:

* Condition of the if statement: `if(condition)`
* Body comprises  opening and closing brace and get execute when the condition is true: `if(condition){print}`

```java
boolean flag1 = true;
if(flag){
	System.out.println("Flag is true");
}
// Flag is true 

boolean flag2 = false;
if(flag){
	System.out.println("Flag is true");
}
//

//trail
if(!ture){
    System.out.println("Java is nice!");
}
//
```

Note! *if you have a statement or an expression below a if statement it will execute regardless*

## If and Else Statement

This time we have a condition that we will check first then we have a fallback. As we seen in the previous we print in the console only when the condition is true and nothing is printed when false.

Here we can do it better, is not that a single `if` statement is not a good mechanism. Yes it is in some situations.

Let's see:

*  
* Condition of the if statement: `if(condition)`
* Body comprises  opening and closing brace and get execute when the condition is true: `if(condition){print}`
* Default `else`
* Body of the else `else {print}`

```java
int age = 17;
if(age >= 18){
	System.out.println("Access granted!");
} else {
	System.out.println("Access denied!");
}
// Access denied!
```

Note! *in a if and else statement something has to execute*

## If, Else if and Else Statement

This is sometime regarded as nested if statement, is a great choice if you are checking more than one conditions.

Let's see:

* Condition of the if statement: `if(condition)`
* Body comprises  opening and closing brace and get execute when the condition is true: `if(condition){print}`
* The second condition `else if(firstCondition)`
* Body of the else if statement `else if(econdCondition) {print}`
* Default `else`
* Body of the else `else {print}`

```java
 int age = 46;
if(age < 10 ){
    System.out.println("Baby");
} else if (age >= 10 && age <= 17){
    System.out.println("Child");
} else if(age >= 18 && age <= 45){
    System.out.println("Youth");
} else {
    System.out.println("Adult");
}
// Adult
```

Note! *we use comparisons and logical operator to have check different range of conditions, you to be really carefully comparison and logical is one expression*

## Nested If Statement

In a nested if statement we nest if statement inside a if statement. There is a outer and inner if statement, the inner statement got executed when the outer condition is true.

Let's see:

```java
boolean flag = false;
     
     if(flag){
         int num = 100;
         if(num > 100){
             System.out.println("The number is greater than 100");
         } else{
             System.out.println("The number is not greater than 100");
         }
     } else {
         System.out.println("Oops!");
     }
```

Note! *we can use nested if statement for checking complicated conditions*

## Switch Statement

A switch works just the same as if statement, it has a condition and case(s) and fallback, the default.

Let's see:

* Condition of a switch `switch(condition)`
* Body comprises  opening and closing brace, some cases and a default : `switch(condition){case 1: print break; case 2: print break; default: print}`

```java
  int num = 100;
   switch (num){
       case 100:
           System.out.println("A");
           break;
       case 20:
           System.out.println("B");
           break;
       default:
           System.out.println("Non of the above!");
   }
//A
```

Note! *switch statement cannot replace if statement in all situations*