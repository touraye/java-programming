package list;

import java.util.ArrayList;
import java.util.Scanner;

public class AList {
    public static void main(String[] args) {
        ArrayList name = new ArrayList();
        ArrayList book = new ArrayList();
        Scanner in = new Scanner(System.in);
        System.out.println("Is book array empty " +book.isEmpty());
        book.size();



        name.add("lamin");
        name.add("fatou");
        name.add("mariama");
        name.add("alieu");

        System.out.println(name);
        System.out.println(name.size());
        for(int i = 0; i < 4; i++){
            System.out.print("Enter the name of the books you read: ");
            String books = in.nextLine();
            book.add(books);
        }
        System.out.println("Books " +book);
    }
}
