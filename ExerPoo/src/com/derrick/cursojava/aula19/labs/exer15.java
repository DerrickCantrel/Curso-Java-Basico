package com.derrick.cursojava.aula19.labs;

import java.util.Scanner;

public class exer15 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int impar = 0;
		int par = 0;
		double[]A = new double[10];
		
		for (int i = 0; i < A.length; i++) {
			System.out.println("Digite um valor: ");
			A[i] = sc.nextDouble();
			if (A[i] % 2 != 0) { 
				impar++;
			} else {
				par++;
			}
		}
		
		if (impar > 0) {
			System.out.println("O percentual dos elementos ímpares: " + (impar*10) + "%");
		} else {
			System.out.println("O percentual dos elementos ímpares: 0%");
		}
		if (par > 0) {
			System.out.println("O percentual dos elementos pares: " + (par*10) + "%");
		} else {
			System.out.println("O percentual dos elementos ímpares: 0%");
		}
		
	}

}
