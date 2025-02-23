package java2.Library.src;

import java2.Library.src.member.Person;
import java2.Library.src.resourse.Book;
import java2.Library.src.utils.Checker;
import java2.Library.src.utils.Store;
import types.UserType;

import java.util.ArrayList;
import java.util.List;

public class Library implements Custom {
    // Library books should store in a set
    // this will stop us from adding duplicate books
    private List<Book> books;
    private ArrayList<Book> borrowedBooks;
    Checker checker = new Checker();

    public Library(){
        books = new ArrayList<>();
        borrowedBooks = new ArrayList<>();
    }

    /**
     * This method will allow member (LIBERIAN) of the Library to add a book to the Library
     * @param person who's adding a book to the Library
     * @param book which will be added to the Library
     * @return false if a person is unauthorized otherwise true
     */
    @Override
    public boolean addBook(Person person, Book book) {
        // unauthorized person
        if(!person.getType().equals(UserType.LIBERIAN)){
            System.out.println("Fail to add " +book.getTitle());
            System.out.println("Unauthorized person! Cannot add book to the Library.");
            return false;
        }

        System.out.println(book.getTitle()+" added successfully");
        // authorized person
        Store.books.put(book.getId(), book);
        return true;
    }

    @Override
    public boolean borrowBook(Person librarian, Book book, Person borrower) {
        // unauthorized peron
         //checker.isLiberian(!librarian.getType().equals(UserType.LIBERIAN))
        if(checker.isLiberian(!librarian.getType().equals(UserType.LIBERIAN))){
            System.out.println("Unauthorized person! Cannot borrow a book out.");
            return false;
        }

        // check whether book is borrowed
        if(book.getBorrowed()){
            System.out.println("This is borrowed! Cannot borrow unreturned book.");
            return false;
        }

        // Check the borrower, a book can only be borrowed from a USER member
        if(!borrower.getType().equals(UserType.USER)){
            System.out.println("Unauthorized person! Cannot borrow a book out to a non USER.");
            return false;
        }


        return true;
    }

    @Override
    public boolean returnBook(Book book) {
        return false;
    }
}
