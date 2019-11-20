package com.ipartek.model;

public class Disco {
	
	private static int contadorDisco = 0;
	private int codigoDisco;
	private String tituloDisco, grupoDisco, generoDisco;
	private boolean estaPrestado = false;
	
	public Disco(String tituloDisco, String grupoDisco, String generoDisco, boolean estaPrestado) {
		super();
		contadorDisco++;
		this.codigoDisco = contadorDisco;
		this.tituloDisco = tituloDisco;
		this.grupoDisco = grupoDisco;
		this.generoDisco = generoDisco;
		this.estaPrestado = estaPrestado;
		
	}

	public Disco() {
		super();
		contadorDisco++;
		this.codigoDisco = contadorDisco;
		this.tituloDisco = "";
		this.grupoDisco = "";
		this.generoDisco = "";
		this.estaPrestado = false;
	}

	public int getCodigoDisco() {
		return codigoDisco;
	}

	public String getTituloDisco() {
		return tituloDisco;
	}

	public void setTituloDisco(String tituloDisco) {
		this.tituloDisco = tituloDisco;
	}

	public String getGrupoDisco() {
		return grupoDisco;
	}

	public void setGrupoDisco(String grupoDisco) {
		this.grupoDisco = grupoDisco;
	}

	public String getGeneroDisco() {
		return generoDisco;
	}

	public void setGeneroDisco(String generoDisco) {
		this.generoDisco = generoDisco;
	}

	public boolean getEstaPrestado() {
		return estaPrestado;
	}

	public void setEstaPrestado(boolean estaPrestado) {
		this.estaPrestado = estaPrestado;
	}

	@Override
	public String toString() {
		return codigoDisco + " - " + tituloDisco;
	}
	
	

}
