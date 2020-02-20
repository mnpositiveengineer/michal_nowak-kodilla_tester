package com.kodilla.collections.adv.immutable.special.homework;

import java.util.Set;

public class BookApplication {
    public static void main(String[] args) {

        //tworzę obiekt klasy BookManager
        BookManager bookManager = new BookManager();

        //dodaję książki do kolekcji
        bookManager.createBook("Agile Development", "James Shore");
        bookManager.createBook("Design", "Peter Fiell");
        bookManager.createBook("Chris Voss", "Never split the differences");
        bookManager.createBook("Chris Voss", "Never split the differences");

        //porównuje dwa obiekty
        System.out.println(bookManager.createBook("Chris Voss", "Never split the differences").equals(bookManager.createBook("Chris Voss", "Never split the differences")));

        //porównuje dwa adresy obiektów
        System.out.println(bookManager.createBook("Chris Voss", "Never split the differences") == bookManager.createBook("Chris Voss", "Never split the differences"));

        //tworzę kolekjcę książek, do której wrzucam metodę z innej klasy
        Set<Book> books = bookManager.getBooks();

        //pętlą for each wyświetlam każdy obiekt z kolekcji książek
        for (Book book : books){
            System.out.println(book);
        }


    }
}
