package com.ipartek.clases;

import java.lang.reflect.GenericArrayType;

public class Cuadrado extends FiguraGeometrica{
	
	private int lado;

	public Cuadrado(String nombre, int lado) {
		super(nombre);
		this.lado = lado;
	}

	public Cuadrado(int lado) {
		super();
		this.lado = lado;
	}
	
	public Cuadrado() {
		super();
		this.lado = 0;
	}

	public int getLado() {
		return lado;
	}

	public void setLado(int lado) {
		this.lado = lado;
	}

	@Override
	public void calcularArea() {
		
		int areaCuadrado = this.lado*this.lado;
			
		System.out.println("Area de la figura: " + areaCuadrado + " cm2");
		
	}

	@Override
	public void calcularPerimetro() {
		
	    int permitroCuadrado = this.lado*4;
		
		System.out.println("Perimetro de la figura: " + permitroCuadrado + " cm");
		
	}

	@Override
	public void mostrarInfo() {
		
		System.out.println("Nombre de la figura: " + this.getNombre());
	}
	

}
