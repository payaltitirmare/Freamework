package com.springboot.book.services;

import java.util.*;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.book.Dao.BookRepository;
import com.springboot.book.entities.Book;

@Service
public class BookService {

	@Autowired
	private BookRepository bookrepo;
	
	/*
	 * public static List<Book> list = new ArrayList<>(); static{ list.add(new
	 * Book(12,"pppp","xyz")); list.add(new Book(16,"time of inida","www"));
	 * 
	 * }
	 */
	public List<Book> getAllBook()
	{
		List<Book> list=(List<Book>)this.bookrepo.findAll();
		
		return list;
	}
	
	public Book getbookbyid(int id)
	{
		Book book= null;
	 // book =list.stream().filter(e->e.getId()==id).findFirst().get(); return book;
		 
	   book = this.bookrepo.findById(id);
	    return book;
  }
		
	public Book addBook(Book b)
	{
		Book result =this.bookrepo.save(b);
		return result;
	}

	public void deletBook(int id) {
	    this.bookrepo.deleteById(id);	
	}

	public void updatebook(Book book, int id) {
		
		book.setId(id);
		this.bookrepo.save(book);
		}
	
}
