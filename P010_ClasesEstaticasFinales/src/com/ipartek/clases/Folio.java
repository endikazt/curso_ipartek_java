package com.ipartek.clases;

public final class Folio extends Producto{
	
	private String tipo;
	private int gramaje;
	
	public Folio(String referencia, String tipo, int gramaje) {
		super(referencia);
		this.tipo = tipo;
		this.gramaje = gramaje;
	}

	public Folio(String tipo, int gramaje) {
		super();
		this.tipo = tipo;
		this.gramaje = gramaje;
	}

	public Folio() {
		super();
		this.tipo = "";
		this.gramaje = 0;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public int getGramaje() {
		return gramaje;
	}

	public void setGramaje(int gramaje) {
		this.gramaje = gramaje;
	}
	
	@Override
	public String mostrarInfo() {
		super.mostrarInfo();
		
		return "Folio [referencia=" + this.getReferencia() + ", tipo=" + this.getReferencia() +  ", gramaje=" + this.getGramaje() + "]";
	}
	
}
