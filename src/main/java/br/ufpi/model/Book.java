package br.ufpi.model;

import java.io.Serializable;

public class Book implements Serializable{
	
	@Override
	public String toString() {
		return "Livro [id=" + id + ", name=" + name + ", author=" + author + ", publishingCompany=" + publishingCompany
				+ "]";
	}

	private static final long serialVersionUID = 1L;
	private Long id;
	private String name;
	private String author;
	private String publishingCompany;
	
	public Book() {}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getPublishingCompany() {
		return publishingCompany;
	}

	public void setPublishingCompany(String publishingCompany) {
		this.publishingCompany = publishingCompany;
	}
	
	

}
