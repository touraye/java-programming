package bookexercises;

import java.util.Scanner;

public class FindCapCharactersInStrings {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Type any word to count how many uppercase is there: ");
        String str = input.next();
        int upperCaseCounter = 0;
        for(int i = 0; i < str.length(); i++){
            char ch = str.charAt(i);//Lamin
            if(Character.isUpperCase(ch)){
                upperCaseCounter++;
            }
        }
        /*
            Here we are using a for loop to go through a series of character which is typed from the keyboard
            We keep each character and store in a variable called ch which is a type char
            The if condition is checking whether there is any uppercase in the
         */

        System.out.println(upperCaseCounter > 1 ? "There are "
                +upperCaseCounter+ " uppercase in " +str :
                "There is " +upperCaseCounter+ " uppercase in " +str);
    }
}
