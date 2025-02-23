package investment;

import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args) {
        System.out.println("==========");
        Scanner in = new Scanner(System.in);
        boolean flag = false;
        double total =0;
        double add  = 0;
        do {
            System.out.print("Enter amount: ");
            double amount = in.nextDouble();
            add += amount;
            if(amount > 2000){
                flag = true;
            }
            total += sum(amount);
        } while(!flag);
        System.out.println("Total is " +total);
        System.out.println("Add " +add);
    }

    public static double sum(double amount){
        return amount;
    }
}
