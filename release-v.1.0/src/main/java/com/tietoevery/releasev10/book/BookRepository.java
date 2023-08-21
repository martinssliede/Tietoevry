package com.tietoevery.releasev10.book;

import com.tietoevery.releasev10.book.domain.Book;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface BookRepository extends JpaRepository<Book, Long> {
    Optional<Book> findByTitleAndAuthor(String title, String author);

    @Query
            ("SELECT b FROM Book b ORDER BY b.id DESC")
    List<Book> listBooks(Pageable pageable);
}
