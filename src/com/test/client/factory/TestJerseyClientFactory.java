package com.test.client.factory;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.Configuration;

import org.glassfish.jersey.client.proxy.WebResourceFactory;
import org.glassfish.jersey.jackson.JacksonFeature;
import org.glassfish.jersey.server.ResourceConfig;

import com.test.client.TestJerseyClient;

public class TestJerseyClientFactory {

	private TestJerseyClientFactory() {
		
	}
	
	public static TestJerseyClient createClient(String uri) {
		 Configuration configuration = new ResourceConfig()
         .packages("com.test")
         .register(JacksonFeature.class);
		 
		 Client client = ClientBuilder.newClient(configuration);
	     WebTarget webTarget = client.target(uri);
	     TestJerseyClient resource = WebResourceFactory.newResource(TestJerseyClient.class, webTarget);
		 return resource;
	}
}
