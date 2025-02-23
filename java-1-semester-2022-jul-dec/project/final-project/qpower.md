# Java1 Final Project2

project name: **EPower App**

## Requirement Analysis

* This application should allow tellers(users) to buy cash-power for customers with any desired amount.

* Lets assume we have only five customers registered with our cash power system. You can create a variable that will hold the following customers and their meters:

  ```java
  Customer name			meter number
  Modou Mbye				092001
  Fanta Jobe				092002
  Haddy Jammeh			092003
  Peter Mendy				092004
  Yahya Badjie			092005
  ```

* The user(teller) should been show a list customers in a dropdown where he/she can select the name of customer who is buying cash-power and then the amount.

* When a teller select a particular customer who's buying cash-power you should get the position of the customer and find also find the corresponding meter number.

* Teller should be show the customer whom they are buying cash-power for(the name of the customer)

* No customer can purchased a cash power with amount less GMD50, your program should able to prompt teller's *error message* and keep running, and your program should not crash because wrong input by teller. You should handle all exceptions

* The EPower service has charges fee of different ranges:

  ```java
  Range			Charges
  <= 150				3
  <= 350   			6
  <= 1000				8
  > 1000				10    
  ```

  Your program should deduct charges from the amount before buying cash power

* After buying cash power successfully your program should generate random token numbers of 20 digits(4 digits together). see demo below:

  ```java
  Customer Name: Yahya Badjie
  Meter Number:  092005
  Power Amount:  GMD400.00
  Service Fee :  GMD6.00
  Token		: 6044 3371 4771 8829 9899
  Units		: 20.30kwh
  Date		: 20-12-2022 15:35:22
  ```

  

Happy coding!