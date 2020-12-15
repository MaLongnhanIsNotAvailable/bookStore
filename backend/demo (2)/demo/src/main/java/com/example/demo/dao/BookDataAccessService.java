package com.example.demo.dao;

import com.example.demo.model.Book;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Repository("postgres")
public class BookDataAccessService implements BookDao{
    @Override
    public int insertBook(UUID id, Book book) {
        return 0;
    }

    @Override
    public List<Book> selectAllBook() {
        return List.of(new Book(UUID.randomUUID(), "from Postgres DB"));
    }

    @Override
    public Optional<Book> selectBookById(UUID id) {
        return Optional.empty();
    }

    @Override
    public int deleteBookById(UUID id) {
        return 0;
    }

    @Override
    public int updateBookById(UUID id, Book book) {
        return 0;
    }
}
