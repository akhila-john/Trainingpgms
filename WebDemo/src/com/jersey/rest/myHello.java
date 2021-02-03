package com.jersey.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/hello")
public class myHello {

	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String getHello() {
		return "Hello World";
	}
}
