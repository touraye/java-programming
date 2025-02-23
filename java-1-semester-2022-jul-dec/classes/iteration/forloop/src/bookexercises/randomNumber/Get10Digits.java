package bookexercises.randomNumber;

import java.util.Random;
import java.util.Scanner;

public class Get10Digits {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Random random = new Random();
        System.out.print("Enter digits you want to start with: ");
        int startWith = in.nextInt();
        final int digits = 4;
        for(int i = 1; i <= digits; i++){
            System.out.print( +random.nextInt(startWith));
        }

    }
}
