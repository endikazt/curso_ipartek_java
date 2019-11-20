package com.ipartek.herencia;

public class Pez extends Animal {
	
	private boolean tieneEscamas;
	private String color;
	
	public Pez(char sexo, int numExtremidades, float peso, boolean tieneEscamas, String color) {
		super(sexo, numExtremidades, peso);
		this.tieneEscamas = tieneEscamas;
		this.color = color;
	}

	public Pez() {
		super();
		this.tieneEscamas = true;
		this.color = "";
	}
	
	public Pez(boolean tieneEscamas, String color) {
		super();
		this.tieneEscamas = tieneEscamas;
		this.color = color;
	}
	
	public boolean getTieneEscamas() {
		return tieneEscamas;
	}

	public void setTieneEscamas(boolean tieneEscamas) {
		this.tieneEscamas = tieneEscamas;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public void respirar()
	{
		
	}
	
}
