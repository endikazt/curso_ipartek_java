package com.ipartek.clases;

public class Triangulo extends FiguraGeometrica{
	
	private int base;
	private int altura;
	
	public Triangulo(String nombre, int base, int altura) {
		super(nombre);
		this.base = base;
		this.altura = altura;
	}

	public Triangulo(int base, int altura) {
		super();
		this.base = base;
		this.altura = altura;
	}

	public Triangulo(String nombre) {
		super(nombre);
		this.base = 0;
		this.altura = 0;
	}

	public int getBase() {
		return base;
	}

	public void setBase(int base) {
		this.base = base;
	}

	public int getAltura() {
		return altura;
	}

	public void setAltura(int altura) {
		this.altura = altura;
	}

	@Override
	public void calcularArea() {
		
		float areaTriangulo = (this.base*this.altura)/2;
		
		System.out.println("Area de la figura: " + areaTriangulo + " cm2");
		
	}

	@Override
	public void calcularPerimetro() {
		
		double hipotenusa = Math.sqrt((base*base) + (altura*altura));
		
		double perimetroTriangulo = base+altura+hipotenusa;
			
		System.out.println("Perimetro de la figura: " + perimetroTriangulo + " cm");
		
	}

	@Override
	public void mostrarInfo() {
		
		System.out.println("Nombre de la figura: " + this.getNombre());
		
	}

}
