package com.ipartek.herencia;

public class Principal {

	public static void main(String[] args) {
		
		Animal[] listaAnimales = new Animal[5];
		
		Animal animal1 = new Animal('m',4,55);
		
		Animal animal2 = new Animal('h',4,49);
		
		Mamifero mamifero1 = new Mamifero('h',4,8,"negro",(byte)8);
		
		Animal mamifero2 = new Mamifero('m',4,9,"canela",(byte)6);
		
		Pez pez1 = new Pez('m',6,200,true,"rojo");
		
		listaAnimales[0] = animal1;
		listaAnimales[1] = animal2;
		listaAnimales[2] = mamifero1;
		listaAnimales[3] = mamifero2;
		listaAnimales[4] = pez1;
		
		int indexListaAnimales = 0;
		
		for(Animal elementoDeLaLista: listaAnimales)
		{
			if(elementoDeLaLista instanceof Pez)
			{
				System.out.println("El elemento de la posicion " + (indexListaAnimales+1)  + " es un pez.");
			}
			
			indexListaAnimales++;
		}

	}

}
