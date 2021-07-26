package com.book.book.dtos;

public class UpsertBookDTO {

    private String author;
    private String bookTitle;

    public UpsertBookDTO() {}

    public UpsertBookDTO(String author, String bookTitle) {
        this.author = author;
        this.bookTitle = bookTitle;
    }

    public String getAuthor() {
        return author;
    }

    public String getBookTitle() {
        return bookTitle;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setBookTitle(String bookTitle) {
        this.bookTitle = bookTitle;
    }
}
