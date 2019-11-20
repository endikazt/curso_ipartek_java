package com.ipartek.exceptions;

public class Persona{
	
	private String nombre;
	private int edad;
	
	public Persona(String nombre, int edad) {
		super();
		this.nombre = nombre;
		this.edad = edad;
	}

	public Persona() {
		super();
		this.nombre = "";
		this.edad = 0;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) throws Exception {
		
		if(edad < 0 || edad > 120)
		{
			throw new Exception("Error. El valor de edad no puede ser menor que 0 o mayor que 120.");
		} 
		else
		{
			this.edad = edad;
		}
	}

	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", edad=" + edad + "]";
	}
	
	

}
