package view;

import java.util.ArrayList;
import java.util.Scanner;

import model.Contacto;
import model.Empresa;

public class Exec {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		Contacto[] arrayContactos = new Contacto[10];
		Empresa[] arrayEmpresas = new Empresa[6];
		arrayEmpresas[0] = new Empresa("aaaaa", "aaaaa", "aaaaa");
		arrayEmpresas[1] = new Empresa("bbbbb", "bbbbb", "bbbbb");
		arrayEmpresas[2] = new Empresa("ccccc", "ccccc", "ccccc");
		arrayEmpresas[3] = new Empresa("ddddd", "ddddd", "ddddd");
		arrayEmpresas[4] = new Empresa("eeeee", "eeeee", "eeeee");
		arrayEmpresas[5] = new Empresa("SKY-net", "fffff", "fffff");
		
		int indexContasto = 0;
		for (Contacto contacto : arrayContactos) {
			contacto = new Contacto();
		}
		
		int contador = 0;
		
		boolean quiereContinuar = false;
		
		
		do 
		{
			System.out.println("///// Introduzca un nuevo contacto /////");
			System.out.println("");
			
			Contacto contacto = new Contacto();
			
			Scanner sc = new Scanner(System.in);
			
			System.out.println("Introduce el nombre del contacto: ");
			
			contacto.setNombre(sc.nextLine());
			
			sc.reset();
			
			System.out.println("Introduce los apellidos del contacto: ");
			
			contacto.setApellidos(sc.nextLine());
			
			sc.reset();
			
			System.out.println("Introduce el fecha nacimiento (dd/mm/aa) del contacto: ");
			
			contacto.setFechaNacimiento(sc.nextLine());
			
			sc.reset();
			
			System.out.println("Introduce el email del contacto: ");
			
			contacto.setEmail(sc.nextLine());
			
			arrayContactos[contador] = contacto;
			
			sc.reset();
			
			System.out.println("¿Desea introducir un nuevo contacto? s/n o si/no");
			
			String respuesta = sc.nextLine();
			
			if(respuesta.isEmpty() == false) {
				
				if(respuesta.equals("si") || respuesta.equals("s"))
				{
					quiereContinuar = true;
					contador++;
				} 
				
				if(respuesta.equals("no") || respuesta.equals("n"))
				{
					quiereContinuar = false;
					for (Contacto contac : arrayContactos) {
						
						if(!contac.getNombre().isEmpty() || !contac.getApellidos().isEmpty() || !contac.getEmail().isEmpty() || !contac.getTelefono().isEmpty())						
						contac.mostrarDatos();
					}
				} 	
			}
			
			/*
			
			while(respuesta.isEmpty() == true || !respuesta.equals("si") || !respuesta.equals("s") || !respuesta.equals("no")|| !respuesta.equals("n"))
			{
				System.out.println("¿Desea introducir un nuevo contacto? s/n o si/no");
				sc.reset();
				respuesta = sc.nextLine();
				
			}	
			
				*/
			
		} while(quiereContinuar == true && contador < arrayContactos.length);
	
		int indexEmpresas = 0;
		for (Empresa empresa : arrayEmpresas) {
			if(empresa.getNombre().equals("SKY-net")) {
				System.out.println("La posicion dentro del array de la empresa SKY-net es " + indexEmpresas);
			}
			indexEmpresas++;
		}
		
	}

}
