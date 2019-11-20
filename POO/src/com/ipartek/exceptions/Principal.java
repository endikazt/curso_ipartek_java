package com.ipartek.exceptions;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Principal {
	
	public static void main(String[] args) {
		
		//ejercicio1();
		//ejercicio2();
		//ejercicio3("La lluvia en Sevilla no es una maravilla", 50);
		//ejercicio4();
		//ejercicio5();
		ejercicio6();
	}
	
	public static void ejercicio1()
	{
		
		Scanner sc = new Scanner(System.in);
		int numeroA = 0;
		int numeroB = 0;
		int resultado = 0;

		try 
		{	
			System.out.println("Introduce un numero por teclado: ");
			numeroA = Integer.parseInt(sc.nextLine());
			
			System.out.println("Introduce otro numero por teclado: ");
			numeroB = Integer.parseInt(sc.nextLine());
			
			resultado = numeroA/numeroB;	
			
			System.out.println("El resultado de la division entre " + numeroA + " y " + numeroB + " es " + resultado);
			
		} catch (ArithmeticException ae) {
			System.out.println("Parece que algo ha fallado. Error: " + ae);	
		} catch (Exception e) {
			System.out.println("Parece que algo ha fallado. Error: " + e);
		}
		
	}
	
	public static void ejercicio2()
	{
		
		Scanner sc = new Scanner(System.in);
		float numeroA = 0;
		float numeroB = 0;
		float resultado = 0;
		boolean continuar = true;
		
		do
		{
	
			try {
				
				System.out.println("Introduce un numero por teclado: ");
				numeroA = Integer.parseInt(sc.nextLine());
				continuar = true;	
				
			} catch (Exception e) {
				continuar = false;				
			}
		} while(continuar == false);
		
		
		do
		{
		
			try 
			{			
				System.out.println("Introduce otro numero por teclado: ");
				numeroB = Integer.parseInt(sc.nextLine());
				continuar = true;		
					
			} catch (ArithmeticException ae) {
				continuar = false;
			} catch (Exception e) {
				continuar = false;
			}
		}while(continuar == false);
		
		try {
			
			resultado = numeroA/numeroB;	
			
			System.out.println("El resultado de la division entre " + numeroA + " y " + numeroB + " es " + resultado);
			
		} catch (ArithmeticException ae) {
			System.out.println("Parece que algo ha fallado. Error: " + ae);	
		}
	}
	
	public static void ejercicio3(String texto, int posicion){
		
		System.out.println("Texto: " + texto);
		
		try {
			System.out.println("La letra de la poscion " + posicion + " es " + texto.charAt(posicion));	
			
		}catch (NullPointerException nulle) {	
			System.out.println("Error. No puedes introducir un string sin inicializar");
			Scanner sc = new Scanner(System.in);
			ejercicio3(sc.nextLine(), posicion);	
		} catch (NumberFormatException nume) {
			System.out.println("Error. Tienes que introducir una posicion valida entre 0 y " + (texto.length()-1));
			Scanner sc = new Scanner(System.in);
			ejercicio3(texto, Integer.parseInt(sc.nextLine()));	
		} catch (StringIndexOutOfBoundsException se) {
			System.out.println("Error. Tienes que introducir una posicion valida entre 0 y " + (texto.length()-1));
			Scanner sc = new Scanner(System.in);
			ejercicio3(texto, Integer.parseInt(sc.nextLine()));	
		} catch (Exception e) {
			System.out.println("Parece que algo ha fallado. Error: " + e);	
		}	
		
	}
	
	public static void ejercicio4()
	{
		
		ArrayList<Persona> listaPersonas = new ArrayList<Persona>();
		
		for(int i = 0; i < 3; i++)
		{
			listaPersonas.add(new Persona());
		}
		
		for(int i = 0; i < listaPersonas.size(); i++) {
			
			String nombre;
			int edad;
			
			try {
				Scanner sc = new Scanner(System.in);
				System.out.println("Introduce el nombre de la persona");
				nombre = sc.nextLine();
				System.out.println("Introduce la edad de la persona");
				edad = Integer.parseInt(sc.nextLine());
				listaPersonas.get(i).setEdad(edad);
				listaPersonas.get(i).setNombre(nombre);	
			} catch (Exception e) {
				System.out.println("Parece que algo ha fallado. Error: " + e);	
			}
			
		}
		
		for(int i = 0; i < listaPersonas.size(); i++)
		{
			System.out.println("Poscion " + i + ": " + listaPersonas.get(i).toString());
		}

	}
	
	public static void ejercicio5()
	{
		
		int numeroRandom = (int) (Math.random() * 6) + 1;
		
		try {
			
			switch (numeroRandom) {
			case 1:
				throw new ArithmeticException();
			case 2:
				throw new NullPointerException();
			case 3:
				throw new NumberFormatException();
			case 4:
				throw new SecurityException();
			case 5:
				throw new NegativeArraySizeException();
			case 6:
				throw new IOException();
			default:
				break;
			}
			
		} catch (Exception e) {
			System.out.println("Valor de numeroRandom: " + numeroRandom + ". Error:  " + e);
			ejercicio5();
		}
		
	}
	
	public static void ejercicio6()
	{
		
		ArrayList<Paciente> listaPecientes = new ArrayList<Paciente>();
		
		Paciente paciente = new Paciente();
		float altura;
		float peso;
		boolean piesPlanos;
		
		Scanner sc = new Scanner(System.in);
		
		do {
			try 
			{			
				System.out.println("Introduce la altura del paciente ");
				altura = Float.parseFloat(sc.nextLine());
				paciente.setAltura(altura);
		
				System.out.println("Introduce el peso del paciente ");
				peso = Float.parseFloat(sc.nextLine());
				paciente.setPeso(peso);
				
				System.out.println("¿Tiene pies planos? true/false: ");
				piesPlanos = sc.nextBoolean();
				paciente.setPiesPlanos(piesPlanos);
				
				System.out.println("Introduce el angulo de vision (Snellen): ");
				paciente.getVision().setAngulo(Integer.parseInt(sc.nextLine()));
	
			} catch (ExcepcionListaNegra eln) {
				System.out.println("Parece que algo ha fallado. Error: " + eln);	
			} catch (Exception e) {
				System.out.println("Parece que algo ha fallado. Error: " + e);
			}
		} while (sc.nextLine().equals("salir"));
		
	}

}
