package com.ipartek.clases;

public class Circulo extends FiguraGeometrica{
	
	private int radio;

	public Circulo(String nombre, int radio) {
		super(nombre);
		this.radio = radio;
	}

	public Circulo(int radio) {
		super();
		this.radio = radio;
	}

	public Circulo() {
		super();
		this.radio = 0;
	}

	public int getRadio() {
		return radio;
	}

	public void setRadio(int radio) {
		this.radio = radio;
	}

	@Override
	public void calcularArea() {
		
		double areaCirculo = Math.PI * (radio*radio);
		
		System.out.println("Area de la figura: " + areaCirculo);
		
	}

	@Override
	public void calcularPerimetro() {
		
		double perimetroCirculo = 2 * Math.PI * radio;
		
		System.out.println("Perimetro de la figura: " + perimetroCirculo);
		
	}

	@Override
	public void mostrarInfo() {
		
		System.out.println("Nombre de la figura: " + this.getNombre());
		
	}

}
