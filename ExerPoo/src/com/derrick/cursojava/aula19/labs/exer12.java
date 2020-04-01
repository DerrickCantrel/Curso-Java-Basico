package com.derrick.cursojava.aula19.labs;

import java.util.Scanner;

public class exer12 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int soma = 0;
		double[]A = new double[10];
		for (int i = 0; i < A.length; i++) {
			System.out.println("Digite um valor: ");
			A[i] = sc.nextDouble();
			soma += A[i];
		}
		System.out.println("A soma de todos os elementos da lista, é igual a: " + soma);	

	}

}
