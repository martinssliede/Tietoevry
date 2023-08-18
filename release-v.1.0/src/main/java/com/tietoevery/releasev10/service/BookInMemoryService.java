package com.tietoevery.releasev10.service;

import com.tietoevery.releasev10.domain.Book;
import com.tietoevery.releasev10.repository.BookRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class BookInMemoryService implements BookService {
    private BookRepository bookRepository;

    public BookInMemoryService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public synchronized Book addBook(Book book) {
        if (checkIfSameBook(book)) {
            throw new ResponseStatusException(HttpStatus.CONFLICT);
        } else {
            return bookRepository.addBook(book);
        }
    }

    public List<Book> listBooks() {
        return bookRepository.listBooks();
    }

    public boolean checkIfSameBook(Book book) {
        return bookRepository.listBooks().stream().anyMatch(b -> b.isEqualToBook(book));
    }
}
