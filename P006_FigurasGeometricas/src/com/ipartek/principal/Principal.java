package com.ipartek.principal;

import java.util.ArrayList;
import java.util.Scanner;

import com.ipartek.clases.Circulo;
import com.ipartek.clases.Cuadrado;
import com.ipartek.clases.FiguraGeometrica;
import com.ipartek.clases.Triangulo;

public class Principal 
{
	
	public static void main(String[] args) 
	{
		
		ArrayList<FiguraGeometrica> listaFiguras = new ArrayList<FiguraGeometrica>();
		
		cargarMenu(listaFiguras);
		
	}
	
	public static void mostrarListaFiguras(ArrayList<FiguraGeometrica> listaFiguras)
	{
		System.out.println("");
		System.out.println("Monstrando contenido de la lista de figuras: ");
		System.out.println();
		
		for(int i = listaFiguras.size()-1; i >= 0; i--)
		{
			System.out.println("Posicion en la lista " + i);
			listaFiguras.get(i).mostrarInfo();
			listaFiguras.get(i).calcularArea();
			listaFiguras.get(i).calcularPerimetro();
			System.out.println();
			
		}
	}

	
	public static void cargarMenu(ArrayList<FiguraGeometrica> listaFiguras)
	{
		System.out.println("//////////////////////////");	
		System.out.println("////////////MENU//////////");	
		System.out.println("//////////////////////////");
		System.out.println("");
		
		System.out.println("Seleccione una opcion:");
		System.out.println("A) Crear un triangulo");
		System.out.println("B) Crear un cuadrado");
		System.out.println("C) Crear un circulo");
		System.out.println("S) Salir");
		System.out.println("");
		
		Scanner sc = new Scanner(System.in);
		
		String opcionElegidaPrincipal = sc.nextLine();
		
		switch (opcionElegidaPrincipal) {
		case "a":
			
			String altura = "";
			String base = "";
			String nombreTriangulo = "";
			
			System.out.println("Introduza el nombre del triangulo: ");
			
			nombreTriangulo = sc.nextLine();
			
			do {
				
				System.out.println("Introduza el valor de la altura: ");
				
				altura = sc.nextLine();
				
			} while (!altura.matches("[0-9]+"));
				
			
			do
			{
				
				System.out.println("Introduza el valor de la base: ");
				
				base = sc.nextLine();		
				
			} while (!base.matches("[0-9]+"));
				
			
			listaFiguras.add(new Triangulo(nombreTriangulo, Integer.parseInt(base), Integer.parseInt(altura)));
			
			System.out.println("Figura introducida correctamente :)");
			
			mostrarListaFiguras(listaFiguras);
			
			System.out.println("Volviendo al menu principal...");
			System.out.println("");
			
			cargarMenu(listaFiguras);
			
			break;
			
		case "b":
			
			String lado = "";
			String nombreCuadrado = "";
			
			System.out.println("Introduza el nombre del cuadrado: ");
			
			nombreCuadrado = sc.nextLine();
			
			do {
				
				System.out.println("Introduza el valor de los lados del cuadrado: ");
				
				lado = sc.nextLine();
				
			} while (!lado.matches("[0-9]+"));
			
			listaFiguras.add(new Cuadrado(nombreCuadrado, Integer.parseInt(lado)));
			
			System.out.println("Figura introducida correctamente :)");
			
			mostrarListaFiguras(listaFiguras);
			
			System.out.println("Volviendo al menu principal...");
			System.out.println("");
			
			cargarMenu(listaFiguras);
			
			break;
			
		case "c":
			
			String radio = "";
			String nombreCirculo = "";
			
			System.out.println("Introduza el nombre del circulo: ");
			
			nombreCuadrado = sc.nextLine();
			
			do {
				
				System.out.println("Introduza el valor del radio del circulo: ");
				
				radio = sc.nextLine();
				
			} while (!radio.matches("[0.0-9.9]+"));
			
			listaFiguras.add(new Circulo(nombreCuadrado, Integer.parseInt(radio)));
			
			System.out.println("Figura introducida correctamente :)");
			
			mostrarListaFiguras(listaFiguras);
			
			System.out.println("Volviendo al menu principal...");
			System.out.println("");
			
			cargarMenu(listaFiguras);
			
			break;
			
		case "s":
			
			System.out.println("Cerrando aplicacion...");			
			System.exit(0);
			
			break;

		default:
			
			System.out.println("Tienes que elegir una opcion valida >:(");
			System.out.println("");
			cargarMenu(listaFiguras);
			break;
		}
		
	}
	
	
}
