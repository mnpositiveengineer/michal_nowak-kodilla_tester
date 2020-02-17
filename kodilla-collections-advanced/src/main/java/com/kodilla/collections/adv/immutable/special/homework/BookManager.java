package com.kodilla.collections.adv.immutable.special.homework;

import java.util.HashSet;
import java.util.Set;

public class BookManager{

    Set<Book> books = new HashSet<>();

    public Book createBook(String title, String author){
        books.add(new Book (title, author));
        return new Book(title, author);
    }
}
