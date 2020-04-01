package com.derrick.cursojava.aula34.labs;

public class Calculadora {
	
	public static int soma(int num1, int num2) {
		return num1 + num2;
	}
	
	public static int subtr(int num1, int num2) {
		return num1 - num2;
	}
	
	public static double divi(int num1, int num2) {
		return num1/num2;
	}
	
	public static int multi(int num1, int num2) {
		return num1 * num2;
	}
	
	// Método Estático para Potencia
	public static int poten(int num1, int num2) {
		int aux = num1;
		for (int i = 1; i < num2; i++) {
			num1 = num1 * aux;
		}
		return num1;
	}
}
