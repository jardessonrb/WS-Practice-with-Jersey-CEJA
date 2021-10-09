package br.ufpi.controller;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

import br.ufpi.model.Book;
import br.ufpi.repository.BookRepository;
import br.ufpi.repository.RepositoryBookMemory;


@Path("livro")
public class BookResource {
	BookRepository databaseInMemory = new RepositoryBookMemory();
	
	
	@POST
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public Response registerBook(Book book) {
		databaseInMemory.register(book);
		System.out.println(book);
		System.out.println(databaseInMemory.findList());
		return Response.status(Status.CREATED).entity(book).build();
	}
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Response findList(@QueryParam("name") String name) {
		if(name != null) {
			Book book = databaseInMemory.find(name);
			return Response.status(Status.OK).entity(book).build();
		}
		
		List<Book> bookList = databaseInMemory.findList();
		return Response.status(Status.OK).entity(bookList).build();
	}
}
