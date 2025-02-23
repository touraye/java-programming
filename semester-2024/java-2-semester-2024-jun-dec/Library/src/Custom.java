package java2.Library.src;

import java2.Library.src.member.Person;
import java2.Library.src.resourse.Book;

public interface Custom {
    // add a book
    boolean addBook(Person person, Book book);
    boolean borrowBook(Person librarian, Book book, Person borrower);
    boolean returnBook(Book book);
}
