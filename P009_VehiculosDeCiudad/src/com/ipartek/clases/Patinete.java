package com.ipartek.clases;

import com.ipartek.interfaces.Vehiculo;

public class Patinete implements Vehiculo{
	
	private int velocidadActual;
	private boolean estaArrancado;

	public Patinete(int velocidadActual, boolean estaArrancado) {
		super();
		this.velocidadActual = velocidadActual;
		this.estaArrancado = estaArrancado;
	}

	public Patinete() {
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
			System.out.println("Patinete arrancado.");
		}
		
		if(this.estaArrancado == true)
		{
			System.out.println("El patinete ya esta arrancado.");
		}
		
	}

	@Override
	public void Acelerar(int incrementoVel) {
		
		if(incrementoVel > 0 && this.estaArrancado == true && this.velocidadActual < this.vel_max_patinete)
		{
			velocidadActual = velocidadActual+incrementoVel;
		}
		
		if(this.estaArrancado == false)
		{
			System.out.println("El patienete no puede acelerar porque esta apagado.");
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
			System.out.println("El patinete no puede frenar porque esta apagado.");
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
			System.out.println("El patinete ya esta apagado.");
		}
		
	}

	@Override
	public String toString() {
		
		String cadena = "";
		
		if(estaArrancado) 
		{
			cadena = "Soy un patinete, estoy encendido y mi velocidad es de "  + velocidadActual + "Km/h";
		}
		
		
		if(!estaArrancado) 
		{
			cadena = "Soy un patinete, estoy apagado y mi velocidad es de "  + velocidadActual + "Km/h";
		}
		
		return cadena;
		
	}
	
}
