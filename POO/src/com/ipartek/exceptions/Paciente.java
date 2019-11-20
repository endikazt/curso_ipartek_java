package com.ipartek.exceptions;

public class Paciente {
	
	private double altura, peso;
	private boolean piesPlanos;
	private Snellen vision;
	
	public Paciente(double altura, double peso, boolean piesPlanos, Snellen vision) {
		super();
		this.altura = altura;
		this.peso = peso;
		this.piesPlanos = piesPlanos;
		this.vision = vision;
	}

	public Paciente() {
		super();
		this.altura = 0.0f;
		this.peso = 0.0f;
		this.piesPlanos = false;
		this.vision = new Snellen();
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) throws ExcepcionListaNegra {
		if(altura < 1.60f) {
			throw new ExcepcionListaNegra(1);
		} else if (altura > 2.10f) {
			throw new ExcepcionListaNegra(2);
		} else {
			this.altura = altura;
		}
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) throws ExcepcionListaNegra {
		if(peso < 35f) {
			throw new ExcepcionListaNegra(3);
		} else if (peso > 160f) {
			throw new ExcepcionListaNegra(4);
		} else {
			this.peso = peso;
		}
	}

	public boolean isPiesPlanos() {
		return piesPlanos;
	}

	public void setPiesPlanos(boolean piesPlanos) throws ExcepcionListaNegra {
		if (piesPlanos == false) {
			this.piesPlanos = piesPlanos;
		}
		else
		{
			throw new ExcepcionListaNegra(5);
		}
	
	}

	public Snellen getVision() {
		return vision;
	}

	public void setVision(Snellen vision) {
		this.vision = vision;
	}

	@Override
	public String toString() {
		return "Paciente [altura=" + altura + ", peso=" + peso + ", piesPlanos=" + piesPlanos + ", vision=" + vision
				+ "]";
	}
	
		

}
