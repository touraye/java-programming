package java2.Library.src.utils;

import java2.Library.src.resourse.Book;

public class MyStack {
    Book[] deck;
    final int DEFAULT_SIZE = 5;
    int pointer = -1;

    public MyStack(){
        deck = new Book[DEFAULT_SIZE];
    }

    public Book push(Book book){
        if(isFull()){
            return null;
        }

        this.pointer++;
        this.deck[this.pointer] = book;

        return book;
    }

    public boolean isFull() {
        return this.pointer == this.deck.length - 1;
    }
}
