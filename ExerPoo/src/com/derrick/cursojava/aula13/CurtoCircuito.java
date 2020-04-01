package com.derrick.cursojava.aula13;

public class CurtoCircuito {

	public static void main(String[] args) {

		boolean verdadeiro = true;
		boolean falso = false;
		boolean resultado1 = falso & 
				verdadeiro;
		boolean resultado2 = falso && //Nesse caso a segunda expressão não é analisado, visto que no AND depende apenas da primeira;
				verdadeiro;
		System.out.println(resultado1);
		System.out.println(resultado2);
		
	}

}
