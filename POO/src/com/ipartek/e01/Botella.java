package com.ipartek.e01;

public class Botella {
	
	//Atributos
	
	private Tamanio tamanio;
	private Material material;
	private int capacidad; 
	private int peso;
	private boolean esDefectuosa;
	
	//Contructores
	
	public Botella()
	{
		this.tamanio = new Tamanio();
		this.material = new Material();
		this.capacidad = 0;
		this.peso = 0;
		this.esDefectuosa = false;
		
	}
	
	public Botella(Tamanio tamanio, Material material, int capacidad, int peso, boolean esDefectuosa) 
	{
		super();
		this.tamanio = tamanio;
		this.material = material;
		this.capacidad = capacidad;
		this.peso = peso;
		this.esDefectuosa = esDefectuosa;
	}
	
	//Getters y setters
	
	public Tamanio getTamanio() {
		return tamanio;
	}	
	public void setTamanio(Tamanio tamanio) {
		this.tamanio = tamanio;
	}
	public Material getMaterial() {
		return material;
	}
	public void setMaterial(Material material) {
		this.material = material;
	}
	public int getCapacidad() {
		return capacidad;
	}
	public void setCapacidad(int capacidad) {
		this.capacidad = capacidad;
	}
	public int getPeso() {
		return peso;
	}
	public void setPeso(int peso) {
		this.peso = peso;
	}
	public boolean getEsDefectuosa() {
		return esDefectuosa;
	}
	public void setEsDefectuosa(boolean esDefectuosa) {
		this.esDefectuosa = esDefectuosa;
	}
	
	//Funciones o metodos

	public String mostrarDatos() {
		return "Botella [tamanio=" + tamanio.mostrarDatos() + ", material=" + material.mostrarDatos() + ", capacidad=" + capacidad + ", peso=" + peso
				+ ", esDefectuosa=" + esDefectuosa + "]";
	}
	
	

}
