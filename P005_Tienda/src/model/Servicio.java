package model;

public class Servicio {
	
	private String codigo;
	private float precio;
	private float minimoHoras;
	
	public Servicio(String codigo, float precio, float minimoHoras) {
		super();
		this.codigo = codigo;
		this.precio = precio;
		this.minimoHoras = minimoHoras;
	}
	
	public Servicio() {
		super();
		this.codigo = "";
		this.precio = 0.0f;
		this.minimoHoras = 0.0f;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public float getPrecio() {
		return precio;
	}

	public void setPrecio(float precio) {
		this.precio = precio;
	}

	public float getMinimoHoras() {
		return minimoHoras;
	}

	public void setMinimoHoras(float minimoHoras) {
		this.minimoHoras = minimoHoras;
	}

}
