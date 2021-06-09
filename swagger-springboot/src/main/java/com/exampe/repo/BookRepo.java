package com.exampe.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.exampe.model.Book;

public interface BookRepo extends JpaRepository<Book, Integer> {

	

}
