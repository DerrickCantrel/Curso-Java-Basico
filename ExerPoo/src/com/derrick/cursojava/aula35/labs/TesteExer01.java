package com.derrick.cursojava.aula35.labs;

public class TesteExer01 {

	public static void main(String[] args) {
		
		int resultado = Exer01.fibonacciR(7);
		System.out.println(resultado);
		
		for (int i = 0; i < 10; i++) {
			resultado = Exer01.fibonacciR(i);
			System.out.print(resultado + " ");
		}
	}

}
