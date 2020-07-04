package com.kodilla.repository;

import com.kodilla.book.soap.Book;
import com.kodilla.book.soap.Genre;
import org.springframework.stereotype.Component;
import org.springframework.util.Assert;
import javax.annotation.PostConstruct;
import java.util.HashMap;
import java.util.Map;

@Component
public class BooksRepository {
    private static final Map<String, Book> books = new HashMap<>();

    @PostConstruct
    public void initData() {
        Book lotr = new Book();
        lotr.setSignature("1234MN");
        lotr.setTitle("LOTR");
        lotr.setAuthor("Tolkien");
        lotr.setYear(1960);
        lotr.setGenre(Genre.FANTASY);

        books.put(lotr.getSignature(), lotr);

        Book cormoran = new Book();
        cormoran.setSignature("3456HH");
        cormoran.setTitle("Cormoran");
        cormoran.setAuthor("Rowling");
        cormoran.setYear(2010);
        cormoran.setGenre(Genre.CRIME);

        books.put(cormoran.getSignature(), cormoran);

    }

    public Book findBook(String signature) {
        Assert.notNull(signature, "You have to specify the book's name");
        return books.get(signature);
    }
}
