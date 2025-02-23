package grading;

import java.util.Scanner;

public class StudentGrade {
    public static void main(String[] args) {
        System.out.println("======== Student Grading System ========");
        System.out.println("Marks      |   Distinctions");
        System.out.println("90 - 100   |    A");
        System.out.println("75 - 89    |    B");
        System.out.println("60 - 74    |    C");
        System.out.println("49 - 59    |    D");
        System.out.println("40 - 48    |    E");
        System.out.println("0  - 39    |    F");
        Scanner input = new Scanner(System.in);
        System.out.print("Enter student mark: ");
        int mark = input.nextInt();

        if(mark >= 90 && mark <= 100){
            System.out.println("A Student : " +mark);
        } else if(mark >= 75 && mark <= 89){
            System.out.println("B Student: " +mark);
        } else if(mark >= 60 && mark <= 74){
            System.out.println("C Student: " +mark);
        }   else if(mark >= 49 && mark <= 59){
            System.out.println("D Student: " +mark);
        }  else if(mark >= 40 && mark <= 48){
            System.out.println("E Student: " +mark);
        } else {
            System.out.println("F Student: " +mark);
        }


    }
}
