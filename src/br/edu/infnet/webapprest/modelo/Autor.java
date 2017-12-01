package br.edu.infnet.webapprest.modelo;

public class Autor {
	
	private int author_id;
	private String author_firstname;
	private String author_surname;
	
	public int getAuthor_id() {
		return author_id;
	}
	public void setAuthor_id(int author_id) {
		this.author_id = author_id;
	}
	public String getAuthor_firstname() {
		return author_firstname;
	}
	public void setAuthor_firstname(String author_firstname) {
		this.author_firstname = author_firstname;
	}
	public String getAuthor_surname() {
		return author_surname;
	}
	public void setAuthor_surname(String author_surname) {
		this.author_surname = author_surname;
	}

}
