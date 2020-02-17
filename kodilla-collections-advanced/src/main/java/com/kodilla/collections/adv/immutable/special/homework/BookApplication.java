package com.kodilla.collections.adv.immutable.special.homework;

public class BookApplication {
    public static void main(String[] args) {
        BookManager bookManager = new BookManager();
        Book book1 = bookManager.createBook("Agile Development", "James Shore");
        Book book2 = bookManager.createBook("Design", "Peter Fiell");
        Book book3 = bookManager.createBook("Chris Voss", "Never split the differences");
        Book book4 = bookManager.createBook("Chris Voss", "Never split the differences");

        System.out.println(book3 == book4);
    }
}
