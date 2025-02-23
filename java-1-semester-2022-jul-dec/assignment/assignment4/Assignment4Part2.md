Java

## Assignment4 Part2

*If and Else Statement*

Here you are going build simple login system using if and else statement in Java.

To complete this assignment you need google about the famous String method called **contains**

1. Create a new class in your existing **src** directory called Login, create a main method, and test your App.

2. Initialized a variable and store your username it in

3. Repeat the same for your password. Your password should be of type String!

4. Create a new object of Scanner; `Scanner input = new Scanner(System.in);`.

5. Prompt user to enter username.

6. Initialize a new variable; `String confrimUsername = input.next();`

7. Prompt user to enter password 

8. Initialize a new variable called `String confrimPassword = input.next();`

9. Using a if condition, check whether `username` variable contains `confirmUsername` these should return a boolean

10. Repeat the same for your password. Use a logical AND operator to compare these two boolean

11. ```java
    if(username is the same as comfirmUsername and passsword is the same as comfirmPassword){
        System.out.println("Welcome " +username);
    } else {
            System.out.println("Wrong credentials! Please try again.");
    }
    ```

    You can use the above code snippet as your if and else statement

Happy Cracking!