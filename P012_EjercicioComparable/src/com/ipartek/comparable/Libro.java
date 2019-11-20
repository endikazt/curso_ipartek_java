package com.ipartek.comparable;

public class Libro implements Comparable{
	
	private String titulo, autor;
	private int numPaginas;
	private boolean tapaBlanda;
	private boolean tapaDura;
	
	public Libro(String titulo, String autor, int numPaginas, boolean tapaBlanda, boolean tapaDura) {
		super();
		this.titulo = titulo;
		this.autor = autor;
		this.numPaginas = numPaginas;
		this.tapaBlanda = tapaBlanda;
		this.tapaDura = tapaDura;
	}

	public Libro() {
		super();
		this.titulo = "";
		this.autor = "";
		this.numPaginas = 0;
		this.tapaBlanda = true;
		this.tapaDura = false;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public int getNumPaginas() {
		return numPaginas;
	}

	public void setNumPaginas(int numPaginas) {
		this.numPaginas = numPaginas;
	}

	public boolean isTapaBlanda() {
		return tapaBlanda;
	}

	public void setTapaBlanda(boolean tapaBlanda) {
		this.tapaBlanda = tapaBlanda;
	}

	public boolean isTapaDura() {
		return tapaDura;
	}

	public void setTapaDura(boolean tapaDura) {
		this.tapaDura = tapaDura;
	}

	@Override
	public int compareTo(Object libro) {
		return this.numPaginas - ((Libro) libro).getNumPaginas();
	}

	@Override
	public String toString() {
		return "Libro [titulo=" + titulo + ", autor=" + autor + ", numPaginas=" + numPaginas + ", tapaBlanda="
				+ tapaBlanda + ", tapaDura=" + tapaDura + "]";
	}
	
	
	
}
