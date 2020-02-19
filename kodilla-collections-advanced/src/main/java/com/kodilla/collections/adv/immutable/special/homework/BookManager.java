package com.kodilla.collections.adv.immutable.special.homework;

import java.util.HashSet;
import java.util.Set;

public class BookManager{

    Set<Book> books = new HashSet<>();

    public void createBook(String title, String author){
        Book book = new Book(title, author);
        createBook(book);
    }

    public Set<Book> createBook(Book book){
        books.add(book);
        return books;
    }

    public Set<Book> getBooks() {
        return books;
    }
}
