package com.ipartek.exceptions;

public class Snellen {
	
	private final int distacia = 20;
	private int angulo;
	
	public Snellen(int angulo) {
		super();
		this.angulo = angulo;
	}
	
	public Snellen() {
		super();
		this.angulo = 0;
	}

	public int getAngulo() {
		return angulo;
	}

	public void setAngulo(int angulo) throws ExcepcionListaNegra {
		if(angulo < 0 || angulo > 200) {
			throw new ExcepcionListaNegra(6);
		} else {
			this.angulo = angulo;
		}
	}

	public int getDistacia() {
		return distacia;
	}
	
}
