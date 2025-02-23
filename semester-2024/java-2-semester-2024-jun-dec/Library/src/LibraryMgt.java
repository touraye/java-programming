package java2.Library.src;

import java2.Library.src.member.Librarian;
import java2.Library.src.member.User;
import java2.Library.src.resourse.Book;
import java2.Library.src.utils.Utils;
import types.BookType;
import types.UserType;

import java.util.Calendar;
import java.util.Date;

public class LibraryMgt {
    public static void main(String[] args) {
        Library library = new Library();
        Utils utils = new Utils();

        Librarian librarian1 = new Librarian(utils.personUuid(), "Lamin Faal", "lfaal@lb.gm", UserType.LIBERIAN);
        User user1 = new User(utils.personUuid(), "Mariama Bah", "mbah@gmail.com", UserType.USER);
        Book book1 = new Book(utils.bookUuid(), "Eloquent JS", "Dnail", new Date(2019, Calendar.MARCH, 22), BookType.MYSTERY);
        Book book2 = new Book(utils.bookUuid(), "Java One Way", "2ray", new Date(2020, Calendar.JANUARY, 22), BookType.NON_FICTION);
        Book book3 = new Book(utils.bookUuid(), "Mate River", "Dnail", new Date(2015, Calendar.DECEMBER, 22), BookType.POETRY);

        // perform some library task
        library.addBook(librarian1, book1);
        library.addBook(librarian1, book2);
        library.addBook(user1, book3);
    }
}
