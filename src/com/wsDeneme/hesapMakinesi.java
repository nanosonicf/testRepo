package com.wsDeneme;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

@Path("/calc/{sayi1}&{sayi2}")
public class hesapMakinesi {

	
	@GET
	//@Path birden fazla var gonderilirken PathQuery kullanilmali
	public Response toplama(@PathParam("sayi1") int sayi1,@PathParam("sayi2") int sayi2) {
		String str= "islemin sonucu : "+ (sayi1+sayi2);

		return Response.status(200).entity(str).build();	
			}
	
	
//localhost:8080/WebService3Den/methodlarim/calc/4&5
		
}
