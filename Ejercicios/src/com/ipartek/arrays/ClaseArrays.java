package com.ipartek.arrays;

public class ClaseArrays {

	public static void main(String[] args) {

		// 1. Define un array de 12 números enteros con nombre num y asigna los valores
		// según la tabla que se muestra a continuación.
		// Muestra el contenido de todos los elementos del array.
		System.out.println("/////////////////////////");
		System.out.println("Ejercicio 1");
		System.out.println("");

		int[] listaNumeros = { 11, 67, 8, 7, 65, 9, 8, 5, 43 };

		for (int i = 0; i < listaNumeros.length; i++) 
		{
			System.out.println(listaNumeros[i]);
		}

		// 2. Escribe un programa que lea 10 números por teclado y que luego los muestre
		// en orden inverso, es decir,
		// el primero que se introduce es el último en mostrarse y viceversa.

		System.out.println("/////////////////////////");
		System.out.println("Ejercicio 2");
		System.out.println("");

		int[] listaNumeros2 = { 11, 67, 8, 7, 65, 9, 8, 5, 43 };

		for (int i = listaNumeros2.length - 1; i > 0; i--) 
		{
			System.out.println(listaNumeros[i]);
		}

		// 3. Define tres arrays de 20 números enteros cada uno, con nombre número,
		// cuadrado y cubo.
		// Cargar el array número con valores aleatorios entre 0 y 100. En el array
		// cuadrado se deben
		// almacenar los cuadrados de los valores que hay en el array número. En el
		// Arrau cubo se deben almacenar
		// los cubos de los valores que hay en número. Mostrar el contenido de los tres
		// arrays.

		System.out.println("/////////////////////////");
		System.out.println("Ejercicio 3");
		System.out.println("");

		int[] numero = new int[20];

		for (int i = 0; i < 20; i++) 
		{

			numero[i] = (int) (Math.random() * 100);

		}

		int[] cuadrado = new int[numero.length];
		int[] cubo = new int[numero.length];

		for (int i = 0; i < numero.length; i++) 
		{
			cuadrado[i] = (numero[i] * numero[i]);
			cubo[i] = (numero[i] * numero[i] * numero[i]);
		}

		String listaNumero = "";
		String listaCuadrado = "";
		String listaCubo = "";

		for (int i = 0; i < numero.length; i++) 
		{
			listaNumero += numero[i] + ", ";
			listaCuadrado += cuadrado[i] + ", ";
			listaCubo += cubo[i] + ", ";
		}

		System.out.println(listaNumero);
		System.out.println(listaCuadrado);
		System.out.println(listaCubo);

		// 4. Realizar un programa que pida 10 números por teclado y que luego muestre
		// los números introducidos,
		// además de mostrar el máximo valor y el mínimo valor al final.

		System.out.println("/////////////////////////");
		System.out.println("Ejercicio 4");
		System.out.println("");

		int[] listaNumeros3 = { 11, 67, 8, 7, 65, 9, 8, 5, 43 };

		int numMax = listaNumeros3[0];
		int numMin = listaNumeros3[0];

		for (int i = listaNumeros3.length - 1; i > 0; i--) 
		{

			if (listaNumeros3[i] > numMax) 
			{
				numMax = listaNumeros3[i];
			}

			if (listaNumeros3[i] < numMin) 
			{
				numMin = listaNumeros3[i];
			}
		}

		System.out.println("Numero Max del array: " + numMax);
		System.out.println("Numero Max del array: " + numMin);

		// 5. Realizar un programa que lea 15 números por teclado y que los almacene en
		// un array.
		// Rote las posiciones de ese array, es decir, el elemento de la posición 0 debe
		// pasar a la posición 1,
		// el de la 1 a la 2 etc. El número que se encuentra en la última posición debe
		// pasar a la posición 0.
		// Finalmente mostrando el contenido del array

		System.out.println("/////////////////////////");
		System.out.println("Ejercicio 5");
		System.out.println("");

		int[] listaNumeros5 = new int[15];
		int[] listaNumeros5Rotado = new int[listaNumeros5.length];

		for (int i = 0; i < listaNumeros5.length; i++) 
		{

			listaNumeros5[i] = (int) (Math.random() * 100);

		}

		for (int i = 0; i < listaNumeros5.length; i++) {
			if (i < listaNumeros5.length - 1) {
				listaNumeros5Rotado[i + 1] = listaNumeros5[i];
			}

			if (i == listaNumeros5.length - 1) {
				listaNumeros5Rotado[0] = listaNumeros5[i];
			}

		}

		String stringNumeros5 = "";
		String stringNumeros5Rotados = "";

		for (int i = 0; i < listaNumeros5.length; i++) 
		{
			stringNumeros5 += listaNumeros5[i] + ", ";
			stringNumeros5Rotados += listaNumeros5Rotado[i] + ", ";
		}

		System.out.println(stringNumeros5);
		System.out.println(stringNumeros5Rotados);

		// 6. Realizar un programa que nos permita introducir 10 números por teclado
		// en un array de 10
		// posiciones y lo ordene en orden creciente. Mostrar finalmente el resultado.

		System.out.println("/////////////////////////");
		System.out.println("Ejercicio 6");
		System.out.println("");

		int[] listaNumeros6 = new int[10];
		int[] listaNumeros6Ordenados = new int[listaNumeros6.length];

		for (int i = 0; i < listaNumeros6.length; i++) 
		{
			listaNumeros6[i] = (int) (Math.random() * 100);

		}
		
		for(int i = 0; i < listaNumeros6.length; i++)
		{
			for (int x = 0; x < listaNumeros6.length; i++)
			{
				if(listaNumeros6[i] < )
			}
		}

	}

}
