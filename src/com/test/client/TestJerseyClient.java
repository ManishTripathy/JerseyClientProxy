package com.test.client;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

/*
 * Assuming there is a TestJerseyService class provided by Service API. This client is build 
 * keeping that in mind
 */
@Path("message")
public interface TestJerseyClient {
	@GET
    @Produces("text/plain")
    String get();
}
