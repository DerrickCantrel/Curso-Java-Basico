package com.derrick.cursojava.aula19.labs;

import java.util.Scanner;

public class exer16 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int soma = 0;
		int igual = 0;
		int media = 0;
		int qtd = 0;
		double[]A = new double[10];
		
		for (int i = 0; i < A.length; i++) {
			System.out.println("Digite um valor: ");
			A[i] = sc.nextDouble();
			if (A[i] < 15) { 
				soma += A[i];
			}
			if (A[i] == 15) {
				igual++;
			}
			if (A[i] > 15) {
				media += A[i];
				qtd++;
			}
		}
		
		media = media / qtd;
		
		if(soma > 0) {
			System.out.println("A soma do elementos menores que 15, é igual a: " + soma);
		}
		if (igual > 0) {
			System.out.println("A quantidade do elementos iguais a 15, é igual a: " + igual);
		}
		if (qtd > 0) {
			System.out.println("A média do elementos maiores que 15, é igual a: " + media);
		}
	}

}
