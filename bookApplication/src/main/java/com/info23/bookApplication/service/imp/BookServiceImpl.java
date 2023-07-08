package com.info23.bookApplication.service.imp;

import com.info23.bookApplication.domain.Book;
import com.info23.bookApplication.service.BookService;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class BookServiceImpl implements BookService {
    Map<UUID, Book> bookMap;

    public BookServiceImpl(){
        bookMap = new HashMap<>();
        Book book = new Book();
        book.setId(UUID.randomUUID());
        book.setAuthor("Gabriel Garcia Marquez");
        book.setTitle("Cien años de soledada");

        Book book2 = new Book();
        book2.setId(UUID.randomUUID());
        book2.setAuthor("George Orwell");
        book2.setTitle("1984");

        Book book3 = new Book();
        book3.setId(UUID.randomUUID());
        book3.setAuthor("Antoine de Saint-Exupéry");
        book3.setTitle("El principito");

        bookMap.put(book.getId(), book);
        bookMap.put(book2.getId(), book2);
        bookMap.put(book3.getId(), book3);
    }
    @Override
    public List<Book> getAllBooks() {
        return new ArrayList<>(bookMap.values());
    }

    @Override
    public Book createBook(Book book) {
        book.setId(UUID.randomUUID());
        bookMap.put(book.getId(), book);
        return book;
    }
}