package Exercicio3;

public class Book {
	
	private String titulo;
	private String isbn;
	private String autor;
	
	public Book() {
		
	}
	
	public Book(String titulo, String isbn, String autor) {
		super();
		this.titulo = titulo;
		this.isbn = isbn;
		this.autor = autor;
		
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public void emprestimo(Book livro) {
		System.out.println("Voce pegou emprestado: "+ livro.getTitulo());
	}
	
	public void devolver(Book livro) {
		System.out.println("Voce devolveu: "+ livro.getTitulo());		
	}
	
	@Override
	public String toString() {		
		return "\n Titulo: "+ this.titulo + "\n ISBN: "+ this.isbn + "\n Autor:"+ this.autor;
	}

}
