package com.book.book.Controllers;

import com.book.book.dtos.BookDTO;
import com.book.book.dtos.UpsertBookDTO;
import com.book.book.services.BookService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/books")
public class BookController {

    private final BookService bookService;

    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    @GetMapping
    public List<BookDTO> getBooks(){
        return this.bookService.getAllBooks();
    }

    @GetMapping("{idBook}")
    public BookDTO getBookById(@PathVariable String idBook){
        return this.bookService.getBookById(idBook);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public BookDTO createBook(@RequestBody UpsertBookDTO upsertBookDTO){
        return this.bookService.createBook(upsertBookDTO);
    }

    @PutMapping("{bookId}")
    public BookDTO updateBook(@PathVariable String bookId, @RequestBody UpsertBookDTO upsertBookDTO){
        return this.bookService.updateBook(bookId, upsertBookDTO);
    }

    @DeleteMapping("{bookId}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteBook(@PathVariable String bookId){
        this.bookService.deleteBook(bookId);
    }
}
