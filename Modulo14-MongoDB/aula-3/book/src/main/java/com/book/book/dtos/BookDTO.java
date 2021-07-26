package com.book.book.dtos;

import com.book.book.entities.Book;

public class BookDTO {
    private String id;
    private String autor;
    private String bookTitle;

    public BookDTO() {}

    public BookDTO(String id, String autor, String bookTitle) {
        this.id = id;
        this.autor = autor;
        this.bookTitle = bookTitle;
    }

    public String getId() {
        return id;
    }

    public String getAutor() {
        return autor;
    }

    public String getBookTitle() {
        return bookTitle;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setBookTitle(String bookTitle) {
        this.bookTitle = bookTitle;
    }

    public static BookDTO toDTO(Book book){
        return new BookDTO(book.getId(),book.getAutor(), book.getBookTitle());
    }
}
