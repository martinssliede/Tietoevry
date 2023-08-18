package com.tietoevery.releasev10.domain;


import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@ToString
@EqualsAndHashCode

@Entity
@Table(name = "books")
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "book_id")
    private Long id;
    @NonNull
    @Column(name = "title")
    private String title;
    @NonNull
    @Column(name = "author")
    private String author;

    public Book(Long id, String title, String author) {
        this.id = id;
        this.title = title;
        this.author = author;
    }
    public Book() {
    }

    public Boolean isEqualToBook(Book other) {
        return getTitle().equals(other.title) &&
                getAuthor().equals(other.author);
    }
}
