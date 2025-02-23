package java1.classes.quizApp;

import java.util.Scanner;

public class Quiz {
    public static void main(String[] args) {
        System.out.println("************** QUIZ APP **************");
        Scanner in = new Scanner(System.in);
        int correct = 0;
        int wrong = 0;

        // Number: 1
        System.out.println("Read the question and choose the right option: 'A, B, C, or D");
        System.out.println("#1: Tuition-fee at the UOPeople?");
        System.out.println("A: UOPeople is a Tuition-free University and Books are given for free");
        System.out.println("B: UOPeople is a Tuition-free University, but students buy books");
        System.out.println("C: Book are given for free but Tuition is not free");
        System.out.println("D: No free tuition and no book are given for free");

        System.out.print("Choose your option: ");
        String ans1 = in.next();

        // check for question 1
        if(ans1.equalsIgnoreCase("a")){
            correct = correct + 1;
        } else {
            wrong = wrong  + 1;
        }

        System.out.println();
        System.out.println("#2: learning at UOPeople?");
        System.out.println("A: students login to their campus app and learn");
        System.out.println("B: students go school to attend lectures");
        System.out.println("C: students use video conferencing to join class");
        System.out.println("D: students login to their portal App");
        System.out.print("Choose your option: ");
        String ans2 = in.next();

        // check for question 1
        if(ans2.equalsIgnoreCase("a")){
            correct = correct + 1;
        } else {
            wrong = wrong  + 1;
        }

        System.out.println("You scored : " +correct+ "/5");

    } // end main
}
