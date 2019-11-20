package com.ipartek.model;

import com.ipartek.utils.Auxiliar;

public class Prestamo {
	
	private static int contadorPrestamo = 0;
	private int codigoPrestamo;
	private String fechaInicio = "";
	private String fechaFin = "";
	private Usuario usuarioPrestado;
	private Disco discoPrestado;
	private boolean prestamoActivo;
	
	public Prestamo(Usuario usuarioPrestado, Disco discoPrestado) {
		super();
		contadorPrestamo++;
		this.codigoPrestamo = contadorPrestamo;
		this.setFechaInicio();
		this.usuarioPrestado = usuarioPrestado;
		this.discoPrestado = discoPrestado;
		this.prestamoActivo = true;
	}

	public Prestamo() {
		super();
		contadorPrestamo++;
		this.codigoPrestamo = contadorPrestamo;
		this.setFechaInicio();
		this.fechaFin = "";
		this.usuarioPrestado = new Usuario();;
		this.discoPrestado = new Disco();
		this.prestamoActivo = true;
	}
	
	
	public int getCodigoPrestamo() {
		return codigoPrestamo;
	}
	
	public String getFechaInicio() {
		return fechaInicio;
	}

	public void setFechaInicio() {
		
		this.fechaInicio = Auxiliar.obtenerFecha();
	}

	public String getFechaFin() {
		return fechaFin;
	}

	public void setFechaFin() {
		
		this.fechaFin = Auxiliar.obtenerFecha();
	}

	public Usuario getUsuarioPrestado() {
		return usuarioPrestado;
	}

	public void setUsuarioPrestado(Usuario usuarioPrestado) {
		this.usuarioPrestado = usuarioPrestado;
	}

	public Disco getDiscoPrestado() {
		return discoPrestado;
	}

	public void setDiscoPrestado(Disco discoPrestado) {
		this.discoPrestado = discoPrestado;
	}

	public boolean getPrestamoActivo() {
		return prestamoActivo;
	}

	public void setPrestamoActivo(boolean prestamoActivo) {
		this.prestamoActivo = prestamoActivo;
	}	

}
