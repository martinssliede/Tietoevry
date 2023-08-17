package com.tietoevery.releasev10.controller;

import com.tietoevery.releasev10.domain.Book;
import com.tietoevery.releasev10.service.BookService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class BookController {

    private BookService bookService;

    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    @PutMapping("/admin/addBook")
    @ResponseStatus(HttpStatus.CREATED)
    public Book addBook(@RequestBody Book book) {
        return bookService.addBook(book);
    }
    @GetMapping("/admin/books")
    public List<Book> listBooks() {
        return bookService.listBooks();
    }
}
