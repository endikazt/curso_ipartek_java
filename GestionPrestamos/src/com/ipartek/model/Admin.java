package com.ipartek.model;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Admin extends Usuario{
	
	private static ArrayList<Disco> listaDiscos;
	private static ArrayList<Prestamo> listaPrestamos;
	private static ArrayList<Usuario> listaUsuarios;
	
	
	
	public Admin(String dni, String nombre, String apellidos) {
		super(dni, nombre, apellidos);
		cargarListaDiscos();
		cargarListaUsuarios();
		cargarListaPrestamos();
	}

	public Admin() {
		super();
		cargarListaDiscos();	
		cargarListaUsuarios();
		cargarListaPrestamos();
	}

	public ArrayList<Disco> getListaDiscos() {
		return listaDiscos;
	}

	public void setListaDiscos(ArrayList<Disco> listaDiscos) {
		this.listaDiscos = listaDiscos;
	}

	public ArrayList<Prestamo> getListaPrestamos() {
		return listaPrestamos;
	}

	public void setListaPrestamos(ArrayList<Prestamo> listaPrestamos) {
		this.listaPrestamos = listaPrestamos;
	}
	
	public ArrayList<Usuario> getListaUsuarios() {
		return listaUsuarios;
	}

	public static void setListaUsuarios(ArrayList<Usuario> listaUsuarios) {
		Admin.listaUsuarios = listaUsuarios;
	}

	public void aniadirDisco(Disco disco)
	{
		
	}
	
	public void abrirPrestamo(Usuario usuario, Disco disco)
	{
		
		Prestamo prestamo = new Prestamo(usuario, disco);
		listaPrestamos.add(prestamo);
		
		for(int x = 0; x < this.listaDiscos.size(); x++)
		{
			if(listaDiscos.get(x).getCodigoDisco() == disco.getCodigoDisco())
			{
				listaDiscos.get(x).setEstaPrestado(true);
			}	
		}
		
	}
	
	public void cerrarPrestamo(Prestamo prestamo)
	{
		for(int i = 0; i < this.listaPrestamos.size(); i++)
		{
			if(listaPrestamos.get(i).getCodigoPrestamo() == prestamo.getCodigoPrestamo())
			{
				listaPrestamos.get(i).setPrestamoActivo(false);
				listaPrestamos.get(i).setFechaFin();
			}	
		}
		

		for(int x = 0; x < this.listaDiscos.size(); x++)
		{
			if(listaDiscos.get(x).getCodigoDisco() == prestamo.getDiscoPrestado().getCodigoDisco())
			{
				listaDiscos.get(x).setEstaPrestado(false);
			}	
		}
	}	

	
	public void cargarListaDiscos() {
		
		listaDiscos = new ArrayList<Disco>();
		
		listaDiscos.add(new Disco("HIGHWAY TO HELL", "AC/DC", "hard rock",true));
		listaDiscos.add(new Disco("Master of Puppets", "Metallica", "hard rock",false));
		listaDiscos.add(new Disco("Kill 'Em All", "Metallica", "hard rock",false));
		listaDiscos.add(new Disco("The Number of the Beast", "Iron Maiden", "hard rock",false));
		listaDiscos.add(new Disco("The Final Frontier", "Iron Maiden", "hard rock",false));
		listaDiscos.add(new Disco("Cut out the Lights ", "Satellite Stories", "Alternative rock / Indie",false));
		listaDiscos.add(new Disco("Vagabonds", "Satellite Stories", "Alternative rock / Indie",false));
		listaDiscos.add(new Disco("Thank You, My Twilight", "The Pillows", "Alternative rock",false));
		listaDiscos.add(new Disco("Rebroadcast", "The Pillows", "Alternative rock",false));
		
	}
	
	public void cargarListaPrestamos() {
		
		listaPrestamos = new ArrayList<Prestamo>();
		
		listaPrestamos.add(new Prestamo(listaUsuarios.get(0), listaDiscos.get(0)));
		
	}

	public void cargarListaUsuarios() {
	
	listaUsuarios = new ArrayList<Usuario>();
	
	listaUsuarios.add(new Usuario("6549416548", "Endika", "Zuazo"));
	listaUsuarios.add(new Usuario("6549416548", "Iñigo", "Hernadez"));
	listaUsuarios.add(new Usuario("6549416548", "Jon", "Mendezona"));
	listaUsuarios.add(new Usuario("6549416548", "Julen", "Rodriguez"));
	listaUsuarios.add(new Usuario("6549416548", "Arkaitz", "Mañas"));
	
	}
	
	/**
	 * Método que permite eliminar un disco, comprobando que el disco no este prestado.
	 * 
	 * @param disco
	 */
	public void eliminarDisco(Disco disco) {
		
		boolean encontrado = false;
		
		if (disco.getEstaPrestado() == true) {
			encontrado = true;
		} else {
			for (int i = 0; i < listaDiscos.size(); i++) {
				if (listaDiscos.get(i).getCodigoDisco() == disco.getCodigoDisco()) {
					listaDiscos.remove(i);
					JOptionPane.showMessageDialog(null,
							"Se ha eliminado el disco " + disco.getTituloDisco() + " con éxito.");
				}
			}
		}
		
		if(encontrado)
		{
			JOptionPane.showMessageDialog(null, "Error, no puedes eliminar un disco prestado");
		}
	}
	
	/**
	 * 
	 * Método que permite eliminar un usuario, comprobando que el usuario no tenga
	 * ningún préstamo activo.
	 * 
	 * @param usuario
	 * 
	 */

	public void eliminarUsuario(Usuario usuario) {
		
		boolean encontrado = false;
		
		for (int i = 0; i < listaPrestamos.size(); i++) {
			if (listaPrestamos.get(i).getUsuarioPrestado().getDniUsuario().equalsIgnoreCase(usuario.getDniUsuario())) {
				encontrado = true;
			} else {
				listaUsuarios.remove(i);
				JOptionPane.showMessageDialog(null, "Se ha eliminado el usuario " + usuario.getNombreUsuario() + " con éxito.");
			}
		}
		
		if(encontrado)
		{
			JOptionPane.showMessageDialog(null, "No se puede eliminar el usuario " + usuario.getNombreUsuario()
			+ " porque tiene préstamos activos.");
		}
	}

	/**
	 * 
	 * Método que permite eliminar un préstamo, comprobando que el disco no este
	 * prestado.
	 * 
	 * @param préstamo
	 * 
	 */

	public void eliminarPrestamo(Prestamo prestamo) {
		
		boolean encontrado = false;
		
		for (int i = 0; i < listaPrestamos.size(); i++) {
			if (listaPrestamos.get(i).getPrestamoActivo() == true) {
				encontrado = true;
			}else {
				listaPrestamos.remove(i);
				JOptionPane.showMessageDialog(null, "El préstamo " + prestamo.getCodigoPrestamo() + " se ha eliminado con éxito.");
			}
		}
		
		if(encontrado)
		{
			JOptionPane.showMessageDialog(null, "No se puede eliminar el préstamo " + prestamo.getCodigoPrestamo()
			+ " debido a que esta activo.");
		}
	}
}
