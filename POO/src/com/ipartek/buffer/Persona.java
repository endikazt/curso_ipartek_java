package com.ipartek.buffer;

public class Persona {
	
	private String nombre, apellidos, dni;

	public Persona(String nombre, String apellidos, String dni) {
		super();
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.dni = dni;
	}

	public Persona() {
		super();
		this.nombre = "";
		this.apellidos = "";
		this.dni = "";
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	@Override
	public String toString() {
		return "["+ nombre + " " + apellidos + " " + dni + "]";
	}
	
	

}
