package com.ipartek.clases;

public class Botella {
	
	private String referencia;
	private int  capacidad;
	private int pesoVacio;
	
	public Botella(String referencia, int capacidad, int pesoVacio) {
		super();
		this.referencia = referencia;
		this.capacidad = capacidad;
		this.pesoVacio = pesoVacio;
	}
	public Botella() {
		super();
		this.referencia = "";
		this.capacidad = 0;
		this.pesoVacio = 0;
	}
	
	public String getReferencia() {
		return referencia;
	}
	
	public void setReferencia(String referencia) {
		this.referencia = referencia;
	}
	
	public int getCapacidad() {
		return capacidad;
	}
	
	public void setCapacidad(int capacidad) {
		this.capacidad = capacidad;
	}
	
	public int getPesoVacio() {
		return pesoVacio;
	}
	
	public void setPesoVacio(int pesoVacio) {
		this.pesoVacio = pesoVacio;
	}
	
	public boolean calidad()
	{
		
		if(capacidad == 500 && (pesoVacio >= 50 && pesoVacio <= 52))
		{
			return true;
		}
		else
		{
			return false;
		}
		
		
	}

}
