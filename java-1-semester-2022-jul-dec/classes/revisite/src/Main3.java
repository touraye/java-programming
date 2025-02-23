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
        //check whether mark is above or is 50 then assign true to hasPassed otherwise false
        if(mark >= 50){
            hasPassed = true;
        } else {
            hasPassed = false;
        }

//        System.out.println(hasPassed ? " Mark is more or equals to 50 " +
//                "" : " Mark is less than 50");
        if(hasPassed){
            System.out.println("mark is more or equals to 50");
        } else {
            System.out.println("mark is less than 50");
        }
    }
}
