package com.derrick.cursojava.aula19.labs;

import java.util.Scanner;

public class exer18 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		double maior = 0;
		double[]A = new double[10];
		
		for (int i = 0; i < A.length; i++) {
			System.out.println("Informe uma idade: ");
			A[i] = sc.nextDouble();
		}
		
		System.out.print("Desordenado: ");
		
		for (Double i : A) {                     
			System.out.print(i + " ");
		}
		
		for (int j = 0; j < A.length-1; j++) {
			for (int i = 0; i < A.length; i++) {
				if (A[i] > A[j+1]) {
					maior = A[i];
					A[i] = A[j+1];
					A[j+1] = maior;
				}
			}
		}
		
		System.out.print("Ordenado: ");
		for (Double i : A) {            
			System.out.print(i + " ");
		}
		
		System.out.println("Maior Idade: " + A[A.length-1] + " V[9]");
		System.out.println("Menor Idade: " + A[0] + " V[0]");
		
		// TESTE
		// 72 71 68 87 63
		// 90 91 87 67 82
		
	}

}
