package br.edu.infnet.rest;

import java.util.HashSet;
import java.util.Set;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

import br.edu.infnet.resource.AutorResource;
import br.edu.infnet.resource.LivroResource;
import br.edu.infnet.resource.CategoriaResource;


@ApplicationPath("/rest")
public class MyApplication extends Application {

	
	public Set<Class<?>> getClasses(){
		final Set<Class<?>> classes = new HashSet<Class<?>>();
		classes.add(AutorResource.class);
		classes.add(LivroResource.class);
		classes.add(CategoriaResource.class);		
		return classes;
	}
	
	
}
