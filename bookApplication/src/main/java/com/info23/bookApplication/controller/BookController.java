package com.info23.bookApplication.controller;

import com.info23.bookApplication.domain.Book;
import com.info23.bookApplication.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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
}