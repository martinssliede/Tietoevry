package com.tietoevery.releasev10.service;

import com.tietoevery.releasev10.domain.Book;
import org.springframework.http.HttpStatus;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

public interface BookService {
    public Book addBook(Book book);

    public List<Book> listBooks();

}
