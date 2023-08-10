package com.info23.bookApplication.controller;

import com.info23.bookApplication.domain.Book;
import com.info23.bookApplication.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
//@RequestMapping("/api/v1/book")
public class BookController {

    //IoC Inversion de control
    BookService bookService;

    @Autowired
    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    @GetMapping("/api/v1/book")
    public List<Book> getAllBooks(){
        return bookService.getAllBooks();
    }

    @PostMapping("/api/v1/book")
    public Book createBook(@RequestBody Book book){
        return bookService.createBook(book);
    }

    @PutMapping("/api/v1/book/{idBook}")
    public String updateBook(@PathVariable(value = "idBook")UUID idBook, @RequestBody Book bookUpdated){
        Book book = bookService.updateBook(idBook,bookUpdated);
        if (book == null){
            return "Book not found";
        }else {
            return "/api/v1/book"+book.getId();
        }
    }
}