package java1.classes.arrays;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // Student list
        String student1 = "Aisha A Cham";
        String student2 = "Samuel Kandeh";
        String student3 = "Saikou Seedia Sanneh";
        String student4 = "Alpha Bah";
        String student5 = "Modou Musa Njie";
        String student6 = "Tida Ceesay";
        String student7 = "Ebrima Nyassi";
        // [0,1,2,3,4,5,6]
        String[] studentList = new String[7];
        studentList[0] = student1;
        studentList[1] = student2;
        studentList[2] = student3;
        studentList[3] = student4;
        studentList[4] = student5;
        studentList[5] = student6;
        studentList[6] = student7;
        System.out.println("List of students:"+ Arrays.toString(studentList));
        System.out.println(studentList[6]);
        System.out.println(studentList.length);
        int lastElementOnTheArray = studentList.length - 1;
        System.out.println("Last element: " +studentList[lastElementOnTheArray]);
        System.out.println();
        //update first element
        studentList[0] = "Aisha Cham";
        studentList[2] = "Saikou Seedia";
        studentList[studentList.length - 1] = null;
//        // print the element using a for loop
        for(int i = 0; i < studentList.length; i++){
            System.out.println(studentList[i]); //[6]
        }



    }
}
