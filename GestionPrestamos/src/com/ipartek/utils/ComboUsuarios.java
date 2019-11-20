package com.ipartek.utils;

import com.ipartek.model.Usuario;

public class ComboUsuarios {
	
	private String key;
	private Usuario usuario;
	
	public ComboUsuarios(String key, Usuario usuario) {
		super();
		this.key = key;
		this.usuario = usuario;
	}

	public String getKey() {
		return key;
	}

	public void setKey(String key) {
		this.key = key;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	@Override
	public String toString() {
		return this.usuario.toString();
	}
	
	

}
