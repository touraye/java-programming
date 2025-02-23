package java1.classes.quizApp;

import java.util.Scanner;
public class Tester {
    static int wrongs;
    static int invalidOption;
    static void questionChecker(String question, int wrongs, int invalidOption){
        switch (question){
            case "b", "B", "c", "C", "d", "D" -> Tester.wrongs += 1;
            default -> Tester.invalidOption += 1;
        }
        System.out.println("In - Question1: "+question + " Wrongs: " +Tester.wrongs+ " invalid option: " +Tester.invalidOption);
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int points = 0; // to keep track of how many correct option user has chosen
        int wrongs = 0; // to keep track of how man wrong option user has chosen
        int invalidOption = 0; // to give track of the invalid option the user has chosen
        System.out.println("********** Quiz App **********");
        System.out.println("Read the question and choose the right option: 'A, B, C, or D");
// #1
                System.out.println("#1: Tuition-fee at the UOPeople?");
        System.out.println("A: UOPeople is a Tuition-free University and Books are given for free");
        System.out.println("B: UOPeople is a Tuition-free University, but students buy books");
                System.out.println("C: Book are given for free but Tuition is not free");
        System.out.println("A: No free tuition and no book are given for free");
        System.out.print("Choose your option: ");
        String question1 = input.next();
        if (question1.equalsIgnoreCase("a")){ // if the user type in 'a' or 'A'
            points += 1;
        } else {

            questionChecker(question1, Tester.wrongs, Tester.invalidOption);
            System.out.println("Question1: "+question1 + " Wrongs: " +Tester.wrongs+ " invalid option: " +Tester.invalidOption);//            switch (question1){
//                case "b", "B", "c", "C", "d", "D" -> wrongs += 1;
//                default -> invalidOption += 1;
//            }
        }
// #2
        System.out.println();
        System.out.println("#2: learning at UOPeople?");
        System.out.println("A: students login to their campus app and learn");
        System.out.println("B: students go school to attend lecture");
        System.out.println("C: students use video conferencing to join class");
        System.out.println("D: students login to their portal App");
        System.out.print("Choose your option: ");
        String question2 = input.next();
        if (question2.equalsIgnoreCase("a")){ // if the user type in 'a' or 'A'
            points += 1;
        } else {
            switch (question2){
                case "b", "B", "c", "C", "d", "D" -> wrongs += 1;
                default -> invalidOption += 1;
            }
        }
// # 3
        System.out.println();
        System.out.println("#3: Peer-to-Peer learning at UOPeople?");
        System.out.println("A: Students learn in the same classroom");
        System.out.println("B: UOPeople provides a learning environment that felicitates peer-to-peer learning");
        System.out.println("C: UOP provides internet connection for their students");System.out.println("D: None of the above");
        System.out.print("Choose your option: ");
        String question3 = input.next();
        if (question3.equalsIgnoreCase("b")){ // if the user type in 'b' or 'B'
            points += 1;
        } else {
            switch (question3){
                case "a", "A", "c", "C", "d", "D" -> wrongs += 1;
                default -> invalidOption += 1;
            }
        }
// # 4
        System.out.println();
        System.out.println("#4: UOPeople learning style?");
        System.out.println("A: Any student can learn at UOP");
        System.out.println("B: Student only need to have a phone");
        System.out.println("C: Instructors call student for their lessons");
        System.out.println("D: None of the above");
        System.out.print("Choose your option: ");
        String question4 = input.next();
        if (question4.equalsIgnoreCase("d")){ // if the user type in 'd' or 'D'
            points += 1;
        } else {
            switch (question4){
                case "a", "A", "b", "B", "c", "C" -> wrongs += 1;
                default -> invalidOption += 1;
            }
        }
// #5
        System.out.println();
        System.out.println("#5: UOPeoples Exams?");
        System.out.println("A: Exams happen at the first week of the term");
        System.out.println("B: Students do not sit java1.exams at UOPeople");
        System.out.println("C: Exams happen at the final week out the term");
        System.out.println("D: Student send email as their final paper");
        System.out.print("Choose your option: ");
        String question = input.next();
        if (question.equalsIgnoreCase("c")){ // if the user type in 'c' or 'C'
            points += 1;
        } else {
            switch (question){
                case "a", "A", "b", "B", "d", "D" -> wrongs += 1;
                default -> invalidOption += 1;
            }
        }
        System.out.println();// create empty line
        int percentage = (points * 100) / 5; // calculate points in percentage
        System.out.println("****** Quiz Summary *******");
        System.out.println("Correct option: " +points);
        System.out.println("Incorrect option: " +wrongs);
        System.out.println("Invalid option: " +invalidOption);
        System.out.println("Your total score: " +points+ " out of 5");
        System.out.println("Point in percentage: " +percentage+"%");
    }
}
