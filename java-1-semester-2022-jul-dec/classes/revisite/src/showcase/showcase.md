# Java

**The need of create a variable**:

Here we want to print the result of an Arithmetic operation

```java
public class Main {
    public static void main(String[] args) {
        //Perform Arithmetic operation on any two numbers
        System.out.println(4*5);
        //20
    }
}
```

Here we want to compute two variable and store their result value on a variable then print
```java
public class Main2 {
    public static void main(String[] args) {
        //Perform an Arithmetic(+) on the these two variable and store the result 			in a variable the print
        int number1 = 90;
        int number2 = 10;
        int result = number1 + number2;
        System.out.println(result);
    }
}
```

Here lets explore the concept of global variables and initializing a variable, then later assign a value to it, and also ternary operator

```java
import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        //initialize a variable
        int mark;
        boolean hasPassed;
        
        //take input(mark) from the user
        Scanner input = new Scanner(System.in);
        System.out.print("Enter mark: ");
        mark = input.nextInt();
        //check whether mark is above or is 50 then assign true to hasPassed 			otherwise false
        if(mark >= 50){
            hasPassed = true;
        } else {
            hasPassed = false;
        }

        System.out.println(hasPassed ? " Mark is more or equals to 50 " : " Mark 			is less than 50");
    }
}

```

Global and Local variable

```java
public class GlobalAndLocalVars {
    public static void main(String[] args) {
        //Global and Local Variables

        String accountNumber = "0069544039952";
        double balance = 9000;

        if(balance < 300){
            String message = "Your balance is low ";// You can only access message 				with in the if block
            System.out.println(accountNumber);
            System.out.println(message);
        } else  {
            // You can access message here because it is in a local state(Local 			Variable)
            System.out.println(accountNumber);
            String info = "Your balance is Okay!";
        }
        // You can access message here because it is in a local state(Local 			Variable)
        System.out.println(accountNumber);

    }
}

```

