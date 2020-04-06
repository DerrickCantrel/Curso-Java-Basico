package com.derrick.cursojava.aula63;

public class ExemploPrintf {

	public static void main(String[] args) {
		
		//Formato de String
		System.out.printf("%s", "Olá, Mundo!");
		System.out.println();
		//Formato de String - UperCase
		System.out.printf("%S", "Olá, Mundo!");
		System.out.println();

		//Formato de Char
		System.out.printf("%c", 'c');
		System.out.println();
		//Formato de Char - UperCase
		System.out.printf("%C", 'c');
		
		//Quebra de linha
		System.out.printf("%n");

		int valor = 123456789;
		//Formatação para valores Inteiros
		System.out.printf("%d", valor);

		System.out.println();

		double pontoFlutuante = 3.1456789;
		//Formatação para valores com ponto flutuante (Double/Float)
		System.out.printf("%f", pontoFlutuante);

		System.out.println();

		String olaMundo = "Olá, Mundo!";
		//Adicionar caracteres antes da String
		System.out.printf("%20s", olaMundo);

		System.out.println();
		//Adicionar caracteres depois da String
		System.out.printf("%-20s", olaMundo);

		System.out.println();
		//Mostra "+" se o valor for positovo
		System.out.printf("%+d", valor);

		System.out.println();
		//Adicionar "0" para completar a qntd de números do valor
		System.out.printf("%015d", valor);

		System.out.println();
		//Separa as casas de milhares
		System.out.printf("%,d", valor); //usem ,

		System.out.println();

		int valor2 = -123456789;
		//Mostra "-" se o valor for negativo
		System.out.printf("% d", valor2);
		System.out.println();
		//Mostra " " se o valor for positivo
		System.out.printf("% d", valor);

		System.out.println();
		//Formata a qntd de numero que deve ser exibido depois do ponto flutuante
		System.out.printf("%.3f", pontoFlutuante);

		System.out.println();
		//Formata a qntd de numeros que deve ser exibido antes do valor
		System.out.printf("R$%10.2f", pontoFlutuante);

		System.out.println();

		testeMaisCompleto();
	}

	private static void testeMaisCompleto(){

		double[] precos = {10000, 123.54, 7843.567, 1, 4.56789};

		for (int i=0; i<precos.length; i++){
			System.out.printf("%s %02d: total de R$%,10.2f%n", "Item", i+1, precos[i]);
		}

		//Java.util.Formater
	}

}
