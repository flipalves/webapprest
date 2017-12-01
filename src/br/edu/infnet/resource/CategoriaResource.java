package br.edu.infnet.resource;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/categorias")
public class CategoriaResource {
	
	public CategoriaResource() {
	}
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Categoria> getAlunos(){
		List<Categoria> lista = new ArrayList<Categoria>();
		lista.add(new Categoria("teste"));
		return lista;
	}

}
