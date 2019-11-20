package com.ipartek.buffer;

import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Principal {
	
	public static void main(String[] args) throws IOException {
		
		ArrayList<Persona> listaPersona = new ArrayList<Persona>();
		
		listaPersona.add(new Persona("Endika", "Zuazo", "87845489G"));
		listaPersona.add(new Persona("Jon", "Mendezona", "87845489G"));
		listaPersona.add(new Persona("Jokin", "Ortiveros", "87845489G"));
		listaPersona.add(new Persona("Arkaitz", "Mañas", "87845489G"));
		listaPersona.add(new Persona("Iñigo", "Hernandez", "87845489G"));
	    
	    try {
	    	
	    	FileWriter writer = new FileWriter("C:\\workspace\\cursoIpartekEndika\\POO\\fichero1.txt");
			for(int i = 0; i < listaPersona.size(); i++)
			{
				writer.write(listaPersona.get(i).toString() + "\n");
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    
	    try {
			
	    	FileReader reader = new FileReader("C:\\workspace\\cursoIpartekEndika\\POO\\fichero1.txt");
	    	int valor = reader.read();
	    	if(valor != -1)
	    	{
	    		
	    	}
	    	
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}

}
