package com.tietoevery.releasev10.repository;

import com.tietoevery.releasev10.domain.Book;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class BookRepository {
    private Long id = 1L;

    public List<Book> listBooks = new ArrayList<>();

    public Book addBook(Book book) {
        book.setId(id);
        listBooks.add(book);
        id++;
        return book;
    }

    public List<Book> listBooks() {
        return listBooks;
    }

}
