package br.org.previc.src.design.controllers;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

@Path("/AtividadeSignificativa")
public class AtividadeSignificativaController {
	
	
	   @GET
	   @Path("/teste")
	   @Produces("application/text")
	   public Response getteste() {
	       StringBuilder result = new StringBuilder();
	       result.append("Teste de API");
	       
	       return Response.status(200).entity(result.toString()).build();
	   }
	
	

}
