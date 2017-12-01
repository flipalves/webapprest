package br.edu.infnet.webapprest.persistencia;

public interface Dao<T> {

	void salvar(T entity);
	
}
