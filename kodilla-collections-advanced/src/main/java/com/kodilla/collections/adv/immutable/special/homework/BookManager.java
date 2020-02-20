package com.kodilla.collections.adv.immutable.special.homework;

import java.util.HashSet;
import java.util.Set;

public class BookManager{

    // tworzę kolekcję książek (książki nie mogą się powtarzać)
    private Set<Book> books = new HashSet<>();

    //tworzę metodę, która dodaję obiekt do kolekcji i zwraca kolekcję.
    public Book createBook(String title, String author){
        books.add(new Book(title,author));
        return new Book(title, author);
    }

    //getter na kolekcję
    public Set<Book> getBooks() {
        return books;
    }
}
