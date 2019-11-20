package com.ipartek.strings;

public class ClaseString {

	public static void main(String[] args) {
		
		String nombre1 = "Alfonso";
		String nombre2 = "Julia Josefa";
		String nombre3 = "Humberto";
		String nombre4 = "Albertosol";
		
		String frase1 = "en un lugar de la mancha de cuyo nombre no quiero acordarme";
		String frase2 = "tres tristes tigres tragaban trigo en un trigal";
		String frase3 = "Allí si María avisa y así va a ir a mi silla.";
		String frase4 = "Alli si Maria avisa y asi va a ir a mi silla.";
		
		//1.	Sacar la longitud de los nombres de la cuatro variables nombreX en una línea cada una
		
		
		System.out.println("La longitud del nombre '" + nombre1 + "' es " + nombre1.length());
		System.out.println("La longitud del nombre '" + nombre2 + "' es " + (nombre2.length()-1));
		System.out.println("La longitud del nombre '" + nombre3 + "' es " + nombre3.length());
		System.out.println("La longitud del nombre '" + nombre4 + "' es " + nombre4.length());
		
		//2.	Sacar las iniciales de las cuatro variables nombreX en pantalla, en una línea cada una
		
		
		System.out.println("Iniciales del nombre '" + nombre1 + "' = " + sacarIniciales(nombre1));
		System.out.println("Iniciales del nombre '" + nombre2 + "' = " + sacarIniciales(nombre2));
		System.out.println("Iniciales del nombre '" + nombre3 + "' = " + sacarIniciales(nombre3));
		System.out.println("Iniciales del nombre '" + nombre4 + "' = " + sacarIniciales(nombre4));
		
		// 3.	Buscar en los cuatro nombres si alguno contiene la cadena de texto “sol”
		
		tieneSol(nombre1);
		tieneSol(nombre2);
		tieneSol(nombre3);
		tieneSol(nombre4);
		
		// 4.	Contar las vocales que hay en la frase uno y mostrarla por pantalla
		
		System.out.println("Numero de vocales que contiene '" + nombre1 + "' = " + contarVocales(nombre1));
		System.out.println("Numero de vocales que contiene '" + nombre2 + "' = " + contarVocales(nombre2));
		System.out.println("Numero de vocales que contiene '" + nombre3 + "' = " + contarVocales(nombre3));
		System.out.println("Numero de vocales que contiene '" + nombre4 + "' = " + contarVocales(nombre4));
		
		// 5.	Reemplazar todas las vocales de la frase1 por la vocal i
		
		reemplazarVocalesPorI(nombre1);
		reemplazarVocalesPorI(nombre2);
		reemplazarVocalesPorI(nombre3);
		reemplazarVocalesPorI(nombre4);
		
		// 6.	Convertir la frase2 en mayúsculas
		
		convertirMayus(frase2);
		
		//7.	Comprobar si la frase3 es palíndroma. Una frase palíndroma es aquella que sin espacios puede leerse igual al derecho que al revés. 
		//			a.	“Anita lava la tina” se quedaría en “Anitalavalatina”. Se recomienda poner todo en minúsculas: “anitalavalatina”. 
		// 			Se invierte la frase, recorriendo la frase sin espacios al revés, copiando carácter a carácter en un string nuevo, 
		
		esPalindromo(frase4);
		

	}
	
	public static String sacarIniciales (String nombre) 
	{
		
		String iniciales = "";
		
		if(nombre.contains(" ")) 
		{
			
			String[] partesNombre = nombre.split(" ");
			
			for(int i = 0; i < partesNombre.length; i++) 
			{
				iniciales += partesNombre[i].charAt(0) + ". ";
			}
			
		} 
		else 
		{
			iniciales += nombre.charAt(0) + ".";
		}
		
		return iniciales;
		
	}
	
	public static void tieneSol (String nombre) {
		
		if(nombre.contains("sol"))
		{
			System.out.println("El nombre " + nombre + " contiene 'sol'. Su posicion es " + nombre.indexOf("sol"+1));
			
		}
		else
		{
			System.out.println("El nombre " + nombre + " no contiene 'sol'");
		}
		
	}
	
	public static int contarVocales(String nombre) 
	{
		
		int numVocales = 0;
		
		for (int i = 0; i < nombre.length(); i++)
		{
			if(nombre.charAt(i) == 'a' || nombre.charAt(i) == 'e' || nombre.charAt(i) == 'i' || nombre.charAt(i) == 'o' 
				|| nombre.charAt(i) == 'u' ||nombre.charAt(i) == 'A' || nombre.charAt(i) == 'E' || nombre.charAt(i) == 'I' 
				|| nombre.charAt(i) == 'O' || nombre.charAt(i) == 'U')
			{
				numVocales++;
			}
		}
	
		return numVocales;

	}
	
	public static void reemplazarVocalesPorI(String nombre) 
	{
		
		int numVocales = 0;
		
		String nombreTemp = "";
		
		for (int i = 0; i < nombre.length(); i++)
		{
			if(nombre.charAt(i) == 'a' || nombre.charAt(i) == 'e' || nombre.charAt(i) == 'o' 
				|| nombre.charAt(i) == 'u' ||nombre.charAt(i) == 'A' || nombre.charAt(i) == 'E' 
				|| nombre.charAt(i) == 'O' || nombre.charAt(i) == 'U')
			{
				nombreTemp += "i";
			}
			else
			{
				nombreTemp += nombre.charAt(i);
			}
		} 
		
		
		
		System.out.println(nombreTemp);

	}
	
	public static void convertirMayus (String frase)
	{
		
		String fraseTemp = frase;
		
		System.out.println(fraseTemp.toUpperCase());
		
	}
	
	public static void esPalindromo (String frase)
	{
		
		// Se podria quitar los puntos y los espacios con el metodos .replace de String. Ej: frase.replace(" ", ""), frase.replace(".", "")
		
		String fraseTemp = frase.replace(".", "");
		
		String[] partesFrase = fraseTemp.toLowerCase().split(" ");
		
		String fraseSinEspaciosMin = "";
		
		for (int i = 0; i < partesFrase.length; i++)
		{
			fraseSinEspaciosMin += partesFrase[i];
		}
		
		System.out.println(fraseSinEspaciosMin);
		
		String fraseAlReves = "";
		
		for(int i = fraseSinEspaciosMin.length()-1; i >= 0; i--)
		{
			fraseAlReves += fraseSinEspaciosMin.charAt(i);	
		}
		
		System.out.println(fraseAlReves);
		
		if(fraseSinEspaciosMin.equals(fraseAlReves)) {
			
			System.out.println("La frase " + "'" + fraseTemp + "' es palindroma.");
			
		}
		
	}

}
