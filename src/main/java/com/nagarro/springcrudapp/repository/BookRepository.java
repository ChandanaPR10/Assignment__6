package com.nagarro.springcrudapp.repository;


import com.nagarro.springcrudapp.model.BookModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepository extends JpaRepository<BookModel, Integer> {

}
