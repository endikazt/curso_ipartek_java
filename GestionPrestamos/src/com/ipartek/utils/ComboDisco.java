package com.ipartek.utils;

import com.ipartek.model.Disco;
import com.ipartek.model.Usuario;

public class ComboDisco {
	
	private int key;
	private Disco disco;
	
	public ComboDisco(int key, Disco disco) {
		super();
		this.key = key;
		this.disco = disco;
	}

	public int getKey() {
		return key;
	}

	public void setKey(int key) {
		this.key = key;
	}

	public Disco getDisco() {
		return disco;
	}

	public void setDisco(Disco disco) {
		this.disco = disco;
	}

	@Override
	public String toString() {
		return this.disco.toString();
	}
	
	

}
