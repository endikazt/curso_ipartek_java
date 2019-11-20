package com.ipartek.principal;

import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.text.AbstractDocument.LeafElement;

import com.ipartek.clases.Auxiliar;
import com.ipartek.clases.Boligrafo;
import com.ipartek.clases.Dureza;
import com.ipartek.clases.Folio;
import com.ipartek.clases.Lapiz;
import com.ipartek.clases.Producto;

public class Principal {
	
	public static void main(String[] args) {
		
		ArrayList<Producto> catalogoProductos = new ArrayList<Producto>();
		
		cargarMenuPrincipal(catalogoProductos);
	
	}
	
	public static void visualizarListaProductos(ArrayList<Producto> catalogoProductos, String opcion)
	{
		
		if(opcion.equals("E") || opcion.equals("e"))
		{
			
			System.out.println("");
			System.out.println("LISTADO DE PRODUCTOS");
			System.out.println("////////////////////");
			System.out.println("");
			System.out.println("Cantidad de productos en el catalogo: " + Producto.getContadorUnidades());
			System.out.println("");
			
			for(int i = 0; i < catalogoProductos.size(); i++)
			{
				
				System.out.println(i + " - " + catalogoProductos.get(i).mostrarInfo());
				
			}
			
		} else {
			
			if(catalogoProductos.isEmpty()) 
			{
				
				System.out.println("El catalogo esta vacio :(");
				System.out.println("");
				System.out.println("Cargando el menu principal...");
				System.out.println("");
				cargarMenuPrincipal(catalogoProductos);
				
			} 
			else
			{
				System.out.println("");
				System.out.println("LISTADO DE PRODUCTOS");
				System.out.println("////////////////////");
				System.out.println("");
				System.out.println("Cantidad de productos en el catalogo: " + Producto.getContadorUnidades());
				System.out.println("");
				
				for(int i = 0; i < catalogoProductos.size(); i++)
				{
					
					System.out.println(i + " - " + catalogoProductos.get(i).mostrarInfo());
					
				}				
				
				System.out.println("");
				System.out.println("Volviendo al menu principal...");
				cargarMenuPrincipal(catalogoProductos);
				
			}
		}
		
	}
	
	public static void cargarMenuPrincipal(ArrayList<Producto> catalogoProductos)
	{
		System.out.println("//////////////////////////");	
		System.out.println("////////MENU TIENDA///////");	
		System.out.println("//////////////////////////");
		System.out.println("");
		System.out.println("OPCIONES DISPONIBLES:");
		System.out.println("A) Añadir lapiz");
		System.out.println("B) Añadir bolis");
		System.out.println("C) Añadir folios");
		System.out.println("D) Visualizar lista de productos");
		System.out.println("E) Salir");
		System.out.println("");
		
		String opcionElegidaPrincipal = Auxiliar.leerTeclado();
		
		switch (opcionElegidaPrincipal) {
		case "a": case "A":
			
			menuOpcionA(catalogoProductos);
			
			break;
		case "b": case "B":
			
			menuOpcionB(catalogoProductos);
			
			break;
		case "c": case "C":
			
			menuOpcionC(catalogoProductos);
			
			break;
		case "d": case "D":
			
			visualizarListaProductos(catalogoProductos, opcionElegidaPrincipal);
			
			break;
		case "e": case "E":
			
			visualizarListaProductos(catalogoProductos, opcionElegidaPrincipal);
			System.out.println("");
			System.out.println("Saliendo de la aplicacion...");
			System.exit(0);
			
			break;
		default:
			break;
		}
	}
	
	public static void menuOpcionA(ArrayList<Producto> catalogoProductos)
	{
		Lapiz lapiz = new Lapiz();
		
		String referencia = "";		
		
		do
		{
			
			System.out.println("Introduce una referencia para el lapiz:");
			referencia = Auxiliar.leerTeclado();
			
			
		} while (referencia.equals(""));
		
		lapiz.setReferencia(referencia);
		
		String respuestaBoolean = "";
		
		do {
			
			System.out.println("Introduce si tiene goma o no (s/n o si/no):");
			
			respuestaBoolean = Auxiliar.leerTeclado();
			
			
		} while (!respuestaBoolean.equalsIgnoreCase("s") && !respuestaBoolean.equalsIgnoreCase("si") && !respuestaBoolean.equalsIgnoreCase("n") && !respuestaBoolean.equalsIgnoreCase("no"));
		
		
		if(respuestaBoolean.equalsIgnoreCase("s") || respuestaBoolean.equalsIgnoreCase("si"))
		{
			lapiz.setTieneGoma(true);
		}
		
		if(respuestaBoolean.equalsIgnoreCase("n") || respuestaBoolean.equalsIgnoreCase("no"))
		{
			lapiz.setTieneGoma(false);
		}
		
		String respuestaDureza;
		
		do
		{
			System.out.println("Introduce la dureza del lapiz:");
			respuestaDureza = Auxiliar.leerTeclado();
	
		} while(respuestaDureza.equals("") || respuestaDureza.length() > 2);
		
		Dureza obDureza = new Dureza();
			
		obDureza.setNumeroDureza(respuestaDureza.substring(0,1));
		
		obDureza.setLetraDureza(respuestaDureza.substring(1,2));
		
		lapiz.setDureza(obDureza);
		
		catalogoProductos.add(lapiz);
		
		cargarMenuPrincipal(catalogoProductos);
		
	}
	
	public static void menuOpcionB(ArrayList<Producto> catalogoProductos)
	{
		Boligrafo boli = new Boligrafo();
		
		String referencia = "";		
		
		do
		{
			
			System.out.println("Introduce una referencia para el boligrafo:");
			referencia = Auxiliar.leerTeclado();
			
			
		} while (referencia.equals(""));
		
		boli.setReferencia(referencia);
		
		String respuestaColor;
		
		do
		{
			System.out.println("Introduce el color del boligrafo:");
			respuestaColor = Auxiliar.leerTeclado();
	
		} while(respuestaColor.equals(""));
		
		boli.setColor(respuestaColor);
		
		System.out.println("Producto introducido correctamente.");
		
		catalogoProductos.add(boli);
		
		cargarMenuPrincipal(catalogoProductos);
		
	}
	
	public static void menuOpcionC(ArrayList<Producto> catalogoProductos)
	{
		Folio folio = new Folio();
		
		String referencia = "";		
		
		do
		{
			
			System.out.println("Introduce una referencia para el folio:");
			referencia = Auxiliar.leerTeclado();
			
			
		} while (referencia.equals(""));
		
		folio.setReferencia(referencia);
		
		String respuestaTipo;
		
		do
		{
			System.out.println("Introduce el tipo de folio:");
			respuestaTipo = Auxiliar.leerTeclado();
	
		} while(respuestaTipo.equals(""));
		
		folio.setTipo(respuestaTipo);
		
		String respuestaGramaje;
		
		do
		{
			System.out.println("Introduce el gramaje del folio:");
			respuestaGramaje = Auxiliar.leerTeclado();
	
		} while(!respuestaGramaje.matches("[0-9]+"));
		
		folio.setGramaje(Integer.parseInt(respuestaGramaje));
		
		catalogoProductos.add(folio);
		
		cargarMenuPrincipal(catalogoProductos);
		
	}
	
	public void menuGestionLapiz(Scanner sc, ArrayList<Producto> catalogoProductos)
	{
		System.out.println("///////////////////////////");	
		System.out.println("//////MENU DE GESTION//////");	
		System.out.println("///////////////////////////");
		System.out.println("");
		System.out.println("OPCIONES DISPONIBLES:");
		System.out.println("A) Gestionar lapices");
		System.out.println("B) Gestionar bolis");
		System.out.println("C) Gestionar folios");
		System.out.println("D) Volver atras");
		System.out.println("");
		
		String opcionElegidaPrincipal = Auxiliar.leerTeclado();	
		
		switch (opcionElegidaPrincipal) {
		case "a": case "A":
			
			
			
			break;
		case "b": case "B":
			
			
			
			break;
		case "c": case "C":
			
			
			break;
		case "d": case "D":
			
			visualizarListaProductos(catalogoProductos,opcionElegidaPrincipal);
			
		default:
			break;
		}
	}

}
