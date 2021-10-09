package br.ufpi.repository;

import java.util.List;

import br.ufpi.model.Book;

public interface BookRepository {
	
	public boolean register(Book book);
	public Book find(String bookName);
	public List<Book> findList();
	
}	
