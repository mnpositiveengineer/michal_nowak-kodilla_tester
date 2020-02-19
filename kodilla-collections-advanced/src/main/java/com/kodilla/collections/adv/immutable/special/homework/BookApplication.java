package com.kodilla.collections.adv.immutable.special.homework;

import java.util.Set;

public class BookApplication {
    public static void main(String[] args) {
        BookManager bookManager = new BookManager();
        bookManager.createBook("Agile Development", "James Shore");
        bookManager.createBook("Design", "Peter Fiell");
        bookManager.createBook("Chris Voss", "Never split the differences");
        bookManager.createBook("Chris Voss", "Never split the differences");

        Set<Book> books = bookManager.getBooks();

        for (Book book : books){
            System.out.println(book);
        }


    }
}
