package com.spring.bookstore.repository;

import com.spring.bookstore.entity.BookEntity;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface BookRepository extends CrudRepository<BookEntity, Integer> {
    List<BookEntity> findByNameContainingOrAuthorContaining(String name, String
            author);
}
