package com.test;

import com.test.client.facade.TestJerseyFacade;

public class TestJerseyMainClass {
	public static void main(String[] args) {
		TestJerseyFacade facade = new TestJerseyFacade();
		System.out.println(facade.sayHi());
	} 
}
