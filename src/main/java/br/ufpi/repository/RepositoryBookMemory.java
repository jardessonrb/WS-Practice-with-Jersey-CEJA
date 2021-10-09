package br.ufpi.repository;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import br.ufpi.model.Book;

public class RepositoryBookMemory implements BookRepository{
	
	private static List<Book> bookList; 
	
	public RepositoryBookMemory() {
		if(bookList == null) {
			bookList = new ArrayList<Book>();
		}
	}
	
	@Override
	public boolean register(Book book) {
		bookList.add(book);
		return true;
	}

	@Override
	public Book find(String bookName) {
		for (Book book : bookList) {
			if(book.getName().equals(bookName)) {
				return book;
			}
		}
		return null;
	}

	@Override
	public List<Book> findList() {
		return bookList;
	}

}
