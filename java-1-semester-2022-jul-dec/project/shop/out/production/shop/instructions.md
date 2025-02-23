# Instruction
The building material shop App.
## Implementation

1. We will start with create a Java Project(Java Class) called Shop, Then we create main method.
2. Next we will think about how to store the item names, item prices, item quantities. An ArrayList will be suitable for us, because Java ArrayList is dynamic, it can take any amount of item. 
   1. ArrayList for item name
   2. ArrayList for item price
   3. ArrayList for item quantity
3. We need to instantiate a Scanner object because the program will read input from the user
4. We need our global variable:
   1. `item` we need to capture each item entered by the vendor and store it in `items` ArrayList
   2. `price` we need to capture each price entered by the vendor and store it in `prices` ArrayList
   3. `quantity` we need to capture each quantity entered by the vendor and store it in `quantities` ArrayList
   4. `total` at the end of every transaction each receipt will it's total sales
   5. `flag` these will be use to control our loop. It will first to true then set to false base on a condition and the loop will be break.
5. A try and a catch block to counter feature exceptions in our program. Is a good practice trying to catch user error such inputting the wrong type and throw a human readable errors
6. We all a `do wile`  loop to allow vendor to keep entering sales unit a certain point reaches were there are no item then he/she can enter something that will terminate the program
   1. Inside the loop we ask use to enter something as our sentinel value or enter item name
   2. We need to introduce a condition that will check whether what the user enter is our sentinel value if so we terminate the program
   3. We have to assign the `item name` entered by the user to our `item` global variable
   4. We have add the `item` to `items` ArrayList
   5. Ask user to enter the `item price`





