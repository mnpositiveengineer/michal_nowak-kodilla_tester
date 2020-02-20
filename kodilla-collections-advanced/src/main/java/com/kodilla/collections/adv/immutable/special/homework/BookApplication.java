package com.kodilla.collections.adv.immutable.special.homework;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class BookApplication {
    public static void main(String[] args) {

        //tworzę obiekt klasy BookManager
        BookManager bookManager = new BookManager();

        //tworzę listę, której pozycje będę odczytywał przy porównaniu obiektów.
        List<Book> bookList = new ArrayList<>();

        //dodaję książki do kolekcji i do listy
        bookList.add(bookManager.createBook("Agile Development", "James Shore"));
        bookList.add(bookManager.createBook("Design", "Peter Fiell"));
        bookList.add(bookManager.createBook("Chris Voss", "Never split the differences"));
        bookList.add(bookManager.createBook("Chris Voss", "Never split the differences"));

        //porównuje dwa obiekty
        System.out.println(bookList.get(2).equals(bookList.get(3)));

        //porównuje dwa adresy obiektów
        System.out.println(bookList.get(2) == bookList.get(3));

        //tworzę kolekjcę książek, do której wrzucam metodę z innej klasy
        Set<Book> books = bookManager.getBooks();

        //pętlą for each wyświetlam każdy obiekt z kolekcji książek
        for (Book book : books){
            System.out.println(book);
        }
    }
}
