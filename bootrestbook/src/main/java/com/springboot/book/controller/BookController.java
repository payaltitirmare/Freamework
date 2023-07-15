package com.springboot.book.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.springboot.book.entities.Book;
import com.springboot.book.services.BookService;

@RestController
public class BookController {

	@Autowired
	private BookService bookService;
	//read all data
	//@RequestMapping(value="/books",method=RequestMethod.GET)
	@GetMapping("/books")  //this is solution for requestmapping so instead of that this can be used for get method
	public ResponseEntity<List<Book>> getbook()
	{
		List<Book> list =this.bookService.getAllBook();
		if(list.size()<=0)
		{
			return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
		}
		return ResponseEntity.of(Optional.of(list));
	}
	
	//read specific
	@GetMapping("/books/{id}")
	public ResponseEntity<Book> getBook(@PathVariable("id")int id)
	{
		Book book = bookService.getbookbyid(id);
		if(book==null)
		{
			return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
		}
		return ResponseEntity.of(Optional.of(book));
	}
	
	//create
	@PostMapping("/books")
	public ResponseEntity<Book> addBook(@RequestBody Book book)
	{
		try {
		Book b=null;
		 b =this.bookService.addBook(book);
		 return ResponseEntity.of(Optional.of(b));
		}
		catch(Exception e)
		{
			e.printStackTrace();
			 return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
		}
		
	}
	//delete
	@DeleteMapping("/books/{id}")
	public ResponseEntity<Void> deletbook(@PathVariable("id")int id )
	{
		try {
		this.bookService.deletBook(id);
		return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
		}
		catch(Exception e)
		{
			e.printStackTrace();
			 return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
				
		}
	}
	
	@PutMapping("/books/{id}")
	public ResponseEntity<Book> updatebook(@RequestBody Book book,@PathVariable("id")int id )
	{
		try {
		this.bookService.updatebook(book,id);
		return ResponseEntity.ok().body(book);
		}
		catch(Exception e)
		{
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
		}
	}
	
	
}
