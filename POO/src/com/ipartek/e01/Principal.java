package com.ipartek.e01;

public class Principal {

	public static void main(String[] args) {
		
		Botella[] arrayBotellas = new Botella[3];
		
		for (int i = 0; i < arrayBotellas.length; i++) {
			Tamanio tam =  new Tamanio(15,5,5);
			Material mat = new Material("PET", true);
			arrayBotellas[i] = new Botella(tam,mat,500,47,false);
		}
		
		System.out.println(arrayBotellas[0].mostrarDatos());
		
	}

}
