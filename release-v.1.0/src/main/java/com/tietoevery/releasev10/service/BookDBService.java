package com.tietoevery.releasev10.service;

import com.tietoevery.releasev10.domain.Book;
import com.tietoevery.releasev10.repository.BookDBRepository;

import java.util.List;

public class BookDBService implements BookService{
    BookDBRepository bookDBRepository;

    public BookDBService(BookDBRepository bookDBRepository) {
        this.bookDBRepository = bookDBRepository;
    }
    @Override
    public Book addBook(Book book) {
        return bookDBRepository.save(book);
    }

    @Override
    public List<Book> listBooks() {
        return bookDBRepository.findAll();
    }

}
