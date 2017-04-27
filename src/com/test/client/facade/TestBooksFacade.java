package com.test.client.facade;

import java.util.List;

import com.test.api.Book;
import com.test.client.TestBooksClient;
import com.test.client.factory.TestBooksClientFactory;

public class TestBooksFacade {
	private final TestBooksClient client;
	
	public TestBooksFacade() {
		client = TestBooksClientFactory.createClient("http://localhost:8090/RestForce/rest/");
	}
	
	public List<Book> getAllBooks() {
		return client.getAllBooks();
	}
}
