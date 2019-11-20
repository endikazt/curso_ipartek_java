package com.ipartek.clases;

import com.ipartek.interfaces.Vehiculo;

public class Bici implements Vehiculo{
	
	private int velocidadActual;
	private boolean estaArrancado;

	public Bici(int velocidadActual, boolean estaArrancado) {
		super();
		this.velocidadActual = velocidadActual;
		this.estaArrancado = estaArrancado;
	}

	public Bici() {
		super();
		this.velocidadActual = 0;
		this.estaArrancado = false;
	}
	

	public int getVelocidadActual() {
		return velocidadActual;
	}

	public void setVelocidadActual(int velocidadActual) {
		this.velocidadActual = velocidadActual;
	}

	public boolean getEstaArrancado() {
		return estaArrancado;
	}

	public void setEstaArrancado(boolean estaArrancado) {
		this.estaArrancado = estaArrancado;
	}

	@Override
	public void Arrancar() {
		
		if(this.estaArrancado == false)
		{
			estaArrancado = true;
			System.out.println("Bici arrancada.");
		}
		
		if(this.estaArrancado == true)
		{
			System.out.println("La bici ya esta arrancada.");
		}
		
	}

	@Override
	public void Acelerar(int incrementoVel) {
		
		if(incrementoVel > 0 &&  this.estaArrancado == true && this.velocidadActual < this.vel_max_bici)
		{
			velocidadActual = velocidadActual+incrementoVel;
		}
		
		if(this.estaArrancado == false)
		{
			System.out.println("La bici no puede acelerar porque esta apagada.");
		}
		
	}

	@Override
	public void Frenar(int decrementoVel) {
		
		if(decrementoVel > 0 && this.estaArrancado == true && this.velocidadActual > 0)
		{
			velocidadActual = velocidadActual-decrementoVel;
		}
		
		if(this.estaArrancado == false)
		{
			System.out.println("La bici no puede frenar porque esta apagada.");
		}
		
		
	}

	@Override
	public void Apagar() {
		
		if(this.estaArrancado == true && this.velocidadActual == 0)
		{
			this.estaArrancado = false;
		}
		
		if(this.estaArrancado == false)
		{
			System.out.println("La bici ya esta apagado.");
		}
		
	}

	@Override
	public String toString() {
		
		String cadena = "";
		
		if(estaArrancado) 
		{
			cadena = "Soy una bici, estoy encendido y mi velocidad es de "  + velocidadActual + "Km/h";
		}
		
		
		if(!estaArrancado) 
		{
			cadena = "Soy una bici, estoy apagado y mi velocidad es de "  + velocidadActual + "Km/h";
		}
		
		return cadena;
		
	}
	
}
