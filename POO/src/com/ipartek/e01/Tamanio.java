package com.ipartek.e01;

public class Tamanio {
	
	private double altura, anchura, profundidad;
	
	public Tamanio()
	{
		this.altura = 0;
		this.anchura = 0;
		this.profundidad = 0;
		
	}

	public Tamanio(double altura, double anchura, double profundidad) {
		super();
		this.altura = altura;
		this.anchura = anchura;
		this.profundidad = profundidad;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public double getAnchura() {
		return anchura;
	}

	public void setAnchura(double anchura) {
		this.anchura = anchura;
	}

	public double getProfundidad() {
		return profundidad;
	}

	public void setProfundidad(double profundidad) {
		this.profundidad = profundidad;
	}

	public String mostrarDatos() {
		return "Tamanio [altura=" + altura + ", anchura=" + anchura + ", profundidad=" + profundidad + "]";
	}		

}
