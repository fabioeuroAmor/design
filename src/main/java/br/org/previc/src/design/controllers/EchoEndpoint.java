package br.org.previc.src.design.controllers;

import org.springframework.stereotype.Component;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/blog")
@Component
@Produces(MediaType.APPLICATION_JSON)
public class EchoEndpoint {
	 
	   @GET
	   @Path("/teste")
	   @Produces("application/json")
	   public Response getteste() {
	       StringBuilder result = new StringBuilder();
	       result.append("Teste de API");
	       
	       return Response.status(200).entity(result.toString()).build();
	   }
	
	

}