package model;

public class Empresa {
	
	private String nombre, direccion, telefono;

	public Empresa() {
		super();
		this.nombre = "";
		this.direccion = "";
		this.telefono = "";
	}

	public Empresa(String nombre, String direccion, String telefono) {
		super();
		this.nombre = nombre;
		this.direccion = direccion;
		this.telefono = telefono;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	
	public void mostrarDatos()
	{
		System.out.println(nombre + ", " + direccion + ", telefono " + telefono);
		
	}

}
