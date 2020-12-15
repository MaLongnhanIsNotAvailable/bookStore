package com.example.demo.dao;

import com.example.demo.model.Book;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface BookDao {
    int insertBook(UUID id, Book book);
    default int insertBook(Book book)
    {
        UUID id = UUID.randomUUID();
        insertBook(id,book);
        return insertBook(id, book);
    }

    List<Book> selectAllBook();

    Optional<Book> selectBookById(UUID id);

    int deleteBookById(UUID id);

    int updateBookById(UUID id, Book book);

}
