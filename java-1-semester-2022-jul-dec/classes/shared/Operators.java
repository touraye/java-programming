import java.util.Scanner;

public class Operators {
    public static void main(String[] args) {
        Scanner number = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int num1 = number.nextInt(); // taking input from user
        System.out.println("Enter second number: ");
        int num2 = number.nextInt();
        boolean check = num1 > num2;
        boolean check2 = num1 < num2;
        boolean check3 = num1 <= num2;
        boolean isGreater = num1 >= num2;
        if(num1 >= num2){
            System.out.println(num1+ " is greater " +num2);
        } else {
            System.out.println(num1+ " is not greater than " + num2);
        }


//        System.out.println("Is " +num1+ " > " +num2+ " " +check);
//        System.out.println("Is " +num1+ " < " +num2+ " " +check2);
//        System.out.println("Is " +num1+ " <= " +num2+ " " +check3);
    }
}
