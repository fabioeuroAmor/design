package br.org.previc.src.design.controllers;

import org.springframework.stereotype.Component;

import br.org.previc.src.design.domains.AtividadeSignificativa;
import br.org.previc.src.design.json.ResponseJson;

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
		   
		   ResponseJson responseJson = new ResponseJson();	
		   
		   AtividadeSignificativa AtividadeSignificativa = new AtividadeSignificativa();
		   AtividadeSignificativa.setIdAtividadeSignificativa(1);
		   AtividadeSignificativa.setNome("Nome Atividade Significativa");		   
		   
		   responseJson.setMensagensRetorno("Atividdade Significativa consultada!!!");
		   responseJson.setModeloRetorno(AtividadeSignificativa);
		   
		   
		
		   
	       StringBuilder result = new StringBuilder();
	       result.append("Teste de API");
	       
	       return Response.status(200).entity(responseJson).build();
	   }
	
	

}