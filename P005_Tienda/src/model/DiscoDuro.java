package model;

public class DiscoDuro extends Producto implements ElementoTienda{
	
	private int capacidad; // En GBs
	private int velocidad;
	private boolean esSSD;
	
	public DiscoDuro(String referencia, float precio, int capacidad, int velocidad, boolean esSSD) {
		super(referencia, precio);
		this.capacidad = capacidad;
		this.velocidad = velocidad;
		this.esSSD = esSSD;
	}
	

	public DiscoDuro(int capacidad, int velocidad, boolean esSSD) {
		super();
		this.capacidad = capacidad;
		this.velocidad = velocidad;
		this.esSSD = esSSD;
	}
	
	public DiscoDuro() {
		super();
		this.capacidad = 0;
		this.velocidad = 0;
		this.esSSD = false;
	}


	public int getCapacidad() {
		return capacidad;
	}


	public void setCapacidad(int capacidad) {
		this.capacidad = capacidad;
	}


	public int getVelocidad() {
		return velocidad;
	}


	public void setVelocidad(int velocidad) {
		this.velocidad = velocidad;
	}


	public boolean getEsSSD() {
		return esSSD;
	}


	public void setEsSSD(boolean esSSD) {
		this.esSSD = esSSD;
	}
	
	public void mostrarProducto()
	{
		System.out.println("Tipo: Disco Duro");
		System.out.println("Referencia: " + this.getReferencia());
		System.out.println("Precio: " + this.getPrecio());
		System.out.println("Capacidad: " + this.getCapacidad());
		System.out.println("Velocidad: " + this.getVelocidad());
		System.out.println("SDD: " + this.getEsSSD());
	}
	
	@Override
	public String toString() {
		return "DiscoDuro [Referencia= " + this.getReferencia() + ", Precio=" + this.getPrecio() + ", Capacidad=" + capacidad + ", Velocidad=" + velocidad + ", SDD=" + esSSD +"]";
	}
	
}
