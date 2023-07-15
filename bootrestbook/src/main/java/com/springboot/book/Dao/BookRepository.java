package com.springboot.book.Dao;

import org.springframework.data.repository.CrudRepository;

import com.springboot.book.entities.Book;

public interface BookRepository extends CrudRepository<Book,Integer> {

	public Book findById(int id);
	
}
