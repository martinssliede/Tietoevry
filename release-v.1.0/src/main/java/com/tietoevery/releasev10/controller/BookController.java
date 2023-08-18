package com.tietoevery.releasev10.controller;

import com.tietoevery.releasev10.domain.Book;
import com.tietoevery.releasev10.service.BookInMemoryService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class BookController {

    private BookInMemoryService bookInMemoryService;

    public BookController(BookInMemoryService bookInMemoryService) {
        this.bookInMemoryService = bookInMemoryService;
    }

    @PutMapping("/admin/addBook")
    @ResponseStatus(HttpStatus.CREATED)
    public Book addBook(@RequestBody Book book) {
        return bookInMemoryService.addBook(book);
    }
    @GetMapping("/admin/books")
    public List<Book> listBooks() {
        return bookInMemoryService.listBooks();
    }
}
