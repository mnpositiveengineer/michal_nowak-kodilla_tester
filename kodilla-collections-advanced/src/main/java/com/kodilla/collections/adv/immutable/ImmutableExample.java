package com.kodilla.collections.adv.immutable;

public class ImmutableExample {
    public static void main(String[] args) {
        Book book = new Book("John Stewart", "The last chance");
        BookHacked bookHacked = (BookHacked) book;
        bookHacked.modifyTitle("new");
        System.out.println(book.getTitle());
    }
}
