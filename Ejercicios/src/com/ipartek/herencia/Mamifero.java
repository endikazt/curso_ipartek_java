package com.ipartek.herencia;

public class Mamifero extends Animal{
	
	private String colorPelo;
	private byte numMamas;
	
	public Mamifero(char sexo, int numExtremidades, float peso, String colorPelo, byte numMamas) {
		super(sexo, numExtremidades, peso);
		this.colorPelo = colorPelo;
		this.numMamas = numMamas;
	}

	public Mamifero() {
		super();
		this.colorPelo = "";
		this.numMamas = 0;
	}

	
	public Mamifero(String colorPelo, byte numMamas) {
		super();
		this.colorPelo = colorPelo;
		this.numMamas = numMamas;
	}

	public String getColorPelo() {
		return colorPelo;
	}

	public void setColorPelo(String colorPelo) {
		this.colorPelo = colorPelo;
	}

	public byte getNumMamas() {
		return numMamas;
	}

	public void setNumMamas(byte numMamas) {
		this.numMamas = numMamas;
	}
	
}
