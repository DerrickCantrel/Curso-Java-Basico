package com.derrick.cursojava.aula17;

public class LoopFor {

	public static void main(String[] args) {
	
	for (int i = 0; i < 5; i++) {
	  System.out.println("i tem valor: " + i);
	}	
	
	for (int i = 5; i > 5; i--) {
	  System.out.println("i tem valor: " + i);
	}

	// For com mais de uma váriavel
	for (int i = 0, j = 10 ; i < j; i++, j--) {
	  System.out.println("i = " + i + "; j = " +j);
	}	
	
	//For com partes ausentes
	int count = 0;
	for (; count < 10; count++) {
	  System.out.println("Count tem valor: " + count);
	  count += 2;
	}
	
	for (int cont = 0; cont < 5; cont += 5) {
	  System.out.println("cont tem valor: " + cont);
	}

	//Loop infinito, não tente.
	for (; ;) {
	}
	
	//For sem chaves considera apenas a primeira instrução, não é recomendavél.
	//for (int i = 0; i < 5; i++)
	//System.out.println("i tem valor: " + i);
	
	
	}
}

//Exercícios: http://www.slideshare.net/loianeg/curso-java-basico-exercicios-aulas-16-17