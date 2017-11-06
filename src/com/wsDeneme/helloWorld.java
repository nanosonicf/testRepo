package com.wsDeneme;

import javax.ws.rs.GET;

import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

import javax.ws.rs.core.Response;



@Path("/hello")
public class helloWorld {

	@GET
	
	//@Path("/{param}")
	public Response getMsg(@PathParam("param") String mesaj) {
		
		String str = "Merhaba: "+ mesaj ;
		
		return Response.status(200).entity(str).build();
	}
	

	
	
	
	
}
