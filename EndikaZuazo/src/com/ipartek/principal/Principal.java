package com.ipartek.principal;

import java.util.ArrayList;

import com.ipartek.clases.Auxiliar;
import com.ipartek.clases.Libro;

/**
 * 
 * @author Endika Zuazo Txintxurreta
 *
 */

public class Principal 
{
	
	public static void main(String[] args) 
	{
		
		// Se inicializa un arraylist de libros donde se guardaran todos los libros que se creen mediante el menu
		
		ArrayList<Libro> listaLibros = new ArrayList<Libro>();
				
		// Se cargan varios libros en el arrayList que hemos creado antes
				
		listaLibros.add(new Libro("Cujo", "5684161987", 350, false));
		listaLibros.add(new Libro("La torre oscura", "1894161981", 542, true));
		listaLibros.add(new Libro("La niebla", "214161981", 450, false));
		listaLibros.add(new Libro("Metro 2033", "5424161981", 324, true));
		listaLibros.add(new Libro("La tierra errante", "6244161981", 415,  false));
		listaLibros.add(new Libro("El problema de los tres cuerpos", "4754161981", 536,  false));
		listaLibros.add(new Libro("El despertar del leviathan", "4541619817", 536,  false));
		listaLibros.add(new Libro("La guerra de Caliban", "4624161981", 490,  false));
		listaLibros.add(new Libro("Lad puertas de Abadon", "2544161981", 480, false));
		listaLibros.add(new Libro("La quema de Cibola", "3244161981", 505, false));
				
		// Llamamos a la funcion que se encarga de cargar el menu de la aplicacion
				
		cargarMenu(listaLibros);
		
	}
	
	// Esta funcion se encarga de listar todos los objectos del arrayList que se le pasa como parametro
	
	public static void cargarListaLibros(ArrayList<Libro> listaLibros)
	{
		System.out.println("///////////////////////////////////////////");	
		System.out.println("////////////LISTADO DE LIRBOS//////////////");
		System.out.println("///////////////////////////////////////////");	
		System.out.println("");
		
		for(int i = 0; i < listaLibros.size(); i++)
		{
			
			System.out.println(i + " - " + listaLibros.get(i).toString());
			
		}
		
		System.out.println("");
		System.out.println("Volviendo al menu principal...");
		System.out.println("");
		cargarMenu(listaLibros);
	}
	
	// Esta funcion se encarga de cargar el menu principal de la aplicacion
	// Se le pasa como parametro un arrayList de libros, que se utilizara para pasarselo a otros metodos como parametro
	
	public static void cargarMenu(ArrayList<Libro> listaLibros)
	{
		
		System.out.println("///////////////////////////////////////////");	
		System.out.println("////////APP DE GESTION DE LIBROS//////////");	
		System.out.println("//////////////////////////////////////////");
		System.out.println("");
		
		System.out.println("Seleccione una opcion:");
		System.out.println("A) Crear un libro");
		System.out.println("B) Mostrar lista de libros");
		System.out.println("S) Salir");
		System.out.println("");
		
		String respuestaMenu;
		
		do
		{	
			respuestaMenu = Auxiliar.leerTeclado();
			
			switch (respuestaMenu) 
			{
			case "a": case "A":
				
				menuOpcionA(listaLibros);
				
				break;
			case "b": case "B":
				
				cargarListaLibros(listaLibros);
				
				break;
				
			case "s": case "S":
				
				System.out.println("");
				System.out.println("Saliendo de la aplicacion...");
				System.exit(0);
				
				break;
	
			default:
				System.out.println("Introduce una opcion valida (A, B o S).");
				break;
			}
			
		} while(!respuestaMenu.matches("[absABS]"));
		
	}
	
	// Se encarga de cargar el menu de la opcion A, donde se muestra un formulario 
	// para ingresar libros a la lista de libros que se pasa como parametro
	
	public static void menuOpcionA(ArrayList<Libro> listaLibros)
	{
		
		Libro nuevoLibro = new Libro();
		
		String titulo = "";
		String isbn = "";
		int numPaginas = 0;
		String respuestaFormato = "";
		
		//Bucle donde se pregunta por el titulo de libro
		
		do 
		{
			
			System.out.println("Introduce el titulo del libro (Entre 3 y 150 letras): ");
			
			titulo = Auxiliar.leerTeclado();
			
		} while (titulo.length() < 3 || titulo.length() > 150);
		
		nuevoLibro.setTitulo(titulo);
		
		// Bucle donde se pregunta por el ISBN del libro
		// Se comprueba si tiene un longitud de 10 y si los valores del ISBN son todo numericos
		
		do 
		{			
			System.out.println("Introduce el ISBN del libro (10 numeros): ");
			
			isbn = Auxiliar.leerTeclado();
			
		} while (isbn.length() != 10 && !isbn.matches("[0-9]+") || isbn.length() == 10 && !isbn.matches("[0-9]+") ||  isbn.length() != 10 && isbn.matches("[0-9]+"));
		
		nuevoLibro.setIsbn(isbn);		
		
		// Bucle donde se pregunta el numero de paginas que tiene el libro
		// Se comprueba si el numero de pagina es mayor o igual a 1 y si el valor introducido es numerico o no
		
		do 
		{
				
			try 
			{
				System.out.println("Introduce el numero de paginas del libro (Minimo 1 pagina): ");
				
				numPaginas = Integer.parseInt(Auxiliar.leerTeclado());
				
			} catch (NumberFormatException e) {
				System.out.println("Tiene que introducir un valor numerico mayor o igual a 1.");
				System.out.println("");
			}
			
		} while (numPaginas < 1);
		
		nuevoLibro.setNumPaginas(numPaginas);				
		
		// Bucle donde se pregunta por el formato del libro
		// Se comprueba si el valor introducido es "digital" o "papel", en caso de que no lo sea se repite la pregunta
		// Si la respuesta es "digital" el valor que se pone en el campo de "formato" del objeto "nuevoLibro" es true
		// Si la respuesta es "papel" el valor que se pone en el campo de "formato" del objeto "nuevoLibro" es false
		
		do 
		{
				
				System.out.println("Introduce el formato de libro (digital o papel): ");
				
				respuestaFormato = Auxiliar.leerTeclado();
				
				if(respuestaFormato.equalsIgnoreCase("digital"))
				{
					nuevoLibro.setFormato(true);
				}
				
				if(respuestaFormato.equalsIgnoreCase("papel"))
				{
					nuevoLibro.setFormato(false);
				}
			
			
		} while (!respuestaFormato.equalsIgnoreCase("digital") && !respuestaFormato.equalsIgnoreCase("papel"));	
		
		System.out.println("");
		System.out.println("Informacion del libro a ingresar: ");
		System.out.println(nuevoLibro.toString());
		System.out.println("");
		System.out.println("¿Desea proceder con la inserccion del libro en la lista de libros? s/n o si/no");

		String respuestaFinal = "";
		
		// Si la respuesta a la pregunta es afirmativa, se añade el libro a la lista y se vuelve al menu principal pasando como parametro la lista actualizada
		// Si la respuesta a la pregunta es negativa, se cancela la operacion y se vuelve al menu principal pasando como parametro la lista actualizada
		
		do 
		{
			
			respuestaFinal = Auxiliar.leerTeclado();
			
			if(respuestaFinal.equalsIgnoreCase("s") || respuestaFinal.equalsIgnoreCase("si"))
			{
				listaLibros.add(nuevoLibro);
				System.out.println("Operacion realizada con exito. Libro añadido a la lista de libros.");
				System.out.println("");				
				System.out.println("Volviendo al menu principal...");
				System.out.println("");
				cargarMenu(listaLibros);
			}
			
			if(respuestaFinal.equalsIgnoreCase("n") || respuestaFinal.equalsIgnoreCase("no"))
			{
				System.out.println("Operacion cancelada.");
				System.out.println("");
				System.out.println("Volviendo al menu principal...");
				System.out.println("");
				cargarMenu(listaLibros);
			}		
			
		} while (!respuestaFinal.equalsIgnoreCase("s") && !respuestaFinal.equalsIgnoreCase("si") && !respuestaFinal.equalsIgnoreCase("n") && !respuestaFinal.equalsIgnoreCase("no"));
				
	}

}
