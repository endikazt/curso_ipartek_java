package model;

public class Procesador extends Producto{

	private String modelo;
	private int velocidad;
	
	public Procesador(String referencia, float precio, String modelo, int velocidad) {
		super(referencia, precio);
		this.modelo = modelo;
		this.velocidad = velocidad;
	}
	
	public Procesador(String modelo, int velocidad) {
		super();
		this.modelo = modelo;
		this.velocidad = velocidad;
	}
	
	public Procesador() {
		super();
		this.modelo = "";
		this.velocidad = 0;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getVelocidad() {
		return velocidad;
	}

	public void setVelocidad(int velocidad) {
		this.velocidad = velocidad;
	}
	
	public void mostrarProducto()
	{
		System.out.println("Tipo: Procesador");
		System.out.println("Referencia: " + this.getReferencia());
		System.out.println("Precio: " + this.getPrecio());
		System.out.println("Modelo: " + this.getModelo());
		System.out.println("Velocidad: " + this.getVelocidad());
	}
	
	@Override
	public String toString() {
		return "Procesador [Referencia= " + this.getReferencia() + ", Precio=" + this.getPrecio() + ", Modelo=" + modelo + ", Velocidad=" + velocidad +"]";
	}
	
}
