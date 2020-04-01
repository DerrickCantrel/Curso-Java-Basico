package com.derrick.cursojava.aula13;

public class OperadoresAritmeticos {

	public static void main(String[] args) {

		int resultado = 1 + 2;
		System.out.println(resultado);
		
		resultado = resultado - 1;
		System.out.println(resultado);

		resultado = resultado * 2;
		System.out.println(resultado);

		resultado = resultado / 2;
		System.out.println(resultado);

		resultado = resultado + 8;
		System.out.println(resultado);

		resultado = resultado % 7;
		System.out.println(resultado);

		String primeiroNome = "Esta é";
		String segundoNome = " uma String concatenada";
		String terceiroNome = primeiroNome + segundoNome;
		System.out.println(terceiroNome);
		
		resultado = resultado + 1;
		System.out.println(resultado);
		
		resultado++;
		System.out.println(resultado);

		System.out.println(resultado++); //Imprime e depois Incrementa
		System.out.println(++resultado); //Adiciona o valor e depois imprime

		resultado--;
		System.out.println(resultado);

		System.out.println(resultado--); //Imprime e depois decrementa o valor;
		System.out.println(--resultado); //Subtrai o valor e depois imprime;
		
		
	}

}
