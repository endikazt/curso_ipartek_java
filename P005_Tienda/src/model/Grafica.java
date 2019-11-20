package model;

public class Grafica extends Producto implements ElementoTienda {
	
	private int memoria;
	private String conexion;
	
	public Grafica(String referencia, float precio, int memoria, String conexion) {
		super(referencia, precio);
		this.memoria = memoria;
		this.conexion = conexion;
	}
	
	public Grafica(int memoria, String conexion) {
		super();
		this.memoria = memoria;
		this.conexion = conexion;
	}
	
	public Grafica() {
		super();
		this.memoria = 0;
		this.conexion = "PCI-E";
	}

	public int getMemoria() {
		return memoria;
	}

	public void setMemoria(int memoria) {
		this.memoria = memoria;
	}

	public String getConexion() {
		return conexion;
	}

	public void setConexion(String conexion) {
		this.conexion = conexion;
	}
	
	public void mostrarProducto()
	{
		System.out.println("Tipo: Grafica");
		System.out.println("Referencia: " + this.getReferencia());
		System.out.println("Precio: " + this.getPrecio());
		System.out.println("Memoria: " + this.getMemoria());
		System.out.println("Conexion: " + this.getConexion());
	}

	@Override
	public String toString() {
		return "Grafica [Referencia= " + this.getReferencia() + ", Precio=" + this.getPrecio() + ", Memoria=" + memoria + ", Conexion=" + conexion + "]";
	}
	
	
	
}
