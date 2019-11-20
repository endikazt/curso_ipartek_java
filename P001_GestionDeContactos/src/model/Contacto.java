package model;

public class Contacto {
	
	private String nombre, apellidos, fechaNacimiento, telefono, email;

	public Contacto() 
	{
		super();
		this.nombre = "";
		this.apellidos = "";
		this.fechaNacimiento = "";
		this.telefono = "";
		this.email = "";
	}

	public Contacto(String nombre, String apellidos, String fechaNacimiento, String telefono, String email) 
	{
		super();
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.fechaNacimiento = fechaNacimiento;
		this.telefono = telefono;
		this.email = email;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(String fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	public void mostrarDatos()
	{
		System.out.println(nombre + " " + apellidos);
		System.out.println("Fecha de nacieminto: " + fechaNacimiento);
		System.out.println("Email: " + email);
	}

}
