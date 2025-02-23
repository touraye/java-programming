# Super Market App

A supermarket owner want to have a application which he/she can use to tracks of all the sales in his/her supermarket and display the best customer of the day. The best customer will the customer who made the highest purchase for the day.

## Requirement Analysis 

* The App should keep the names of the customers and their sum total purchase
* The App should allow user to enter the name of the `customers` and also item `prices` continuously
  * Because in a supermarket one customer can buy more than one item
* After entering the name of the `customer` the App should continuously allow user to enter each and every item's price or prices the customer is buying.
* Upon entering one item's price the App should ask whether their is more item's price to be entered if so user can click on `Yes` button to proceed otherwise click on `No` or `Cancel`
  * In a supermarket a customer can buy only one item
* As mentioned above if the user click on `No` or `Cancel` button the App should prompt the user if their are sales to make and if yes the user can click on `Yes` button to keep the App running because is not the end of the.
* The user should be given the ability to kill the program at the end of the day.
* At the end of the day the App should determine the highest sales and print out the name of the customer and total amount he/she bought.

## Features

1. The base class were you have to create a store. The store for this App is just the `customer's name` and their `total prices`
2. A working class were all the logic of the App will be implemented.
   1. The working class should have the method like `teller()`, `getBestCustomer()`, `displayTheBestCustomer(String customerName, double totalPrice)`, and `currencyFormater(double amount)`
3. The `teller()` method will ask user to enter customer's name and all of their item's prices, it should keep tracking their item prices, and it should invoke the `getBestCustomer()` method at the end of the day
4. The `getBestCustomer()` method's work is to iterate over instance variables in our store and determine the highest price in the prices ArrayList, get the index of the highest price, get the customer at that index, and invoke `displayTheBestCustomer(bestCustomer, maxPrice)`
5. The `displayTheBestCustomer(String bestCustomerName, double maxPrice)` will show the best customer name with it's highest price, and also invoke `currencyFormater(maxPrice)`
6. The `currencyFormater(double amount)` will help us format money values into correct currency format
7. The entry point of the App is going in the `Main` class where the main logic i.e. the `teller()` object will invoke it's class method.