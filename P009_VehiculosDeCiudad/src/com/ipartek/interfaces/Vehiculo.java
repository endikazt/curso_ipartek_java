package com.ipartek.interfaces;

public interface Vehiculo {
	
	final int vel_max_coche=150;
	final int  vel_max_bici=50;
	final int vel_max_patinete=80; 
	
	void Arrancar();
	
	void Acelerar(int incrementoVel);
	
	void Frenar(int decrementoVel);
	
	void Apagar();
	
	String toString();

}
