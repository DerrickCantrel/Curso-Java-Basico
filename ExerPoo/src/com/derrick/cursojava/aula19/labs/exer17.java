package com.derrick.cursojava.aula19.labs;

import java.util.Scanner;

public class exer17 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int qtd = 0;
		double[]A = new double[10];
		
		for (int i = 0; i < A.length; i++) {
			System.out.println("Informe uma idade: ");
			A[i] = sc.nextDouble();
			if (A[i] > 35) { 
				qtd++;
			}
		}
		System.out.println("Qtd de pessoas com idade maior que 35: " + qtd);
	}

}
