package java1.classes.Iteration.forloop;

public class starts {
    public static void main(String[] args) {
        for(int i = 1; i <= 5; i++){
            for (int j = 1; j <= i; j++ ) {
                System.out.print("*");
            } // end if
            System.out.println();
            /*
            *
            **
            ***
            ****
            *****
            ******
             */
        } // end if

        System.out.println();
        int rows = 6;
        // Outer loop to iterate through rows
        for (int i = 0; i < rows; i++) {
            // Inner loop to print spaces
            for (int j = rows - i; j > 1; j--) { // running 5 times & lesser
                System.out.print(" ");
            }
            // Inner loop to print asterisks
            for (int k = 0; k <= i; k++) {
                System.out.print("*");
            }
            System.out.println(); // Move to the next line after each row
        }
    }
}
