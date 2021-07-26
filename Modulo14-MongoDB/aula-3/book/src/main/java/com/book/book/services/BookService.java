package com.book.book.services;

import com.book.book.dtos.BookDTO;
import com.book.book.dtos.UpsertBookDTO;
import com.book.book.entities.Book;
import com.book.book.repositories.BookRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class BookService {

    private final BookRepository bookRepository;

    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public Book findBookById(String idBook){
        return this.bookRepository.findById(idBook).orElseThrow(() ->
                new RuntimeException("Book with id "+idBook+" was not found."));
    }

    public List<BookDTO> getAllBooks(){
        return this.bookRepository.findAll()
                .stream()
                .map(BookDTO::toDTO)
                .collect(Collectors.toList());
    }

    public BookDTO getBookById(String idBook){
    Book book =  findBookById(idBook);
    return BookDTO.toDTO(book);
    }

    public BookDTO createBook(UpsertBookDTO upsertBookDTO){
        Book book = new Book(
                upsertBookDTO.getAuthor(),
                upsertBookDTO.getBookTitle()
        );

        Book savedBook = this.bookRepository.save(book);

        return BookDTO.toDTO(savedBook);
    }

    public BookDTO updateBook (String idBook,  UpsertBookDTO upsertBookDTO){
        Book book = findBookById(idBook);

        book.setAutor(upsertBookDTO.getAuthor());
        book.setBookTitle(upsertBookDTO.getBookTitle());

        Book savedBook = this.bookRepository.save(book);

        return BookDTO.toDTO(savedBook);
    }

    public void deleteBook(String bookId){
    //    Book book = findBookById(bookId);
        this.bookRepository.deleteById(bookId);
    }
}
