package br.edu.infnet.webapprest.modelo;

public class Livro {
	private String isbn;
	private String book_title;
	private String data_of_publication;
	
	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	public String getBook_title() {
		return book_title;
	}
	public void setBook_title(String book_title) {
		this.book_title = book_title;
	}
	public String getData_of_publication() {
		return data_of_publication;
	}
	public void setData_of_publication(String data_of_publication) {
		this.data_of_publication = data_of_publication;
	}	
	
}
