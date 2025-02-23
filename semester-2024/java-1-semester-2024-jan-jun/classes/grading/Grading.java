package java1.classes.grading;

import java.util.Scanner;

public class Grading {
    public static void main(String[] args) {
        System.out.println("*********************Grading System!*********************");

        Scanner input = new Scanner(System.in);

        System.out.print("Enter student grade: ");
        int mark = input.nextInt();

        // process student grades
        if(mark >= 80 && mark <= 100){
            // which A student are you?
            if(mark >= 98){
                System.out.println("A positive student");
            } else if(mark >= 93){
                System.out.println("A neutral student");
            } else {
                System.out.println("A negative student");
            }

        } else if(mark >= 70 && mark <= 79){
            System.out.println("B Student");
        } else if (mark >= 60 && mark <= 69){
            // C student
            System.out.println("C Student");
        } else if(mark >= 50 && mark <= 59) {
            System.out.println("D Student");
        } else if (mark >= 40 && mark <= 49) {
            System.out.println("E Student");
        } else {
            System.out.println("F Student");
        }


    }
}
