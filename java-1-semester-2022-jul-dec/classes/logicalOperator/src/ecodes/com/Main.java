package ecodes.com;

public class Main {

    public static void main(String[] args) {
        System.out.println("================================");
        System.out.println("Logical Operators in Java");
        System.out.println("Operator   |  Symbol  | Example      |   Answer   |");
        System.out.println("AND        |     &&   | true && true |   true     |");
        System.out.println("OR         |     ||   | true || false |   true    |");
        System.out.println("NOT        |     !    | !true         |   false   |");
        System.out.println("================================");

        int firstValue = 2;
        int secondValue = 5;
        int thirdValue = 9;
        int fourthValue = 1;
        boolean checking =  firstValue <= secondValue;
        boolean checking2 = thirdValue == fourthValue;
        boolean checking3 =!( firstValue <= secondValue && thirdValue == fourthValue);
        System.out.println("is not " +firstValue+ " <= " +secondValue+ " " +checking);
        System.out.println("is " +thirdValue+ " == " +fourthValue+ " " +checking2);
        System.out.println(" " +checking3);
    }
}
