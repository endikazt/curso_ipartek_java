package model;

public class ServicioTienda extends Servicio{
	
	private String empleado;

	public ServicioTienda(String codigo, float precio, float minimoHoras, String empleado) {
		super(codigo, precio, minimoHoras);
		this.empleado = empleado;
	}
	
	public ServicioTienda(String empleado) {
		super();
		this.empleado = empleado;
	}
	
	public ServicioTienda() {
		super();
		this.empleado = "";
	}

	public String getEmpleado() {
		return empleado;
	}

	public void setEmpleado(String empleado) {
		this.empleado = empleado;
	}	

}
