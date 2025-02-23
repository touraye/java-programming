package list;

import java.util.Scanner;

public class Labs {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        do {

            System.out.print("Enter detail: ");
            int data = in.nextInt();

            System.out.print("Type 1 to continue or A-Z to cancel");
        } while(in.hasNextInt());
    }
}
