package com.derrick.cursojava.aula34;

public class TesteMinhaCalculadora {

	static int resultado;
	
	public static void main(String[] args) {
		
		//MinhaCalculadora calc = new MinhaCalculadora();
		
		//calc.soma(3, 5);
		//calc.soma(3.0, 5.0);
		
		resultado = MinhaCalculadora.soma(5, 5);
		
		System.out.println(soma2Valores(2, 1));
	}
	
	static int soma2Valores(int num1, int num2) {
		return MinhaCalculadora.soma(num1, num2);
	}
}
