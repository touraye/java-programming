Java

## Assignment5

Modify our Q-Power Application:

Global variables are variable that can be accessible anywhere in your program. So create your below global variables before the if condition.

Hint:

With Q-Power if you are going to buy D35 for example, the service fee is D5, now you are left with D30. Qcell will buy you cash power of D30 from nawec

1. Initialize a global variable called `double kwh = 0.1;`
2. Initialize a global variable called `double serviceFee = 0;`
3. Initialize a global variable called `double unit= 0;`
4. Initialize a global variable called `double amount = 0;`
5. In `case "a":` create a local variable called `double purchasingAmount = 35;`
6. In `case "a":` reassign `serviceFee = 5;`
7. In case "a":` calculate the amount. Here you need do arithmetic to obtain the amount qcell will use to buy you cash power.
8. In `case "a":` calculate unit `kwh` variable multiple by the amount qcell will use to buy you cash power after remove their service fee
9. Replace the hard-coded value of  `puschasingAmount ServiceFee unit`
10. Repeat the thing for `case "b", case "c"` the service fee for these two cases are 10 instead.
11. Update the print statement for the two cases as well.

Happy Cracking!