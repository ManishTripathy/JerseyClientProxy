package com.test;

import java.util.List;

import com.test.api.Book;
import com.test.client.facade.TestBooksFacade;

public class TestBooksMainClass {
	public static void main(String[] args) {
		TestBooksFacade facade = new TestBooksFacade();
		List<Book> books = facade.getAllBooks();
		
		for(Book book : books) {
			System.out.println(book);
		}
		
	} 
}
