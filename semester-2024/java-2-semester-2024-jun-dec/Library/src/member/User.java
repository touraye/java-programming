package java2.Library.src.member;

import java2.Library.src.resourse.Book;
import java2.Library.src.utils.MyStack;
import types.UserType;


public class User extends Person {
    MyStack stack; // Person has a Deck(has-a relationship)
    public User(String id, String name, String email, UserType type) {
        super(id, name, email, type);
    }

    Book readBook(Book book){
        return  stack.push(book);
    }


}
