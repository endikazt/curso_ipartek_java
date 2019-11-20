package com.ipartek.utils;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;

import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import com.ipartek.model.Admin;
import com.ipartek.model.Disco;
import com.ipartek.model.Prestamo;
import com.ipartek.model.Usuario;

public class Auxiliar {
	
	public static String obtenerFecha()
	{
		String timeStamp = new SimpleDateFormat("dd/MM/yyyy_HH:mm:ss").format(Calendar.getInstance().getTime());
	
		return timeStamp;	
	}
	
	/**
	 * Método estático que sirve para rellenar una tabla con la lista de discos
	 * 
	 * @param listaDiscos
	 * @param table
	 */
	public static void mostrarDiscos(ArrayList<Disco> listaDiscos, JTable table) {
		DefaultTableModel modelo = (DefaultTableModel) table.getModel();
		for (int i = 0; i < listaDiscos.size(); i++) {
			Object[] fila = new Object[5];

			fila[0] = listaDiscos.get(i).getCodigoDisco();
			fila[1] = listaDiscos.get(i).getTituloDisco().toUpperCase();
			fila[2] = listaDiscos.get(i).getGrupoDisco().toUpperCase();
			fila[3] = listaDiscos.get(i).getGeneroDisco().toUpperCase();
			if (listaDiscos.get(i).getEstaPrestado() == true) {
				fila[4] = "SI";
			} else {
				fila[4] = "NO";
			}
			modelo.addRow(fila);
		}
	}

	/**
	 * Método estático que sirve para rellenar una tabla con la lista de usuarios
	 * 
	 * @param listaUsuarios
	 * @param table
	 */

	public static void mostrarUsuarios(ArrayList<Usuario> listaUsuarios, JTable table) {
		DefaultTableModel modelo = (DefaultTableModel) table.getModel();
		for (int i = 0; i < listaUsuarios.size(); i++) {
			Object[] fila = new Object[3];
			fila[0] = listaUsuarios.get(i).getDniUsuario().toUpperCase();
			fila[1] = listaUsuarios.get(i).getNombreUsuario().toUpperCase();
			fila[2] = listaUsuarios.get(i).getApellidosUsuario().toUpperCase();

			modelo.addRow(fila);
		}
	}

	/**
	 * Método estático que sirve para rellenar una tabla con la lista de préstamos
	 * 
	 * @param listaPrestamos
	 * @param table
	 */
	public static void mostrarPrestamos(ArrayList<Prestamo> listaPrestamos, JTable table) {
		DefaultTableModel modelo = (DefaultTableModel) table.getModel();
		for (int i = 0; i < listaPrestamos.size(); i++) {
			Object[] fila = new Object[8];
			fila[0] = listaPrestamos.get(i).getCodigoPrestamo();
			fila[1] = listaPrestamos.get(i).getUsuarioPrestado().getDniUsuario().toUpperCase();
			fila[2] = listaPrestamos.get(i).getUsuarioPrestado().getNombreUsuario().toUpperCase();
			fila[3] = listaPrestamos.get(i).getUsuarioPrestado().getApellidosUsuario().toUpperCase();
			fila[4] = listaPrestamos.get(i).getDiscoPrestado().getCodigoDisco();
			fila[5] = listaPrestamos.get(i).getDiscoPrestado().getTituloDisco().toUpperCase();
			fila[6] = listaPrestamos.get(i).getFechaInicio().toUpperCase();
			fila[7] = listaPrestamos.get(i).getFechaFin().toUpperCase();

			modelo.addRow(fila);
		}
	}
	
	public static void refrescarTablaDiscos(Admin admin, JTable table)
	{

		//Refrescamos la tabla con el nuevo disco
		DefaultTableModel model = (DefaultTableModel) table.getModel();
		model.setRowCount(0);
		mostrarDiscos(admin.getListaDiscos(), table);

	}
	
	public static void refrescarTablaUsuarios(Admin admin, JTable table)
	{

		//Refrescamos la tabla con el nuevo disco
		DefaultTableModel model = (DefaultTableModel) table.getModel();
		model.setRowCount(0);
		mostrarUsuarios(admin.getListaUsuarios(),table);

	}
	
	public static void refrescarTablaPrestamos(Admin admin, JTable table)
	{

		//Refrescamos la tabla con el nuevo disco
		DefaultTableModel model = (DefaultTableModel) table.getModel();
		model.setRowCount(0);
		mostrarPrestamos(admin.getListaPrestamos(), table);

	}
	
	public static void recargarComboUsuarios(JComboBox<ComboUsuarios> combo, Admin admin)
	{
		for(int i = 0; i < admin.getListaUsuarios().size(); i++)
		{
			combo.addItem(new ComboUsuarios(admin.getListaUsuarios().get(i).getDniUsuario(), admin.getListaUsuarios().get(i)));
		}
	}
	
	public static void recargarComboDiscos(JComboBox<ComboDisco> combo, Admin admin)
	{
		combo.removeAll();
		
		for(int i = 0; i < admin.getListaDiscos().size(); i++)
		{
			if(admin.getListaDiscos().get(i).getEstaPrestado() == false)
			{
				combo.addItem(new ComboDisco(admin.getListaDiscos().get(i).getCodigoDisco(), admin.getListaDiscos().get(i)));
			}
		}
	}
	
	/**
	 * Método estático que sirve para comprobar que un dni sea válido
	 * 
	 * @param usuario
	 * 
	 */
	public static boolean validarDni(String dni) {
		String regexDni = "(([x-z]|[X-Z]{1})([-]?)(\\d{7})([-]?)([a-z]|[A-Z]{1}))|((\\d{8})([-]?)([a-z]|[A-Z]{1}))";
		// String regexDni = "^[0-9]{8,8}[A-Za-z]$";
		if (dni.matches(regexDni)) {
			return true;
		} else {

			return false;

		}

	}
	
	public static Usuario buscarUsuario(String dniUsuario, Admin admin)
	{
		
		Usuario usuario = new Usuario();
		
		for(int i = 0; i < admin.getListaUsuarios().size();i++)
		{
			if(admin.getListaUsuarios().get(i).getDniUsuario().equals(dniUsuario))
			{
				usuario = admin.getListaUsuarios().get(i);
			}
		}
		
		return usuario;
		
	}
	
	public static Prestamo buscarPrestamo(int codigoPrestamo, Admin admin)
	{
		
		Prestamo prestamo = new Prestamo();
		
		for(int i = 0; i < admin.getListaPrestamos().size();i++)
		{
			if(admin.getListaPrestamos().get(i).getCodigoPrestamo() == codigoPrestamo)
			{
				prestamo = admin.getListaPrestamos().get(i);
			}
		}
		
		return prestamo;
		
	}
	
	public static Disco buscarDisco(int codigoDisco, Admin admin)
	{
		
		Disco disco = new Disco();
		
		for(int i = 0; i < admin.getListaDiscos().size();i++)
		{
			if(admin.getListaDiscos().get(i).getCodigoDisco() == codigoDisco)
			{
				disco = admin.getListaDiscos().get(i);
			}
		}
		
		return disco;
		
	}

}
