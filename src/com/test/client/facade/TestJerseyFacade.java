package com.test.client.facade;

import com.test.client.TestJerseyClient;
import com.test.client.factory.TestJerseyClientFactory;

public class TestJerseyFacade {
	private final TestJerseyClient client;
	
	public TestJerseyFacade() {
		client = TestJerseyClientFactory.createClient("http://localhost:8090/RestForce/rest/");
	}
	
	public String sayHi() {
		return client.get();
	}
}
