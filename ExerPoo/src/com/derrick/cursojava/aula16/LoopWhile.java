package com.derrick.cursojava.aula16;

public class LoopWhile {

	public static void main(String[] args) {

		int i = 0;
		int max = 10;

		System.out.println("Contando até " + max);		
		
		//Avalia a expressão no Inicio e executa o bloco de código
		while (i <= max) {
			System.out.println("Valor de i: " + i);
			i++;
		}

		System.out.println(i); // 11 

		// Avalia a expressão no final e executa o bloco de código
		do { 
		   i++;
		   System.out.println("Valor de i: " + i);
		} while ( i < 15);
	
		System.out.println(i); // 15 
	}		

}