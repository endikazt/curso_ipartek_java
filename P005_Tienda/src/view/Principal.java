package view;

import java.util.ArrayList;
import java.util.Scanner;

import model.DiscoDuro;
import model.Grafica;
import model.Procesador;
import model.Producto;

public class Principal {
	
	public static void main(String[] args) {
		
		ArrayList<Producto> catalogoProductos = new ArrayList<Producto>();
	
		cargarMenuPrincipal(catalogoProductos);
		
	}
	
	public static void cargarListaProductos(ArrayList<Producto> catalogoProductos)
	{
		System.out.println("");
		System.out.println("CATALOGO PRODUCTOS");
		
		for(int i = 0; i < catalogoProductos.size(); i++)
		{
			
			System.out.println(i + " - " + catalogoProductos.get(i).toString());
			
		}
	}
	
	public static void cargarMenuPrincipal(ArrayList<Producto> catalogoProductos)
	{
		
		System.out.println("//////////////////////////");	
		System.out.println("////////MENU TIENDA///////");	
		System.out.println("//////////////////////////");
		System.out.println("");
		
		System.out.println("OPCIONES DISPONIBLES:");
		System.out.println("A) Añadir al stock de la tienda");
		System.out.println("B) Vender producto");
		System.out.println("");
		
		Scanner sc = new Scanner(System.in);
		
		String opcionElegidaPrincipal = sc.nextLine();	
		
		do 
		{				
			
			if(!opcionElegidaPrincipal.equalsIgnoreCase("a") && !opcionElegidaPrincipal.equalsIgnoreCase("b"))
			{
				System.out.println("Introduce una opcion valida");
			}
			
			
			if(opcionElegidaPrincipal.equalsIgnoreCase("a"))
			{
				cargarMenuSecundarioA(catalogoProductos);				
			}
			

			if(opcionElegidaPrincipal.equalsIgnoreCase("b"))
			{
				cargarMenuSecundarioB(catalogoProductos);				
			}
			
		} while(!opcionElegidaPrincipal.equalsIgnoreCase("a") && !opcionElegidaPrincipal.equalsIgnoreCase("b"));
	}
	
	public static void cargarMenuSecundarioA(ArrayList<Producto> catalogoProductos)
	{
		System.out.println("");
		System.out.println("OPCIONES DISPONIBLES DE LA OPCION A':");
		System.out.println("A) Disco Duro");
		System.out.println("B) Procesador");
		System.out.println("C) Grafica");
		System.out.println("D) Volver atras");
		
		Scanner sc = new Scanner(System.in);
		
		String opcionElegida = sc.nextLine();
		
		if(opcionElegida.equalsIgnoreCase("a"))
		{
			DiscoDuro dd = new DiscoDuro();
			
			System.out.println("");
	
			System.out.println("INTRODUCE LA REFERENCIA:");
			dd.setReferencia(sc.nextLine());
		
			System.out.println("INTRODUCE EL PRECIO:");
			dd.setPrecio(Float.parseFloat(sc.nextLine()));
	
			System.out.println("INTRODUCE LA CAPACIDAD:");
			dd.setCapacidad(Integer.parseInt(sc.nextLine()));
		
			System.out.println("INTRODUCE LA VELOCIDAD:");
			dd.setVelocidad(Integer.parseInt(sc.nextLine()));
		
			System.out.println("INTRODUCE SI ES SSD (true o false): ");
			dd.setEsSSD(sc.nextBoolean());
			
			catalogoProductos.add(dd);
			
		}
		
		if(opcionElegida.equalsIgnoreCase("b"))
		{
			
			Procesador pr = new Procesador();
			
			System.out.println("");
		
			System.out.println("INTRODUCE LA REFERENCIA:");
			pr.setReferencia(sc.nextLine());
		
			System.out.println("INTRODUCE EL PRECIO:");
			pr.setPrecio(Float.parseFloat(sc.nextLine()));
			
			System.out.println("INTRODUCE LA MODELO:");
			pr.setModelo(sc.nextLine());
		
			System.out.println("INTRODUCE LA VELOCIDAD:");
			pr.setVelocidad(Integer.parseInt(sc.nextLine()));
			
			catalogoProductos.add(pr);					
			
			
		}
		
		if(opcionElegida.equalsIgnoreCase("c"))
		{
			Grafica gr = new Grafica();
			
			System.out.println("");
			
			System.out.println("INTRODUCE LA REFERENCIA:");
			gr.setReferencia(sc.nextLine());
		
			System.out.println("INTRODUCE EL PRECIO:");
			gr.setPrecio(Float.parseFloat(sc.nextLine()));
	
			System.out.println("INTRODUCE LA MEMORIA:");
			gr.setMemoria(Integer.parseInt(sc.nextLine()));

			System.out.println("INTRODUCE LA CONEXION:");
			gr.setConexion(sc.nextLine());
			
			catalogoProductos.add(gr);	
			
		}
		

		if(opcionElegida.equalsIgnoreCase("d"))
		{
			cargarMenuPrincipal(catalogoProductos);
		}
	}
	
	public static void cargarMenuSecundarioB(ArrayList<Producto> catalogoProductos)
	{
		Scanner sc = new Scanner(System.in);
		
		int tamanioCatalogo = catalogoProductos.size()-1;
		
		if(!catalogoProductos.isEmpty()) 
		{
			cargarListaProductos(catalogoProductos);
				
			System.out.println("");
			
			String posicion = "";
			
			do
			{
				System.out.println("Introduce una posicion valida del producto a eliminar: ");
				posicion= sc.nextLine();
				
				if(posicion.matches("[0-" + tamanioCatalogo + "]"))
				{
				
					System.out.println("¿Estad seguro de que deseas eliminar producto " + catalogoProductos.get(Integer.parseInt(posicion)) + "?");
					String respuesta = sc.nextLine();
					
					if(respuesta.equalsIgnoreCase("si") || respuesta.equalsIgnoreCase("s"))
					{
						catalogoProductos.remove(Integer.parseInt(posicion));
						System.out.println("");
						cargarMenuSecundarioB(catalogoProductos);
					}
					
					if(respuesta.equalsIgnoreCase("no") || respuesta.equalsIgnoreCase("n") || !respuesta.equalsIgnoreCase("no") || !respuesta.equalsIgnoreCase("n")  )
					{
						cargarListaProductos(catalogoProductos);
					}
				}

			} while (!posicion.matches("[0-" + tamanioCatalogo + "]"));
		} 
		else
		{
			System.out.println("El catalogo esta vacio :(");
			System.out.println("");
			cargarMenuPrincipal(catalogoProductos);
			
		}
				
	}
}
