package com.info23.bookApplication.service;

import com.info23.bookApplication.domain.Book;

import java.util.List;
import java.util.UUID;

public interface BookService {
    List<Book> getAllBooks();
    Book createBook(Book book);

    Book updateBook(UUID idBook, Book bookUpdated);
}