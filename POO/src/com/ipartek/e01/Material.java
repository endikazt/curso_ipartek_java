package com.ipartek.e01;

public class Material {
	
	private String material;
	private boolean esRecicable;
	
	public Material()
	{
		this.material = "";
		this.esRecicable = true;
	}
	
	public Material(String material, boolean esRecicable) {
		super();
		this.material = material;
		this.esRecicable = esRecicable;
	}
	public String getMaterial() {
		return material;
	}
	public void setMaterial(String material) {
		this.material = material;
	}
	public boolean isRecicable() {
		return esRecicable;
	}
	public void setRecicable(boolean recicable) {
		this.esRecicable = recicable;
	}

	public String mostrarDatos() {
		return "Material [material=" + material + ", esRecicable=" + esRecicable + "]";
	}
	
	
	

}
