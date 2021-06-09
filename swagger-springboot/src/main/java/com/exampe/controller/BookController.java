package com.exampe.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.exampe.model.Book;
import com.exampe.service.BookService;

import io.swagger.annotations.ApiOperation;









@RestController
@RequestMapping("/book")
public class BookController {
	
	@Autowired
	private BookService bookService;
	
	@PostMapping("/save")
	@ApiOperation(value="Save a Book and id is auto generated.")
	public String saveBook(@RequestBody Book book) 
	{
		return bookService.saveBook(book);
	}
	
	@GetMapping("/searchBook/{bId}")
	@ApiOperation(value="Search book by id")
	public Optional<Book> getBook(@PathVariable int bId) 
	{
		System.out.print(bId);
		return bookService.getBook(bId);
	}
	@ApiOperation(value="delete Book by Id")
	@DeleteMapping("/deleteBook/{bId}")
	public List<Book> deleteBook(@PathVariable int bId)
	{
		
		return bookService.removeBook(bId);
	}
	
	@PutMapping("/update")
	@ApiOperation(value="it is used to update a value")
	public Book update(@RequestBody Book book) 
	{
		return bookService.update(book);
		
	}
	
	
}
