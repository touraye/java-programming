package java1.classes.logicalOperator;

public class Main {
    public static void main(String[] args) {
        /* Logical Operator*/
        /* AND(&&)
            OR(||)
            NOT(!)
         */
        boolean check1 = 2 > 5 && 3 >= 5;
        boolean check2 = 2 > 1 || 4 >= 5;
        boolean check3 = !(2 > 5 && 3 >= 5);
        boolean check4 = !(!(2 > 5) && 3 >= 5);
        // 2 > 5 && 3 >= 5
        // !F && F
        // T && F
        // !F
        // T

        System.out.println("2 > 5 && 3 >= 5: " +check1);
        System.out.println("2 > 1 || 4 >= 5: " +check2);
        System.out.println("!(2 > 5 && 3 >= 5): " +check3);
        System.out.println("!(!(2 > 5) && 3 >= 5): " +check4);
    }
}
