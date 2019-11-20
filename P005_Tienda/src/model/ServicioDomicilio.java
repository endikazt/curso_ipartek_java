package model;

public class ServicioDomicilio extends Servicio{
	
	private float gastoAdicional;

	public ServicioDomicilio(String codigo, float precio, float minimoHoras, float gastoAdicional) {
		super(codigo, precio, minimoHoras);
		this.gastoAdicional = gastoAdicional;
	}
	
	public ServicioDomicilio(float gastoAdicional) {
		super();
		this.gastoAdicional = gastoAdicional;
	}
	
	public ServicioDomicilio() {
		super();
		this.gastoAdicional = 0.0f;
	}
	
	

}
