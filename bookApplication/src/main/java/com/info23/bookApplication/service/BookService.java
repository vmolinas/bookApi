package com.info23.bookApplication.service;

import com.info23.bookApplication.domain.Book;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

public interface BookService {
    List<Book> getAllBooks();
    Book createBook(Book book);
}