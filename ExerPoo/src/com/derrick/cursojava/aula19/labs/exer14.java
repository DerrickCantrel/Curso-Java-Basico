package com.derrick.cursojava.aula19.labs;

import java.util.Scanner;

public class exer14 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int impar = 0;
		int media = 0;
		double[]A = new double[10];
		for (int i = 0; i < A.length; i++) {
			System.out.println("Digite um valor: ");
			A[i] = sc.nextDouble();
			if (A[i] % 2 != 0) { 
				media += A[i];
				impar++;
			}
		}
		media = media / impar;
		System.out.println("A média aritmética de todos os elementos ímpares, é igual a: " + media);	
	}

}
