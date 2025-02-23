package loops;

import java.util.Scanner;

public class WhileLoop {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        boolean flag = false;
        do {
            System.out.print("Enter your name");
            String name = in.nextLine();
            if(name.equalsIgnoreCase("n")){
                flag = true;
            }
            System.out.println(name);

        } while(!flag);
    }
}
