package com.exampe.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.exampe.model.Book;
import com.exampe.repo.BookRepo;

@Service
public class BookService {
		
		@Autowired
		private BookRepo bookRepo;
		
		public String saveBook(Book book) 
		{
			bookRepo.save(book);
			return "book save with id" +book.getbId();
		}
		
		public Optional<Book> getBook(int bId) 
		{
			return bookRepo.findById(bId);
		}
		
		public List<Book> removeBook(int bId)
		{
			bookRepo.deleteById(bId);
			return bookRepo.findAll();
		}

		public Book update(Book book) {
			// TODO Auto-generated method stub
			return bookRepo.save(book);
		}
		
}
