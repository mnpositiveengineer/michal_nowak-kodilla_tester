package com.kodilla.rest.controller;

import com.kodilla.rest.domain.BookDto;
import com.kodilla.rest.service.BookService;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.awt.print.Book;
import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class BookControllerTestSuite {

    BookService bookServiceMock = Mockito.mock(BookService.class);
    BookController bookController = new BookController(bookServiceMock);

    @Test
    public void shouldFetchBooks() {
        //given
        Mockito.when(bookServiceMock.getBooks()).thenReturn(Arrays.asList(new BookDto("Title 1", "Author 1")
                , new BookDto("Title 2", "Author 2")));
        //when
        List<BookDto> result = bookController.getBooks();
        //then
        assertThat(result).hasSize(2);
    }

    @Test
    public void shouldAddBook() {
        //when
        bookController.addBook(new BookDto("Title 1", "Author 1"));
        //then
        Mockito.verify(bookServiceMock, Mockito.times(1))
                .addBook(new BookDto("Title 1", "Author 1"));
    }
}