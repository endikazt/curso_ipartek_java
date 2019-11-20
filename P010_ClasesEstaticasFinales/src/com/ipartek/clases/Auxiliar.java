package com.ipartek.clases;

import java.util.Scanner;

public class Auxiliar {

	public static String leerTeclado()
	{
		String resultado = "";
		
		Scanner sc = new Scanner(System.in);
		
		resultado = sc.nextLine();	
		
		return resultado;
	}

}
