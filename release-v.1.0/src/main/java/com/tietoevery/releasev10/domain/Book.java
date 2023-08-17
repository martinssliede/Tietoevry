package com.tietoevery.releasev10.domain;


import lombok.*;

@Getter
@Setter
@ToString
@EqualsAndHashCode

public class Book {
    private Long id;
    @NonNull
    private String title;
    @NonNull
    private String author;

    public Book(Long id, String title, String author) {
        this.id = id;
        this.title = title;
        this.author = author;
    }

    public Boolean isEqualToBook(Book other) {
        return getTitle().equals(other.title) &&
                getAuthor().equals(other.author);
    }
}
