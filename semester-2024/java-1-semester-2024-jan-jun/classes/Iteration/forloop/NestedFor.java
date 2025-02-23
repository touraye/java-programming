package java1.classes.Iteration.forloop;

public class NestedFor {
    public static void main(String[] args) {
        System.out.println("Right Angle Triangle");

        for(int i = 1; i <= 5; i++){
            for(int j = 0; j < i; j++){
                System.out.print("*");
            }

            System.out.println();
        }

        System.out.println();
        System.out.println("Left Angle Triangle");

        int row = 6;
        for(int i = 0; i < row; i++){

            for(int j = row - 1; j > 1; j--){
                System.out.print(" ");
            }

            for(int k = 0; k <= i; k++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
