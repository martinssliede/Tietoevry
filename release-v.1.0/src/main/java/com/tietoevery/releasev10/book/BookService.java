package com.tietoevery.releasev10.book;

import com.tietoevery.releasev10.book.domain.Book;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class BookService {
    private final BookRepository bookRepository;

    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public synchronized Book addBook(Book book) {
        if (checkIfSameBook(book.getTitle(), book.getAuthor())) {
            throw new ResponseStatusException(HttpStatus.CONFLICT);
        } else {
            return bookRepository.save(book);
        }
    }

    public List<Book> listBooks(int pageNumber) {
        Pageable page = PageRequest.of(pageNumber, 50);
        return bookRepository.listBooks(page);
    }

    public boolean checkIfSameBook(String title, String author) {
        return bookRepository.findByTitleAndAuthor(title, author).isPresent();
    }
}
