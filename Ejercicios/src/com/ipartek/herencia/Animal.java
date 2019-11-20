package com.ipartek.herencia;

public class Animal {
	
	private char sexo;
	private int numExtremidades;
	private float peso;
	
		
	public Animal() {
		super();
		this.sexo = 'n';
		this.numExtremidades = 0;
		this.peso = 0.0f;
	}


	public Animal(char sexo, int numExtremidades, float peso) {
		super();
		this.sexo = sexo;
		this.numExtremidades = numExtremidades;
		this.peso = peso;
	}


	public char getSexo() {
		return sexo;
	}


	public void setSexo(char sexo) {
		this.sexo = sexo;
	}


	public int getNumExtremidades() {
		return numExtremidades;
	}


	public void setNumExtremidades(int numExtremidades) {
		this.numExtremidades = numExtremidades;
	}


	public float getPeso() {
		return peso;
	}


	public void setPeso(float peso) {
		this.peso = peso;
	}
	
	public void verFicha()
	{
		
	}

}
