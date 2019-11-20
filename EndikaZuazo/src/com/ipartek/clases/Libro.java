package com.ipartek.clases;

public class Libro {
	
	private String titulo; //Titulo del libro, longitud minima 3 letras, maxima 150
	private String isbn; // Longitud 10
	private int numPaginas; // Numero de paginas del libro
	private boolean formato; // True = digital, False = papel
	
	public Libro(String titulo, String isbn, int numPaginas, boolean formato) {
		super();
		this.titulo = titulo;
		this.isbn = isbn;
		this.numPaginas = numPaginas;
		this.formato = formato;
	}

	public Libro() {
		super();
		this.titulo = "";
		this.isbn = "";
		this.numPaginas = 0;
		this.formato = false;
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

	public int getNumPaginas() {
		return numPaginas;
	}

	public void setNumPaginas(int numPaginas) {
		this.numPaginas = numPaginas;
	}

	public boolean getFormato() {
		return formato;
	}

	public void setFormato(boolean formato) {
		this.formato = formato;
	}

	
	@Override
	public String toString() {
		
		if(this.formato == false)
		{
			return "[Titulo = " + titulo + ", ISBN = " + isbn + ", Nº paginas = " + numPaginas + ", Formato = papel]";
		} 
		else
		{
			return "[Titulo = " + titulo + ", ISBN = " + isbn + ", Nº paginas = " + numPaginas + ", Formato = digital]";
		}
	}
	
	
	

}
