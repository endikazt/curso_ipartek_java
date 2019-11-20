package com.ipartek.model;

import java.util.ArrayList;

public class Usuario {
	
	private String dniUsuario, nombreUsuario, apellidosUsuario;
	
	public Usuario(String dni, String nombre, String apellidos) {
		super();
		this.dniUsuario = dni;
		this.nombreUsuario = nombre;
		this.apellidosUsuario = apellidos;
	}

	public Usuario() {
		super();
		this.dniUsuario = "";
		this.nombreUsuario = "";
		this.apellidosUsuario = "";
	}

	public String getDniUsuario() {
		return dniUsuario;
	}

	public void setDniUsuario(String dniUsuario) {
		this.dniUsuario = dniUsuario;
	}

	public String getNombreUsuario() {
		return nombreUsuario;
	}

	public void setNombreUsuario(String nombreUsuario) {
		this.nombreUsuario = nombreUsuario;
	}

	public String getApellidosUsuario() {
		return apellidosUsuario;
	}

	public void setApellidosUsuario(String apellidosUsuario) {
		this.apellidosUsuario = apellidosUsuario;
	}

	@Override
	public String toString() {
		return dniUsuario + " - " + nombreUsuario +  " " + apellidosUsuario;
	}

}
