package com.ipartek.clases;

import java.util.Scanner;

public class Auxiliar {
	
	// Este metodo se encarga de recibir valores por teclado y devolver dichos valores en un string
	
	public static String leerTeclado()
	{
		String resultado = "";
		
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		
		resultado = sc.nextLine();	
		
		return resultado;
	}

}
