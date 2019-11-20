package com.ipartek.clases;

public abstract class Producto {
	
	private static int contadorUnidades = 0;
	private String referencia;
	
	public Producto(String referencia) {
		super();
		this.referencia = referencia;
		contadorUnidades++;
	}
	
	public Producto() {
		super();
		this.referencia = "";
		contadorUnidades++;
	}
	
	public static int getContadorUnidades() {
		return contadorUnidades;
	}
	public static void setContadorUnidades(int contadorUnidades) {
		Producto.contadorUnidades = contadorUnidades;
	}
	public String getReferencia() {
		return referencia;
	}
	public void setReferencia(String referencia) {
		this.referencia = referencia;
	}
	
	public String mostrarInfo()
	{
		return "Producto [referencia=" + referencia + "]";
	}
	
}
