package com.ipartek.principal;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

import com.ipartek.comparable.Libro;

public class Principal {
	
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		
		ArrayList<Libro> listaLibros = new ArrayList<Libro>();
		
		listaLibros.add(new Libro("Cujo", " Stephen King", 350, true, false));
		listaLibros.add(new Libro("La torre oscura", " Stephen King", 542, true, false));
		listaLibros.add(new Libro("La niebla", " Stephen King", 450, true, false));
		listaLibros.add(new Libro("Metro 2033", "Dmitry Glukhovsky", 324, true, false));
		listaLibros.add(new Libro("La tierra errante", "Cixin Liu", 415, true, false));
		listaLibros.add(new Libro("El problema de los tres cuerpos", "Cixin Liu", 536, true, false));
		listaLibros.add(new Libro("El despertar del leviathan", "James S.A. Corey", 536, true, false));
		listaLibros.add(new Libro("La guerra de Caliban", "James S.A. Corey", 490, true, false));
		listaLibros.add(new Libro("Lad puertas de Abadon", "James S.A. Corey", 480, true, false));
		listaLibros.add(new Libro("La quema de Cibola", "James S.A. Corey", 505, true, false));
		
		Collections.sort(listaLibros);
		
		for(Libro libro : listaLibros)
		{
			System.out.println(libro.toString());
		}
		
		System.out.println("\n///////////////////////////\n");
		
		Collections.shuffle(listaLibros);	
		
		for(Libro libro : listaLibros)
		{
			System.out.println(libro.toString());
		}
		
		System.out.println("\n///////////////////////////\n");
		
		listaLibros.forEach(libro->System.out.println(libro));
	}

}
