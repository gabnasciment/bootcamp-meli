package com.book.book.entities;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document(collection = "books")
public class Book {
    @Id
    private String id;
    private String autor;

    @Field(name = "book")
    private String bookTitle;

    public Book() {}

    public Book(String autor,
                String bookTitle) {
        this.autor = autor;
        this.bookTitle = bookTitle;
    }

    public String getId() {
        return id;
    }

    public String getAutor() {
        return autor;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getBookTitle() {
        return bookTitle;
    }

    public void setBookTitle(String bookTitle) {
        this.bookTitle = bookTitle;
    }
}

