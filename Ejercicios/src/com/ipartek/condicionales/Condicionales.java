package com.ipartek.condicionales;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Condicionales {

	public static void main(String[] args) {
		
		//Ejercicio 1
		
		int numeroA = 5;
		int numeroB = 6;
		
		if(numeroA == numeroB) 
		{
		
			System.out.println(numeroA + " y " + numeroB + " son iguales");

		} else 
		{
		
			if(numeroA < numeroB) 
			{
				System.out.println(numeroB + "es mayor que " + numeroA);
				
			} else
			{
				System.out.println(numeroA + " es mayor que " + numeroB);
			}
			
		}
		
		//Ejercicio 2
		
		System.out.println();
		System.out.println("////////////////////////////////");
		System.out.println("Ejercicio 2");
		System.out.println();
		
		Scanner scanner2 = new Scanner(System.in);
		
		System.out.println("Introduce un numero: ");

		int numero = scanner2.nextInt();

		if( numero % 2 == 0) 
		{
			System.out.println("El numero es par");
		} 
		else 
		{
			System.out.println("El numero es impar");
		}
		
		//Ejercicio 3
		
		System.out.println();
		System.out.println("////////////////////////////////");
		System.out.println("Ejercicio 3");
		System.out.println();
		
		Scanner scanner3 = new Scanner(System.in);
		
		System.out.println("Introduce la hora actual sin los minutos: ");

		int horaIndicada = scanner3.nextInt();
		
		if(horaIndicada >= 6 && horaIndicada <= 12)
		{
			System.out.println("Hora actual: " + horaIndicada + ". Buenos dias.");
		}
		
		if(horaIndicada >=13  && horaIndicada <= 20)
		{
			System.out.println("Hora actual: " + horaIndicada + ". Buenas tardes.");
		}
		
		if(horaIndicada >= 21 || horaIndicada <= 5)
		{
			System.out.println("Hora actual: " + horaIndicada + ". Buenas noches.");
		}
		
		//Ejercicio 4
		
		System.out.println();
		System.out.println("////////////////////////////////");
		System.out.println("Ejercicio 4");
		System.out.println();
		
		Scanner scanner4 = new Scanner(System.in);
		
		System.out.println("Introduce un numero de 1 al 7: ");

		int diaSemana = scanner4.nextInt();
		/*
		if(diaSemana == 1)
		{
			System.out.println("Es lunes.");
		} else if (diaSemana == 2){
			System.out.println("Es martes.");
		} else if (diaSemana == 3){
			System.out.println("Es miercoles.");
		} else if (diaSemana == 4){
			System.out.println("Es jueves.");
		} else if (diaSemana == 5){
			System.out.println("Es viernes.");
		} else if (diaSemana == 6){
			System.out.println("Es sabado.");
		} else if (diaSemana == 7){
			System.out.println("Es domingo.");
		} 
		*/
		
			switch (diaSemana) {
			case 1:
				System.out.println("Es lunes.");
				break;
			case 2:
				System.out.println("Es martes.");
				break;
			case 3:
				System.out.println("Es miercoles.");
				break;
			case 4:
				System.out.println("Es jueves.");
				break;
			case 5:
				System.out.println("Es viernes.");
				break;
			case 6:
				System.out.println("Es sabado.");
				break;
			case 7:
				System.out.println("Es domingo.");
				break;
			default:
				System.out.println("El valor introducido no es valido");
				break;
			}
		
		
		//Ejercicio 5
		
		System.out.println();
		System.out.println("////////////////////////////////");
		System.out.println("Ejercicio 5");
		System.out.println();
		
		float nota1 = 4.7f;
		float nota2 = 7.6f;
		float nota3 = 5.5f;
		
		float sumaNotas = nota1+nota2+nota3;
		
		float media = sumaNotas / 3;
		
		if(media >= 0.0f && media < 5.0f) 
		{
			System.out.println("La media de la nota es " + media + ". INSUFICIENTE");
		} else if (media > 5 && media < 6) {
			System.out.println("La media de la nota es " + media + ". SUFICIENTE");
		} else if (media > 6 && media < 7) {
			System.out.println("La media de la nota es " + media + ". BIEN");
		}else if (media > 7 && media < 9) {
			System.out.println("La media de la nota es " + media + ". NOTABLE");
		} else if (media > 9 && media <= 10) {
			System.out.println("La media de la nota es " + media + ". SOBRESALIENTE");
		}
		
		//Ejercicio 6
		
		System.out.println();
		System.out.println("////////////////////////////////");
		System.out.println("Ejercicio 6");
		System.out.println();
		
		
		Scanner scanner61 = new Scanner(System.in);
		
		System.out.println("Introduce el numero A: ");
		
		int numeroScanA = Integer.parseInt(scanner61.nextLine());
		
		Scanner scanner62 = new Scanner(System.in);
		
		System.out.println("Introduce el numero B: ");
		
		int numeroScanB = Integer.parseInt(scanner62.nextLine());
		
		Scanner scanner63 = new Scanner(System.in);
		
		System.out.println("Introduce el numero C: ");
		
		int numeroScanC = Integer.parseInt(scanner63.nextLine());
		
		ArrayList<Integer> arrayNumeros = new ArrayList<Integer>();		
		arrayNumeros.add(numeroScanA);
		arrayNumeros.add(numeroScanB);
		arrayNumeros.add(numeroScanC);
		
		Collections.sort(arrayNumeros);
		System.out.println(arrayNumeros.get(0) + ", " + arrayNumeros.get(1) + ", " + arrayNumeros.get(2));
		
		
	}

}
