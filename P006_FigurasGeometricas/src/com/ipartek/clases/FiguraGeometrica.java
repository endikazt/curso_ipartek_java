package com.ipartek.clases;

public abstract class FiguraGeometrica {
	
	private String nombre;

	public FiguraGeometrica(String nombre) {
		super();
		this.nombre = nombre;
	}
	
	
	public FiguraGeometrica() {
		super();
		this.nombre = "";
	}


    public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	abstract public void calcularArea();
	
	abstract public void calcularPerimetro();
	
	abstract public void mostrarInfo();

}
