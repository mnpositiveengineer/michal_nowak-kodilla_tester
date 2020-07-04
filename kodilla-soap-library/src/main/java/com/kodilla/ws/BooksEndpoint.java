package com.kodilla.ws;

import com.kodilla.book.soap.GetBookRequest;
import com.kodilla.book.soap.GetCourseResponse;
import com.kodilla.repository.BooksRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

@Endpoint
public class BooksEndpoint {
    private static final String NAMESPACE_URI = "http://kodilla.com/book/soap"; //musi odpowiadać przestrzeni nazw w pliku xsd

    private BooksRepository booksRepository;

    @Autowired
    public BooksEndpoint(BooksRepository booksRepository) {
        this.booksRepository = booksRepository;
    }

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "getBookRequest")
    @ResponsePayload
    public GetCourseResponse getBook(@RequestPayload GetBookRequest request) {
        GetCourseResponse response = new GetCourseResponse();
        response.setBook(booksRepository.findBook(request.getSignature()));

        return response;
    }


}

