package input;

import java.util.Scanner;

public class TakeInput {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your lucky number");
        int counter = input.nextInt();

        for (int i = 0; i <= counter; i++){
            System.out.println(i);
            if(i == 5){
                break;
            }
            System.out.println("We are still printing " +i);
        }
    }
}
