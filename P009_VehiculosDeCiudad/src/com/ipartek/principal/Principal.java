package com.ipartek.principal;

import com.ipartek.clases.Bici;
import com.ipartek.clases.Coche;
import com.ipartek.clases.Patinete;

public class Principal {
	
	public static void main(String[] args) {
		
		Coche coche = new Coche();
		Bici bici = new Bici();
		Patinete patinete = new Patinete();
		
		coche.Arrancar();
		coche.Acelerar(5);
		System.out.println(coche.toString());
		coche.Acelerar(10);
		System.out.println(coche.toString());
		coche.Acelerar(15);
		System.out.println(coche.toString());
		
	}

}
