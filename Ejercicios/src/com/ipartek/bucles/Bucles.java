package com.ipartek.bucles;

import java.util.ArrayList;
import java.util.Scanner;

public class Bucles {

	public static void main(String[] args) {
		
		//1.	Muestra los números múltiplos de 5 de 0 a 100 utilizando un bucle for.
	
		System.out.println("Ejercicio 1");
		System.out.println();
		
		
		for(int i = 0; i <= 100; i++)		
		{
			if(i % 5 == 0) 
			{
				System.out.println(i);
			}
		}
		
		//2.	Muestra los números múltiplos de 5 de 0 a 100 utilizando un bucle while.
		
		System.out.println();
		System.out.println("////////////////////////////////");
		System.out.println("Ejercicio 2");
		System.out.println();
		
		
		int contador2 = 0;
		
		while(contador2 <= 100) {
			
			if(contador2 % 5 == 0) 
			{
				System.out.println(contador2);
			}
			
			contador2++;
			
		}
		
		//3.	Muestra los números múltiplos de 5 de 0 a 100 utilizando un bucle do-while.
		
		System.out.println();
		System.out.println("////////////////////////////////");
		System.out.println("Ejercicio 3");
		System.out.println();
		
		int contador3 = 0;
		
		do 
		{
			if(contador3 % 5 == 0) 
			{
				System.out.println(contador3);
			}
			
			contador3++;
		}
		while (contador3 <= 100);

	
	
	//4.	Muestra los números del 320 al 160, contando de 20 en 20 hacia atrás utilizando un bucle for.
	
		System.out.println();
		System.out.println("////////////////////////////////");
		System.out.println("Ejercicio 4");
		System.out.println();
		
		for(int i = 320; i >= 160;)
		{
			System.out.println(i);
			i = i-20;
		}
		
	// 5.	Realizar un programa que nos permite tener el control de acceso a una caja fuerte, la combinación será un número de 4 cifras. 
	//	El programa nos pedirá la combinación para abrirla. Si no acertamos, se nos mostrará el mensaje “Lo siento, esa no es la combinación” 
	//	y si acertamos se nos dirá “La caja fuerte se ha abierto satisfactoriamente”. Tendremos 4 oportunidades para abrir la caja fuerte.
		
		System.out.println();
		System.out.println("////////////////////////////////");
		System.out.println("Ejercicio 5");
		System.out.println();
		
		int combinacionCaja = 3981;
		int intentos = 1;
		int combinacionIntento = 0;
		

		while (intentos <=4 && combinacionIntento != combinacionCaja) 
		{
			Scanner sc5 = new Scanner(System.in);
			
			System.out.println("Introduce el numero de la caja fuerte: ");
			
			combinacionIntento = Integer.parseInt(sc5.nextLine());
			
			if(combinacionIntento == combinacionCaja)
			{
				System.out.println("La caja fuerte se ha abierto satisfactoriamente");
			}
			else 
			{
				System.out.println("Lo siento, esa no es la combinación");
				intentos++;
			}
						
		}
		
		if(intentos == 4) 
		{
			System.out.println("Has agotado todos los intentos");
		}
		
		// 6.	Muestra la tabla de multiplicar de un número introducido por teclado.
			
			System.out.println();
			System.out.println("////////////////////////////////");
			System.out.println("Ejercicio 6");
			System.out.println();
			
			Scanner sc6 = new Scanner(System.in);
			
			System.out.println("Introduce un numero del 0 al 10: ");
			
			int numeroIntroducido = Integer.parseInt(sc6.nextLine());
			
			if(numeroIntroducido >= 0 && numeroIntroducido <= 10) 
			{
			
				for(int i = 0; i <= 10; i++)
				{
					
					System.out.println(numeroIntroducido + " X " + i + " = " + (numeroIntroducido*i));
					
				}
			}
			else 
			{
				System.out.println("El numero intorducido no esta dentro del rango indicado");
			}
			
		// 7.	Realizar un programa que calcule la media de un conjunto de números positivos introducidos por teclado. 
		// A priori, el programa no sabe cuántos números se introducirán. El usuario indicará que ha terminado de introducir 
		// datos cuando meta un número negativo
			
			System.out.println();
			System.out.println("////////////////////////////////");
			System.out.println("Ejercicio 7");
			System.out.println();
			
			boolean esNegativo = false;
			
			ArrayList<Float> listaNumeros = new ArrayList<Float>();
			
			while (!esNegativo)
			{
				Scanner sc7 = new Scanner(System.in);
				
				System.out.println("Introduce un numero: ");
				
				float numIntroducido = Float.parseFloat(sc7.nextLine());
				
				if (numeroIntroducido < 0) 
				{
					esNegativo = true;
				}
				
			}
			
			float sumaNumerosLista = 0;
			
			for(int i = 0; i < listaNumeros.size(); i++)
			{
				sumaNumerosLista += listaNumeros.get(i);
			}
			
			float mediaNumerosLista = sumaNumerosLista / listaNumeros.size();
			
			System.out.println("Suma de los numeros de lista: " + sumaNumerosLista + ". Media: " + mediaNumerosLista);
			
	}

}
