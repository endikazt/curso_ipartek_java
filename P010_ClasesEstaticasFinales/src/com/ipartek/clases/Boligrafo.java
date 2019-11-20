package com.ipartek.clases;

public final class Boligrafo extends Producto{
	
	private String color;
	
	public Boligrafo(String referencia, String color) {
		super(referencia);
		this.color = color;
	}

	public Boligrafo(String color) {
		super();
		this.color = color;
	}
	
	public Boligrafo() {
		super();
		this.color = "";
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	@Override
	public String mostrarInfo() {
		super.mostrarInfo();
	
		return "Boligrafo [referencia=" + this.getReferencia() + ", color=" + this.getColor() + "]";
		
	}

}
